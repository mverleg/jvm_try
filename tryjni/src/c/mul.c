
#include "tryjni_App.h"

JNIEXPORT jobjectArray JNICALL Java_tryjni_App_mul22(JNIEnv *env, jclass jcls, jobjectArray left, jobjectArray right) {
    printf("hello from C!");
    return NULL;
}

//int main() {
//    printf("hello world");
//}
