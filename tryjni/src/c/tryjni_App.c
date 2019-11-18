
#include <jni.h>
#include <stdio.h>
#include "tryjni_App.h"

//JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jobject obj, jobjectArray left, jobjectArray right) {
JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jclass _, jobjectArray left, jobjectArray right) {

    printf("hello from C!");

    jsize leftX = (*env)->GetArrayLength(env, left);
    jsize rightX = (*env)->GetArrayLength(env, right);
    if (leftX <= 0 || rightX <= 0) {
        printf("empty input");
        return NULL;
    }
    jdoubleArray leftRow = (jdoubleArray) (*env)->GetObjectArrayElement(env, left, 0);
    jsize leftY = (*env)->GetArrayLength(env, leftRow);
    jdoubleArray rightRow = (jdoubleArray) (*env)->GetObjectArrayElement(env, right, 0);
    jsize rightY = (*env)->GetArrayLength(env, rightRow);

    //TODO @mark: doesn't work yet: https://gamedev.stackexchange.com/a/96958/48705
    jclass doubleArray2DClass = env->FindClass("[[D");
    jobjectArray output = env->NewObjectArray(leftX, doubleArray2DClass, NULL);
    for (int i = 0; i < leftX; i++) {
        jdoubleArray row = env->NewObjectArray(rightY, jdoubleArray, NULL);
    }

//    for (int i = 0; i < leftX; i++) {
//        jdoubleArray arr = (jdoubleArray) (*env)->GetObjectArrayElement(env, left, i);
//        jsize leftY = (*env)->GetArrayLength(env, arr);
//        jdouble* vals = (*env)->GetDoubleArrayElements(env, arr, NULL);
//
//        /* make changes to 'vals' */
//
//        (*env)->ReleaseDoubleArrayElements(env, arr, vals, JNI_COMMIT);
//        (*env)->DeleteLocalRef(env, arr);
//    }

    return NULL;
}

//int main() {
//    printf("hello world");
//}
