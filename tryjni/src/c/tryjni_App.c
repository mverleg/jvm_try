
#include <jni.h>
#include <stdio.h>
#include "tryjni_App.h"

JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jobject obj, jobjectArray left, jobjectArray right) {
//JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jclass jcls, jobjectArray left, jobjectArray right) {
    printf("hello from C!");
    return NULL;
}

//int main() {
//    printf("hello world");
//}
