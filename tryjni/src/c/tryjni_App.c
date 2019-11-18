
#include <jni.h>
#include <stdio.h>
#include "tryjni_App.h"

//JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jobject obj, jobjectArray left, jobjectArray right) {
JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jclass _, jobjectArray left, jobjectArray right) {

    printf("hello from C!");

    jsize leftX = (*env)->GetArrayLength(env, left);

    for (int i = 0; i < leftX; i++) {
        jdoubleArray arr = (jdoubleArray) (*env)->GetObjectArrayElement(env, left, i);
        jsize leftY = (*env)->GetArrayLength(env, arr);
        jdouble* vals = (*env)->GetDoubleArrayElements(env, arr, NULL);

        /* make changes to 'vals' */

        (*env)->ReleaseDoubleArrayElements(env, arr, vals, JNI_COMMIT);
        (*env)->DeleteLocalRef(env, arr);
    }

    return NULL;
}

//int main() {
//    printf("hello world");
//}
