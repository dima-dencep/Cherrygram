// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.


// This file is autogenerated by
//     third_party/jni_zero/jni_generator.py
// For
//     org/webrtc/MediaStreamTrack

#ifndef org_webrtc_MediaStreamTrack_JNI
#define org_webrtc_MediaStreamTrack_JNI

#include <jni.h>

#include "third_party/jni_zero/jni_export.h"
#include "webrtc/sdk/android/src/jni/jni_generator_helper.h"


// Step 1: Forward declarations.

JNI_ZERO_COMPONENT_BUILD_EXPORT extern const char kClassPath_org_webrtc_MediaStreamTrack[];
const char kClassPath_org_webrtc_MediaStreamTrack[] = "org/webrtc/MediaStreamTrack";

JNI_ZERO_COMPONENT_BUILD_EXPORT extern const char
    kClassPath_org_webrtc_MediaStreamTrack_00024MediaType[];
const char kClassPath_org_webrtc_MediaStreamTrack_00024MediaType[] =
    "org/webrtc/MediaStreamTrack$MediaType";

JNI_ZERO_COMPONENT_BUILD_EXPORT extern const char
    kClassPath_org_webrtc_MediaStreamTrack_00024State[];
const char kClassPath_org_webrtc_MediaStreamTrack_00024State[] =
    "org/webrtc/MediaStreamTrack$State";
// Leaking this jclass as we cannot use LazyInstance from some threads.
JNI_ZERO_COMPONENT_BUILD_EXPORT std::atomic<jclass> g_org_webrtc_MediaStreamTrack_clazz(nullptr);
#ifndef org_webrtc_MediaStreamTrack_clazz_defined
#define org_webrtc_MediaStreamTrack_clazz_defined
inline jclass org_webrtc_MediaStreamTrack_clazz(JNIEnv* env) {
  return jni_zero::LazyGetClass(env, kClassPath_org_webrtc_MediaStreamTrack,
      &g_org_webrtc_MediaStreamTrack_clazz);
}
#endif
// Leaking this jclass as we cannot use LazyInstance from some threads.
JNI_ZERO_COMPONENT_BUILD_EXPORT std::atomic<jclass>
    g_org_webrtc_MediaStreamTrack_00024MediaType_clazz(nullptr);
#ifndef org_webrtc_MediaStreamTrack_00024MediaType_clazz_defined
#define org_webrtc_MediaStreamTrack_00024MediaType_clazz_defined
inline jclass org_webrtc_MediaStreamTrack_00024MediaType_clazz(JNIEnv* env) {
  return jni_zero::LazyGetClass(env, kClassPath_org_webrtc_MediaStreamTrack_00024MediaType,
      &g_org_webrtc_MediaStreamTrack_00024MediaType_clazz);
}
#endif
// Leaking this jclass as we cannot use LazyInstance from some threads.
JNI_ZERO_COMPONENT_BUILD_EXPORT std::atomic<jclass>
    g_org_webrtc_MediaStreamTrack_00024State_clazz(nullptr);
#ifndef org_webrtc_MediaStreamTrack_00024State_clazz_defined
#define org_webrtc_MediaStreamTrack_00024State_clazz_defined
inline jclass org_webrtc_MediaStreamTrack_00024State_clazz(JNIEnv* env) {
  return jni_zero::LazyGetClass(env, kClassPath_org_webrtc_MediaStreamTrack_00024State,
      &g_org_webrtc_MediaStreamTrack_00024State_clazz);
}
#endif


// Step 2: Constants (optional).


// Step 3: Method stubs.
namespace webrtc {
namespace jni {

static jboolean JNI_MediaStreamTrack_GetEnabled(JNIEnv* env, jlong track);

JNI_BOUNDARY_EXPORT jboolean Java_org_webrtc_MediaStreamTrack_nativeGetEnabled(
    JNIEnv* env,
    jclass jcaller,
    jlong track) {
  return JNI_MediaStreamTrack_GetEnabled(env, track);
}

static jni_zero::ScopedJavaLocalRef<jstring> JNI_MediaStreamTrack_GetId(JNIEnv* env, jlong track);

JNI_BOUNDARY_EXPORT jstring Java_org_webrtc_MediaStreamTrack_nativeGetId(
    JNIEnv* env,
    jclass jcaller,
    jlong track) {
  return JNI_MediaStreamTrack_GetId(env, track).Release();
}

static jni_zero::ScopedJavaLocalRef<jstring> JNI_MediaStreamTrack_GetKind(JNIEnv* env, jlong track);

JNI_BOUNDARY_EXPORT jstring Java_org_webrtc_MediaStreamTrack_nativeGetKind(
    JNIEnv* env,
    jclass jcaller,
    jlong track) {
  return JNI_MediaStreamTrack_GetKind(env, track).Release();
}

static jni_zero::ScopedJavaLocalRef<jobject> JNI_MediaStreamTrack_GetState(JNIEnv* env, jlong
    track);

JNI_BOUNDARY_EXPORT jobject Java_org_webrtc_MediaStreamTrack_nativeGetState(
    JNIEnv* env,
    jclass jcaller,
    jlong track) {
  return JNI_MediaStreamTrack_GetState(env, track).Release();
}

static jboolean JNI_MediaStreamTrack_SetEnabled(JNIEnv* env, jlong track,
    jboolean enabled);

JNI_BOUNDARY_EXPORT jboolean Java_org_webrtc_MediaStreamTrack_nativeSetEnabled(
    JNIEnv* env,
    jclass jcaller,
    jlong track,
    jboolean enabled) {
  return JNI_MediaStreamTrack_SetEnabled(env, track, enabled);
}


static std::atomic<jmethodID>
    g_org_webrtc_MediaStreamTrack_00024MediaType_fromNativeIndex1(nullptr);
static jni_zero::ScopedJavaLocalRef<jobject> Java_MediaType_fromNativeIndex(JNIEnv* env,
    JniIntWrapper nativeIndex) {
  jclass clazz = org_webrtc_MediaStreamTrack_00024MediaType_clazz(env);
  CHECK_CLAZZ(env, clazz,
      org_webrtc_MediaStreamTrack_00024MediaType_clazz(env), nullptr);

  jni_zero::JniJavaCallContextChecked call_context;
  call_context.Init<
      jni_zero::MethodID::TYPE_STATIC>(
          env,
          clazz,
          "fromNativeIndex",
          "(I)Lorg/webrtc/MediaStreamTrack$MediaType;",
          &g_org_webrtc_MediaStreamTrack_00024MediaType_fromNativeIndex1);

  jobject ret =
      env->CallStaticObjectMethod(clazz,
          call_context.base.method_id, as_jint(nativeIndex));
  return jni_zero::ScopedJavaLocalRef<jobject>(env, ret);
}

static std::atomic<jmethodID> g_org_webrtc_MediaStreamTrack_00024MediaType_getNative0(nullptr);
static jint Java_MediaType_getNative(JNIEnv* env, const jni_zero::JavaRef<jobject>& obj) {
  jclass clazz = org_webrtc_MediaStreamTrack_00024MediaType_clazz(env);
  CHECK_CLAZZ(env, obj.obj(),
      org_webrtc_MediaStreamTrack_00024MediaType_clazz(env), 0);

  jni_zero::JniJavaCallContextChecked call_context;
  call_context.Init<
      jni_zero::MethodID::TYPE_INSTANCE>(
          env,
          clazz,
          "getNative",
          "()I",
          &g_org_webrtc_MediaStreamTrack_00024MediaType_getNative0);

  jint ret =
      env->CallIntMethod(obj.obj(),
          call_context.base.method_id);
  return ret;
}

static std::atomic<jmethodID> g_org_webrtc_MediaStreamTrack_00024State_fromNativeIndex1(nullptr);
static jni_zero::ScopedJavaLocalRef<jobject> Java_State_fromNativeIndex(JNIEnv* env, JniIntWrapper
    nativeIndex) {
  jclass clazz = org_webrtc_MediaStreamTrack_00024State_clazz(env);
  CHECK_CLAZZ(env, clazz,
      org_webrtc_MediaStreamTrack_00024State_clazz(env), nullptr);

  jni_zero::JniJavaCallContextChecked call_context;
  call_context.Init<
      jni_zero::MethodID::TYPE_STATIC>(
          env,
          clazz,
          "fromNativeIndex",
          "(I)Lorg/webrtc/MediaStreamTrack$State;",
          &g_org_webrtc_MediaStreamTrack_00024State_fromNativeIndex1);

  jobject ret =
      env->CallStaticObjectMethod(clazz,
          call_context.base.method_id, as_jint(nativeIndex));
  return jni_zero::ScopedJavaLocalRef<jobject>(env, ret);
}

}  // namespace jni
}  // namespace webrtc

#endif  // org_webrtc_MediaStreamTrack_JNI
