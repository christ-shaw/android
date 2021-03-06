package com.alivc.live.queenbeauty.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendAdd;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendAverage;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendColor;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendColorBurn;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendColorDodge;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendDarken;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendDifference;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendDivide;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendExclusion;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendGlow;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendHardLight;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendHardMix;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendHue;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendLighten;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendLinearBurn;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendLinearDodge;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendLinearLight;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendLuminosity;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendMax;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendMultiply;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendNegation;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendNormal;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendOverlay;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendPhoenix;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendPinLight;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendReflect;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendSaturation;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendScreen;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendSoftLight;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendSubtract;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyBlendType.kAliLiveBlendVividLight;

/**
 * ??????????????????
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({kAliLiveBlendNormal,
        kAliLiveBlendLighten,
        kAliLiveBlendDarken,
        kAliLiveBlendMultiply,
        kAliLiveBlendDivide,
        kAliLiveBlendAverage,
        kAliLiveBlendAdd,
        kAliLiveBlendSubtract,
        kAliLiveBlendDifference,
        kAliLiveBlendNegation,
        kAliLiveBlendExclusion,
        kAliLiveBlendScreen,
        kAliLiveBlendOverlay,
        kAliLiveBlendSoftLight,
        kAliLiveBlendHardLight,
        kAliLiveBlendColorDodge,
        kAliLiveBlendColorBurn,
        kAliLiveBlendLinearDodge,
        kAliLiveBlendLinearBurn,
        kAliLiveBlendLinearLight,
        kAliLiveBlendVividLight,
        kAliLiveBlendPinLight,
        kAliLiveBlendHardMix,
        kAliLiveBlendReflect,
        kAliLiveBlendGlow,
        kAliLiveBlendPhoenix,
        kAliLiveBlendHue,
        kAliLiveBlendSaturation,
        kAliLiveBlendLuminosity,
        kAliLiveBlendColor,
        kAliLiveBlendMax,
})
public @interface AliLiveBeautyBlendType {
    /**
     * ??????
     */
    int kAliLiveBlendNormal = 0;

    /**
     * ??????
     */
    int kAliLiveBlendLighten = 1;

    /**
     * ??????
     */
    int kAliLiveBlendDarken = 2;

    /**
     * ????????????
     */
    int kAliLiveBlendMultiply = 3;

    /**
     * ??????
     */
    int kAliLiveBlendDivide = 4;

    /**
     * ??????
     */
    int kAliLiveBlendAverage = 5;

    /**
     * ????????????
     */
    int kAliLiveBlendAdd = 6;

    /**
     * ??????
     */
    int kAliLiveBlendSubtract = 7;

    /**
     * ??????
     */
    int kAliLiveBlendDifference = 8;

    /**
     * ??????
     */
    int kAliLiveBlendNegation = 9;

    /**
     * ??????
     */
    int kAliLiveBlendExclusion = 10;

    /**
     * ??????
     */
    int kAliLiveBlendScreen = 11;

    /**
     * ??????
     */
    int kAliLiveBlendOverlay = 12;

    /**
     * ??????
     */
    int kAliLiveBlendSoftLight = 13;

    /**
     * ??????
     */
    int kAliLiveBlendHardLight = 14;

    /**
     * ????????????
     */
    int kAliLiveBlendColorDodge = 15;

    /**
     * ????????????
     */
    int kAliLiveBlendColorBurn = 16;

    /**
     * ????????????
     */
    int kAliLiveBlendLinearDodge = 17;

    /**
     * ????????????
     */
    int kAliLiveBlendLinearBurn = 18;

    /**
     * ?????????
     */
    int kAliLiveBlendLinearLight = 19;

    /**
     * ??????
     */
    int kAliLiveBlendVividLight = 20;

    /**
     * ??????
     */
    int kAliLiveBlendPinLight = 21;

    /**
     * ????????????
     */
    int kAliLiveBlendHardMix = 22;

    /**
     * ??????
     */
    int kAliLiveBlendReflect = 23;

    /**
     * ??????
     */
    int kAliLiveBlendGlow = 24;

    /**
     * ??????
     */
    int kAliLiveBlendPhoenix = 25;

    /**
     * ??????
     */
    int kAliLiveBlendHue = 26;

    /**
     * ?????????
     */
    int kAliLiveBlendSaturation = 27;

    /**
     * ??????
     */
    int kAliLiveBlendLuminosity = 28;

    /**
     * ??????
     */
    int kAliLiveBlendColor = 29;

    /**
     * ?????????
     */
    int kAliLiveBlendMax = 999;
}
