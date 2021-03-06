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
 * 美型类型
 * 设置之前需要将{@linkplain AliLiveBeautyType kAliLiveFaceShape}打开
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
     * 颧骨，值的范围[0, 1]
     */
    int kAliLiveFaceShapeCutCheek = 0;

    /**
     * 削脸，值的范围[0, 1]
     */
    int kAliLiveFaceShapeCutFace = 1;

    /**
     * 瘦脸，值的范围[0, 1]
     */
    int kAliLiveFaceShapeThinFace = 2;

    /**
     * 脸长，值的范围[0, 1]
     */
    int kAliLiveFaceShapeLongFace = 3;

    /**
     * 下巴缩短，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeLowerJaw = 4;

    /**
     * 下巴拉长，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeHigherJaw = 5;

    /**
     * 瘦下巴，值的范围[0, 1]
     */
    int kAliLiveFaceShapeThinJaw = 6;

    /**
     * 瘦下颌，值的范围[0, 1]
     */
    int kAliLiveFaceShapeThinMandible = 7;

    /**
     * 大眼，值的范围[0, 1]
     */
    int kAliLiveFaceShapeBigEye = 8;

    /**
     * 眼角1，值的范围[0, 1]
     */
    int kAliLiveFaceShapeEyeAngle1 = 9;

    /**
     * 眼距，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeCanthus = 10;

    /**
     * 拉宽眼距，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeCanthus1 = 11;

    /**
     * 眼角2，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeEyeAngle2 = 12;

    /**
     * 眼睛高度，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeEyeTDAngle = 13;

    /**
     * 瘦鼻，值的范围[0, 1]
     */
    int kAliLiveFaceShapeThinNose = 14;

    /**
     * 鼻翼，值的范围[0, 1]
     */
    int kAliLiveFaceShapeNosewing = 15;

    /**
     * 鼻长，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeNasalHeight = 16;

    /**
     * 鼻头长，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeNoseTipHeight = 17;

    /**
     * 唇宽，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeMouthWidth = 18;

    /**
     * 嘴唇大小，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeMouthSize = 19;

    /**
     * 唇高，值的范围[-1, 1]
     */
    int kAliLiveFaceShapeMouthHigh = 20;

    /**
     * 人中，值的范围[-1, 1]
     */
    int kAliLiveFaceShapePhiltrum = 21;

    /**
     * 最大值
     */
    int kAliLiveFaceShapeMax = 22;
}
