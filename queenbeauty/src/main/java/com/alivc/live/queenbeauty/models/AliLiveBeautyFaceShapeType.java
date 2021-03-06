package com.alivc.live.queenbeauty.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeBigEye;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeCanthus;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeCanthus1;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeCutCheek;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeCutFace;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeEyeAngle1;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeEyeAngle2;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeEyeTDAngle;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeHigherJaw;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeLongFace;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeLowerJaw;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeMax;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeMouthHigh;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeMouthSize;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeMouthWidth;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeNasalHeight;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeNoseTipHeight;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeNosewing;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapePhiltrum;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeThinFace;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeThinJaw;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeThinMandible;
import static com.alivc.live.queenbeauty.models.AliLiveBeautyFaceShapeType.kAliLiveFaceShapeThinNose;

/**
 * ????????????
 * ?????????????????????{@linkplain AliLiveBeautyType kAliLiveFaceShape}??????
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({kAliLiveFaceShapeCutCheek,
        kAliLiveFaceShapeCutFace,
        kAliLiveFaceShapeThinFace,
        kAliLiveFaceShapeLongFace,
        kAliLiveFaceShapeLowerJaw,
        kAliLiveFaceShapeHigherJaw,
        kAliLiveFaceShapeThinJaw,
        kAliLiveFaceShapeThinMandible,
        kAliLiveFaceShapeBigEye,
        kAliLiveFaceShapeEyeAngle1,
        kAliLiveFaceShapeCanthus,
        kAliLiveFaceShapeCanthus1,
        kAliLiveFaceShapeEyeAngle2,
        kAliLiveFaceShapeEyeTDAngle,
        kAliLiveFaceShapeThinNose,
        kAliLiveFaceShapeNosewing,
        kAliLiveFaceShapeNasalHeight,
        kAliLiveFaceShapeNoseTipHeight,
        kAliLiveFaceShapeMouthWidth,
        kAliLiveFaceShapeMouthSize,
        kAliLiveFaceShapeMouthHigh,
        kAliLiveFaceShapePhiltrum,
        kAliLiveFaceShapeMax,
})
public @interface AliLiveBeautyFaceShapeType {
    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeCutCheek = 0;

    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeCutFace = 1;

    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeThinFace = 2;

    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeLongFace = 3;

    /**
     * ???????????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeLowerJaw = 4;

    /**
     * ???????????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeHigherJaw = 5;

    /**
     * ????????????????????????[0, 1]
     */
    int kAliLiveFaceShapeThinJaw = 6;

    /**
     * ????????????????????????[0, 1]
     */
    int kAliLiveFaceShapeThinMandible = 7;

    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeBigEye = 8;

    /**
     * ??????1???????????????[0, 1]
     */
    int kAliLiveFaceShapeEyeAngle1 = 9;

    /**
     * ?????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeCanthus = 10;

    /**
     * ???????????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeCanthus1 = 11;

    /**
     * ??????2???????????????[-1, 1]
     */
    int kAliLiveFaceShapeEyeAngle2 = 12;

    /**
     * ???????????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeEyeTDAngle = 13;

    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeThinNose = 14;

    /**
     * ?????????????????????[0, 1]
     */
    int kAliLiveFaceShapeNosewing = 15;

    /**
     * ?????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeNasalHeight = 16;

    /**
     * ????????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeNoseTipHeight = 17;

    /**
     * ?????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeMouthWidth = 18;

    /**
     * ???????????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeMouthSize = 19;

    /**
     * ?????????????????????[-1, 1]
     */
    int kAliLiveFaceShapeMouthHigh = 20;

    /**
     * ?????????????????????[-1, 1]
     */
    int kAliLiveFaceShapePhiltrum = 21;

    /**
     * ?????????
     */
    int kAliLiveFaceShapeMax = 22;
}
