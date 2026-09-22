/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  KDFzREm.NxU
 *  KDFzREm.ow
 *  org.joml.Matrix4f
 *  org.joml.Vector3d
 */
package KDFzREm;

import KDFzREm.BY;
import KDFzREm.Bg;
import KDFzREm.Bm;
import KDFzREm.MF;
import KDFzREm.MS;
import KDFzREm.Mp;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.NxU;
import KDFzREm.RV;
import KDFzREm.TI;
import KDFzREm.TJ;
import KDFzREm.TK;
import KDFzREm.TO;
import KDFzREm.TV;
import KDFzREm.Te;
import KDFzREm.Tg;
import KDFzREm.Tq;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZH;
import KDFzREm.Zc;
import KDFzREm.Zd;
import KDFzREm.Zl;
import KDFzREm.Zu;
import KDFzREm.lL;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.ow;
import KDFzREm.uF;
import KDFzREm.uY;
import KDFzREm.zi;
import KDFzREm.zn;
import KDFzREm.zs;
import KDFzREm.zu;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3d;

@UZ(L="Arrows", y=UR.VISUAL, N=Uz.SCREEN)
public class TQ
extends UM {
    public Object[] L;
    private static short[] R;
    private static boolean[] M;
    private static short[] B;
    private static byte[] Z;
    private static int[] z;
    private static short[] U;
    private static short[] W;
    private static short[] m;
    public Object[] u;
    private static String[] P;
    private static float[] s;
    private static short[] T;
    private static byte[] b;
    private static short[] j;
    private static float[] v;
    private static boolean[] n;
    private static short[] t;
    private static String[] G;
    private static short[] l;
    private static String[] d;
    public static Object[] i;
    private static boolean[] w;
    private static float[] k;
    private static double[] Y;
    private static short[] Q;
    private static /* synthetic */ String I1IjI;
    private static /* synthetic */ int[] lOqilini;

    private static /* synthetic */ int L(int n) {
        return (-Integer.rotateRight(n, 17) ^ 0xB12B8943) + 1;
    }

    private static /* synthetic */ int M(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 14), 30) ^ 0x157F0AE6, 18), 7);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-43, -89, 80, -29, 106, 49, -43, 85, 75, -68, -125, -18, -4, -65, 110, 12};
        int n = 0;
        int n2 = 105;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 115;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        b = new byte[]{7, 2};
        Z = new byte[]{3, 4, 5, 6, 4, 8, 5};
    }

    private static void T() {
        j = new short[]{0, 1, 2, 3, 4, 5, 6};
        l = new short[]{0, 6};
        Q = new short[]{1, 2, 5, 3, 4, 7, 7};
        U = new short[]{0, 1, 2};
        R = new short[]{4096, 1024, 0, 1, 1, 1};
        B = new short[]{2, 1, 3};
        T = new short[]{4, 0, 0, 3, 7, 0, 4, 6};
        m = new short[]{0, 4, 0};
        W = new short[]{4, 6, 0, 0, 3, 4, 0};
        t = new short[]{4, 1, 2, 3, 2};
    }

    public TQ() {
        TQ.l1krnlIrO("cqgef", 2131222300, -480938328, -480938322, -480938321, 2131222300, 2131222300, 2131222300, (TQ)this);
        TV tV = new TV(this, (String)((Object)TQ.l1krnlIrO("libsghor", 2131222296, -480938328, -480938295, -480938294, 2131222296, 2131222296, 2131222296)[0]), (boolean)TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938365, -480938251, 2131222296, 2131222296, 2131222296)[0]);
        TQ.l1krnlIrO("vmslamfg", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("uyjn", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[0]] = tV;
        TI tI = new TI(this, (String)((Object)TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938295, -480938294, 2131222296, 2131222296, 2131222296)[1]), (boolean)TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938365, -480938251, 2131222296, 2131222296, 2131222296)[1]);
        TQ.l1krnlIrO("taeq", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[1]] = tI;
        Te te = new Te(this, (String)((Object)TQ.l1krnlIrO("uyjn", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[0]), (boolean)TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938292, -480938251, 2131222296, 2131222296, 2131222296)[0]);
        TQ.l1krnlIrO("rgiay", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("vhcyhi", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[2]] = te;
        Tq tq = new Tq(this, (String)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[1]), (boolean)TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938292, -480938251, 2131222296, 2131222296, 2131222296)[1]);
        TQ.l1krnlIrO("vemhb", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[3]] = tq;
        TO tO = new TO(this, (String)((Object)TQ.l1krnlIrO("libsghor", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[2]), (boolean)TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938292, -480938251, 2131222296, 2131222296, 2131222296)[2]);
        TQ.l1krnlIrO("gstnzqir", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[4]] = tO;
        TJ tJ = new TJ(this, (String)((Object)TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[3]), (boolean)TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938292, -480938251, 2131222296, 2131222296, 2131222296)[3]);
        TQ.l1krnlIrO("uyjn", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("taeq", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[5]] = tJ;
        TK tK = new TK(this, (String)((Object)TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[4]), (boolean)TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938292, -480938251, 2131222296, 2131222296, 2131222296)[4]);
        TQ.l1krnlIrO("zndg", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938293, -480938335, 2131222296, 2131222296, 2131222296)[6]] = tK;
        lv[] lvArray = new Tg[TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938291, -480938324, 2131222296, 2131222296, 2131222296)[0]];
        lvArray[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938292, -480938251, 2131222296, 2131222296, 2131222296)[5]] = (TV)((Object)TQ.l1krnlIrO("rgiay", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938290, -480938335, 2131222296, 2131222296, 2131222296)[0]]);
        lvArray[TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938252, -480938251, 2131222296, 2131222296, 2131222296)[0]] = (TK)((Object)TQ.l1krnlIrO("taeq", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938290, -480938335, 2131222296, 2131222296, 2131222296)[1]]);
        lvArray[TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938291, -480938324, 2131222296, 2131222296, 2131222296)[1]] = (TI)((Object)TQ.l1krnlIrO("nmbys", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[0]]);
        lvArray[TQ.l1krnlIrO("taeq", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[0]] = (Te)((Object)TQ.l1krnlIrO("vmslamfg", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[1]]);
        lvArray[TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[1]] = (TJ)((Object)TQ.l1krnlIrO("zndg", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("libsghor", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[2]]);
        lvArray[TQ.l1krnlIrO("uyjn", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[2]] = (Tq)((Object)TQ.l1krnlIrO("vmslamfg", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[3]]);
        lvArray[TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[3]] = (TO)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("vhcyhi", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[4]]);
        CallSite callSite = TQ.l1krnlIrO("gstnzqir", 2131222290, -480938304, -480938306, -480938303, 2131222290, 2131222290, 2131222290, (lY)this, (String)((Object)TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[5]), (lv[])lvArray);
        TQ.l1krnlIrO("uyjn", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[5]] = callSite;
        CallSite callSite2 = TQ.l1krnlIrO("nmbys", 2131222291, -480938337, -480938362, -480938361, 2131222291, 2131222291, 2131222291, (List)((Object)TQ.l1krnlIrO("zndg", 2131222300, -480938339, -480938323, -480938302, 2131222300, 2131222300, 2131222300, (lj)((lj)((Object)TQ.l1krnlIrO("rgiay", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938289, -480938335, 2131222296, 2131222296, 2131222296)[6]])))));
        while (TQ.l1krnlIrO("cqgef", 2131222291, -480938344, -480938343, -480938342, 2131222291, 2131222291, 2131222291, (Iterator)((Object)callSite2)) != false) {
            Tg tg = (Tg)((Object)TQ.l1krnlIrO("nmbys", 2131222291, -480938344, -480938341, -480938340, 2131222291, 2131222291, 2131222291, (Iterator)((Object)callSite2)));
            if (!(tg instanceof uY)) continue;
            Tg tg2 = tg;
            TQ.l1krnlIrO("nmbys", 2131222291, -480938301, -480938331, -480938300, 2131222291, 2131222291, 2131222291, (uY)tg2, (Object)this);
        }
        CallSite callSite3 = TQ.l1krnlIrO("nmbys", 2131222300, -480938273, -480938331, -480938282, 2131222300, 2131222300, 2131222300, (Zc)((Object)TQ.l1krnlIrO("beexgs", 2131222300, -480938273, -480938331, -480938283, 2131222300, 2131222300, 2131222300, (Zc)((Object)TQ.l1krnlIrO("libsghor", 2131222300, -480938273, -480938331, -480938288, 2131222300, 2131222300, 2131222300, (Zc)((Object)TQ.l1krnlIrO("zndg", 2131222290, -480938249, -480938331, -480938299, 2131222290, 2131222290, 2131222290)), (Zl)((Object)TQ.l1krnlIrO("rgiay", 2131222300, -480938279, -480938331, -480938274, 2131222300, 2131222300, 2131222300, (Zd)((Object)TQ.l1krnlIrO("vmslamfg", 2131222300, -480938279, -480938331, -480938275, 2131222300, 2131222300, 2131222300, (Zd)((Object)TQ.l1krnlIrO("taeq", 2131222300, -480938279, -480938331, -480938276, 2131222300, 2131222300, 2131222300, (Zd)((Object)TQ.l1krnlIrO("cqgef", 2131222300, -480938279, -480938331, -480938278, 2131222300, 2131222300, 2131222300, (Zd)((Object)TQ.l1krnlIrO("vemhb", 2131222290, -480938298, -480938323, -480938297, 2131222290, 2131222290, 2131222290)), (zs)((zs)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938280, -480938331, -480938326, 2131222296, 2131222296, 2131222296)[TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938315, -480938335, 2131222296, 2131222296, 2131222296)[0]])))), (MS)((MS)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938277, -480938325, -480938326, 2131222296, 2131222296, 2131222296)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938315, -480938335, 2131222296, 2131222296, 2131222296)[1]])))), (int)TQ.l1krnlIrO("uyjn", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[4])))))), (Zu)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222290, -480938285, -480938331, -480938284, 2131222290, 2131222290, 2131222290, (Bg)((Bg)((Object)TQ.l1krnlIrO("taeq", 2131222296, -480938287, -480938331, -480938326, 2131222296, 2131222296, 2131222296)[TQ.l1krnlIrO("vhcyhi", 2131222296, -480938328, -480938315, -480938335, 2131222296, 2131222296, 2131222296)[2]])), (int)TQ.l1krnlIrO("vemhb", 2131222296, -480938328, -480938286, -480938335, 2131222296, 2131222296, 2131222296)[0], (int)TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938286, -480938335, 2131222296, 2131222296, 2131222296)[1])))));
        TQ.l1krnlIrO("nmbys", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938286, -480938335, 2131222296, 2131222296, 2131222296)[2]] = callSite3;
        CallSite callSite4 = TQ.l1krnlIrO("cqgef", 2131222300, -480938281, -480938267, -480938456, 2131222300, 2131222300, 2131222300, (MS)((MS)((Object)TQ.l1krnlIrO("beexgs", 2131222296, -480938277, -480938325, -480938326, 2131222296, 2131222296, 2131222296)[TQ.l1krnlIrO("uyjn", 2131222296, -480938328, -480938286, -480938335, 2131222296, 2131222296, 2131222296)[3]])), (String)((Object)TQ.l1krnlIrO("vemhb", 2131222296, -480938328, -480938368, -480938294, 2131222296, 2131222296, 2131222296)[6]));
        TQ.l1krnlIrO("libsghor", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938286, -480938335, 2131222296, 2131222296, 2131222296)[4]] = callSite4;
        CallSite callSite5 = TQ.l1krnlIrO("taeq", 2131222300, -480938281, -480938267, -480938456, 2131222300, 2131222300, 2131222300, (MS)((MS)((Object)TQ.l1krnlIrO("zndg", 2131222296, -480938277, -480938325, -480938326, 2131222296, 2131222296, 2131222296)[TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938286, -480938335, 2131222296, 2131222296, 2131222296)[5]])), (String)((Object)TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938455, -480938294, 2131222296, 2131222296, 2131222296)[0]));
        TQ.l1krnlIrO("vmslamfg", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938256, -480938335, 2131222296, 2131222296, 2131222296)[0]] = callSite5;
        CallSite callSite6 = TQ.l1krnlIrO("gstnzqir", 2131222300, -480938281, -480938365, -480938454, 2131222300, 2131222300, 2131222300, (MS)((MS)((Object)TQ.l1krnlIrO("vmslamfg", 2131222296, -480938277, -480938325, -480938326, 2131222296, 2131222296, 2131222296)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938256, -480938335, 2131222296, 2131222296, 2131222296)[1]])), (String)((Object)TQ.l1krnlIrO("vemhb", 2131222296, -480938328, -480938455, -480938294, 2131222296, 2131222296, 2131222296)[1]));
        TQ.l1krnlIrO("rgiay", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("vmslamfg", 2131222296, -480938328, -480938256, -480938335, 2131222296, 2131222296, 2131222296)[2]] = callSite6;
        Matrix4f matrix4f = new Matrix4f();
        TQ.l1krnlIrO("cqgef", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938320, -480938335, 2131222296, 2131222296, 2131222296)[0]] = matrix4f;
    }

    static {
        TQ.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{101, 100, 89, 36, -42, -46, 41, -17, 93, -7, 93, -10, 69, -123, -91, 35};
        int n = 0;
        int n2 = 225;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 249;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int B(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(n, 6), 30) ^ 0x943792A9, 27), 19);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{106, -65, -8, 42, 14, -44, 16, -63, -117, -81, -16, 106, 20, -48, 67, -31};
        int n = 0;
        int n2 = 119;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 161;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-60, 82, 24, -12, 101, 36, 113, -46, -13, 42, -93, 60, 103, -12, -38, -18};
        int n = 0;
        int n2 = 204;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 251;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft((Integer.rotateLeft(Integer.rotateLeft(-n, 30), 1) ^ 0x8643F2EC) + 1 ^ 0x36E73636, 21);
    }

    private static void b() {
        G = new String[]{"players", "friends"};
        P = new String[]{"villagers", "monsters", "animals", "items", "party", "entities", "u_projection"};
        d = new String[]{"u_view", "texture_in"};
    }

    private static void s() {
        i = new Object[]{Float.valueOf(32.0f)};
    }

    private static void n() {
        z = new int[]{-16777216};
    }

    private void m() {
        CallSite callSite;
        if (TQ.l1krnlIrO("zndg", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this) == null) {
            TQ.l1krnlIrO("libsghor", 2131222303, -480938328, -480938327, -480938326, 2131222303, 2131222303, 2131222303, (TQ)this, (Object[])new Object[TQ.l1krnlIrO("libsghor", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[5]]);
            callSite = TQ.l1krnlIrO("libsghor", 2131222302, -480938328, -480938327, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this);
        }
        if (TQ.l1krnlIrO("gstnzqir", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this) == null) {
            TQ.l1krnlIrO("beexgs", 2131222303, -480938328, -480938323, -480938326, 2131222303, 2131222303, 2131222303, (TQ)this, (Object[])new Object[TQ.l1krnlIrO("vemhb", 2131222296, -480938328, -480938325, -480938324, 2131222296, 2131222296, 2131222296)[6]]);
            callSite = TQ.l1krnlIrO("uyjn", 2131222302, -480938328, -480938323, -480938326, 2131222302, 2131222302, 2131222302, (TQ)this);
        }
    }

    private static void t() {
        Y = new double[]{512.0, 0.5, 1.0};
    }

    private static void v() {
        k = new float[]{2.0f, 2.0f, 1000.0f, 180.0f, (float)Math.PI, 12.0f, 2.0f, 32.0f};
        v = new float[]{0.0f, 0.0f, 0.0f, 1.0f, -16.0f};
        s = new float[]{-16.0f, 0.0f, 32.0f, 32.0f, 32.0f};
    }

    private static void j() {
        M = new boolean[]{true, true};
        w = new boolean[]{true, true, true, true, true, false};
        n = new boolean[]{true, true, false, true, false};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-81, 42, 65, -28, 123, -2, 126, 92, -76, 64, -118, 76, -24, 71, -97, 43};
        int n = 0;
        int n2 = 18;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 173;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-14, 127, -22, -75, -38, 62, -77, -82, -27, 58, 70, 53, 75, 99, -10, 70};
        int n = 0;
        int n2 = 226;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 245;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight((-n ^ 0x9C66707F) + 1, 30), 17) ^ 0x5C254E27, 7), 22);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{15, 18, -60, 102, -128, 91, 102, -104, -60, -33, 50, -128, -21, -44, 32, -38};
        int n = 0;
        int n2 = 17;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 73;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-127, 37, -30, -82, 79, -119, 6, 31, -111, -21, 31, -58, -34, 69, 107, 121};
        int n = 0;
        int n2 = 180;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(n ^ 0x3BB27A70, 15), 10), 24) ^ 0x185ABB52;
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{29, 117, -113, -104, 84, -54, 113, -101, -53, 86, 42, -108, -9, -89, -86, 60};
        int n = 0;
        int n2 = 22;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 119;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(RV rV) {
        Object object;
        TQ.l1krnlIrO("rgiay", 2131222300, -480938328, -480938322, -480938321, 674904740, 1489872925, 53993721, (TQ)this);
        CallSite callSite = TQ.l1krnlIrO("libsghor", 2131222290, -480938334, -480938306, -480938305, 674904740, 1489872925, 53993721);
        CallSite callSite2 = TQ.l1krnlIrO("vmslamfg", 2131222300, -480938319, -480938318, -480938317, 674904740, 1489872925, 53993721, (NNuU)((NNuU)TQ.l1krnlIrO("cqgef", 2131222302, -480938328, -480938306, -480938326, -2083178235, 1607771536, -1540644986, (TQ)this)[TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938320, -480938335, 357158610, -1991177754, -1885046874)[1]]));
        float f = (float)TQ.l1krnlIrO("gstnzqir", 2131222300, -480938316, -480938315, -480938309, 674904740, 1489872925, 53993721, (ow)callSite2) / TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938314, -480938313, -227061606, 1770742092, 56153265)[0];
        float f2 = (float)TQ.l1krnlIrO("taeq", 2131222300, -480938316, -480938360, -480938309, 674904740, 1489872925, 53993721, (ow)callSite2) / TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938314, -480938313, -311125011, -970782678, 1909187407)[1];
        CallSite callSite3 = TQ.l1krnlIrO("uyjn", 2131222290, -480938355, -480938331, -480938354, 674904740, 1489872925, 53993721, (float)TQ.l1krnlIrO("rgiay", 2131222300, -480938357, -480938306, -480938356, 674904740, 1489872925, 53993721, (lL)((Object)TQ.l1krnlIrO("beexgs", 2131222290, -480938359, -480938306, -480938358, 674904740, 1489872925, 53993721))));
        CallSite callSite4 = TQ.l1krnlIrO("nmbys", 2131222290, -480938353, -480938368, -480938367, 674904740, 1489872925, 53993721, (double)((double)callSite3));
        CallSite callSite5 = TQ.l1krnlIrO("jjqiwboz", 2131222290, -480938353, -480938322, -480938367, 674904740, 1489872925, 53993721, (double)((double)callSite3));
        CallSite callSite6 = TQ.l1krnlIrO("jjqiwboz", 2131222291, -480938363, -480938362, -480938361, 674904740, 1489872925, 53993721, (Iterable)((Object)TQ.l1krnlIrO("uyjn", 2131222300, -480938366, -480938365, -480938364, 674904740, 1489872925, 53993721, (NNNZg)((NNNZg)TQ.l1krnlIrO("gstnzqir", 2131222302, -480938319, -480938320, -480938326, 189656555, 344163598, 1493248638, (NNuU)((NNuU)TQ.l1krnlIrO("uyjn", 2131222302, -480938328, -480938306, -480938326, -329940104, -200347558, -938369917, (TQ)this)[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938320, -480938335, 1795487383, 1770971380, -332480579)[2]]))[TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938320, -480938335, -2145566363, -2081987824, 1415861308)[3]]))));
        while (TQ.l1krnlIrO("zndg", 2131222291, -480938344, -480938343, -480938342, 674904740, 1489872925, 53993721, (Iterator)((Object)callSite6)) != false) {
            object = (NbK)TQ.l1krnlIrO("vmslamfg", 2131222291, -480938344, -480938341, -480938340, 674904740, 1489872925, 53993721, (Iterator)((Object)callSite6));
            CallSite callSite7 = TQ.l1krnlIrO("nmbys", 2131222291, -480938337, -480938362, -480938361, 674904740, 1489872925, 53993721, (List)((List)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938339, -480938338, -480938340, 674904740, 1489872925, 53993721, (lj)((lj)((Object)TQ.l1krnlIrO("uyjn", 2131222302, -480938328, -480938327, -480938326, 262982764, -1654835834, -253144279, (TQ)this)[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938320, -480938335, 1385027380, 572807606, 1260985797)[4]]))))));
            while (TQ.l1krnlIrO("uyjn", 2131222291, -480938344, -480938343, -480938342, 674904740, 1489872925, 53993721, (Iterator)((Object)callSite7)) != false) {
                Tg tg = (Tg)((Object)TQ.l1krnlIrO("jjqiwboz", 2131222291, -480938344, -480938341, -480938340, 674904740, 1489872925, 53993721, (Iterator)((Object)callSite7)));
                if (TQ.l1krnlIrO("taeq", 2131222300, -480938352, -480938351, -480938350, 674904740, 1489872925, 53993721, (Tg)tg, (Object)object) == false) continue;
                CallSite callSite8 = TQ.l1krnlIrO("libsghor", 2131222290, -480938334, -480938338, -480938349, 674904740, 1489872925, 53993721, (NbK)object);
                CallSite callSite9 = TQ.l1krnlIrO("nmbys", 2131222290, -480938334, -480938323, -480938349, 674904740, 1489872925, 53993721, (NbK)object);
                CallSite callSite10 = TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938348, -480938347, -480938349, 674904740, 1489872925, 53993721, (NNNwS)((NNNwS)TQ.l1krnlIrO("vemhb", 2131222302, -480938319, -480938320, -480938326, 970904221, 791579406, 1863661100, (NNuU)((NNuU)TQ.l1krnlIrO("gstnzqir", 2131222302, -480938328, -480938306, -480938326, 1018855330, -413319283, 820515801, (TQ)this)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938320, -480938335, 1579048038, 341034545, 1916583023)[5]]))[TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938320, -480938335, -1173766701, 622446466, 16873304)[6]]), (NbK)object);
                TQ.l1krnlIrO("rgiay", 2131222300, -480938328, -480938331, -480938346, 674904740, 1489872925, 53993721, (TQ)this, (Tg)tg, null, (double)callSite8, (NXi)callSite, (double)callSite9, (float)callSite4, (float)callSite5, (float)f, (float)f2, (double)callSite10);
            }
        }
        if (TQ.l1krnlIrO("zndg", 2131222300, -480938345, -480938315, -480938342, 674904740, 1489872925, 53993721, (TK)((TK)((Object)TQ.l1krnlIrO("gstnzqir", 2131222302, -480938328, -480938327, -480938326, -109560121, 771446155, -1576684248, (TQ)this)[TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938320, -480938335, -1958992734, 243134509, 555509964)[7]]))) != false) {
            callSite6 = TQ.l1krnlIrO("zndg", 2131222291, -480938260, -480938362, -480938361, 674904740, 1489872925, 53993721, (Collection)((Object)TQ.l1krnlIrO("gstnzqir", 2131222300, -480938262, -480938331, -480938261, 674904740, 1489872925, 53993721, (Mp)((Object)TQ.l1krnlIrO("nmbys", 2131222290, -480938264, -480938331, -480938263, 674904740, 1489872925, 53993721)))));
            while (TQ.l1krnlIrO("beexgs", 2131222291, -480938344, -480938343, -480938342, 674904740, 1489872925, 53993721, (Iterator)((Object)callSite6)) != false) {
                object = (MF)((Object)TQ.l1krnlIrO("taeq", 2131222291, -480938344, -480938341, -480938340, 674904740, 1489872925, 53993721, (Iterator)((Object)callSite6)));
                float f3 = (float)(TQ.l1krnlIrO("uyjn", 2131222290, -480938259, -480938258, -480938257, 674904740, 1489872925, 53993721) - TQ.l1krnlIrO("nmbys", 2131222300, -480938272, -480938306, -480938257, 674904740, 1489872925, 53993721, (MF)object)) / TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938314, -480938313, 1516298599, -812220277, 1173137178)[2];
                CallSite callSite11 = TQ.l1krnlIrO("vhcyhi", 2131222300, -480938270, -480938269, -480938268, 674904740, 1489872925, 53993721, (Vector3d)TQ.l1krnlIrO("vhcyhi", 2131222300, -480938272, -480938338, -480938271, 674904740, 1489872925, 53993721, (MF)object));
                CallSite callSite12 = TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938270, -480938267, -480938268, 674904740, 1489872925, 53993721, (Vector3d)TQ.l1krnlIrO("libsghor", 2131222300, -480938272, -480938338, -480938271, 674904740, 1489872925, 53993721, (MF)object));
                CallSite callSite13 = TQ.l1krnlIrO("taeq", 2131222290, -480938353, -480938327, -480938266, 674904740, 1489872925, 53993721, (double)f3, (double)TQ.l1krnlIrO("taeq", 2131222300, -480938270, -480938269, -480938268, 674904740, 1489872925, 53993721, (Vector3d)TQ.l1krnlIrO("libsghor", 2131222300, -480938272, -480938331, -480938271, 674904740, 1489872925, 53993721, (MF)object)), (double)callSite11);
                CallSite callSite14 = TQ.l1krnlIrO("zndg", 2131222290, -480938353, -480938327, -480938266, 674904740, 1489872925, 53993721, (double)f3, (double)TQ.l1krnlIrO("nmbys", 2131222300, -480938270, -480938267, -480938268, 674904740, 1489872925, 53993721, (Vector3d)TQ.l1krnlIrO("vhcyhi", 2131222300, -480938272, -480938331, -480938271, 674904740, 1489872925, 53993721, (MF)object)), (double)callSite12);
                String string = (String)((Object)TQ.l1krnlIrO("gstnzqir", 2131222300, -480938272, -480938323, -480938265, 674904740, 1489872925, 53993721, (MF)object)) + " " + (int)TQ.l1krnlIrO("vhcyhi", 2131222290, -480938245, -480938244, -480938243, 674904740, 1489872925, 53993721, (double)(TQ.l1krnlIrO("vemhb", 2131222300, -480938348, -480938248, -480938268, 674904740, 1489872925, 53993721, (NNNwS)((NNNwS)TQ.l1krnlIrO("zndg", 2131222302, -480938319, -480938320, -480938326, -1571455482, -1173319827, 596706591, (NNuU)((NNuU)TQ.l1krnlIrO("taeq", 2131222302, -480938328, -480938306, -480938326, -1732228840, 426385172, -1230543651, (TQ)this)[TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938322, -480938335, 1942231531, 1746194525, -1530766157)[0]]))[TQ.l1krnlIrO("taeq", 2131222296, -480938328, -480938322, -480938335, 1437227361, -981295403, 112525988)[1]])) - callSite11), (double)(TQ.l1krnlIrO("zndg", 2131222300, -480938348, -480938246, -480938268, 674904740, 1489872925, 53993721, (NNNwS)((NNNwS)TQ.l1krnlIrO("vmslamfg", 2131222302, -480938319, -480938320, -480938326, -294557345, 937834451, 2088276283, (NNuU)((NNuU)TQ.l1krnlIrO("cqgef", 2131222302, -480938328, -480938306, -480938326, 1660920679, 1748863140, 1501470413, (TQ)this)[TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938322, -480938335, -1966956554, -269311027, 1604109367)[2]]))[TQ.l1krnlIrO("libsghor", 2131222296, -480938328, -480938247, -480938335, -488253747, -1893030817, 857498223)[0]])) - callSite12)) + "m";
                TQ.l1krnlIrO("gstnzqir", 2131222300, -480938328, -480938331, -480938346, 674904740, 1489872925, 53993721, (TQ)this, (Tg)((TK)((Object)TQ.l1krnlIrO("vemhb", 2131222302, -480938328, -480938327, -480938326, 2066140754, 1035158121, -1038897875, (TQ)this)[TQ.l1krnlIrO("taeq", 2131222296, -480938328, -480938247, -480938335, -1550896719, 87568027, -2011046444)[1]])), (String)string, (double)callSite13, (NXi)callSite, (double)callSite14, (float)callSite4, (float)callSite5, (float)f, (float)f2, (double)TQ.l1krnlIrO("cqgef", 2131222300, -480938270, -480938255, -480938266, 674904740, 1489872925, 53993721, (Vector3d)TQ.l1krnlIrO("beexgs", 2131222300, -480938272, -480938338, -480938271, 674904740, 1489872925, 53993721, (MF)object), (double)TQ.l1krnlIrO("uyjn", 2131222302, -480938242, -480938365, -480938241, 1635583584, -2004973521, -241512894, (NXi)callSite), (double)TQ.l1krnlIrO("cqgef", 2131222302, -480938242, -480938256, -480938241, -1973894303, -1205651553, -2100553879, (NXi)callSite), (double)TQ.l1krnlIrO("libsghor", 2131222302, -480938242, -480938325, -480938241, 1346340694, -492409684, 1724692793, (NXi)callSite)));
            }
        }
        TQ.l1krnlIrO("taeq", 2131222290, -480938334, -480938331, -480938250, 674904740, 1489872925, 53993721, (NxU)TQ.l1krnlIrO("taeq", 2131222300, -480938319, -480938254, -480938253, 674904740, 1489872925, 53993721, (NNuU)((NNuU)TQ.l1krnlIrO("rgiay", 2131222302, -480938328, -480938306, -480938326, -1394406703, 762535433, 1058643444, (TQ)this)[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938247, -480938335, -5674013, -2049940350, -1329917247)[2]])), (boolean)TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938252, -480938251, 2045457908, -1674611660, 1647562588)[1]);
        TQ.l1krnlIrO("nmbys", 2131222300, -480938249, -480938331, -480938296, 674904740, 1489872925, 53993721, (ZH)((ZH)((Object)TQ.l1krnlIrO("vmslamfg", 2131222302, -480938328, -480938323, -480938326, 507088626, -1396609173, -745709852, (TQ)this)[TQ.l1krnlIrO("vhcyhi", 2131222296, -480938328, -480938247, -480938335, 1778113510, -228450664, -615483369)[3]])), mS -> {
            TQ.l1krnlIrO("uyjn", 2131222300, -480938328, -480938322, -480938321, 674904740, 1489872925, 53993721, (TQ)this);
            TQ.l1krnlIrO("cqgef", 2131222300, -480938332, -480938331, -480938330, 674904740, 1489872925, 53993721, (zu)((zu)((Object)TQ.l1krnlIrO("uyjn", 2131222302, -480938328, -480938323, -480938326, 874163978, -2007902417, 649885133, (TQ)this)[TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938336, -480938335, 458914742, -697272316, -439725122)[1]])), (Matrix4f)TQ.l1krnlIrO("nmbys", 2131222290, -480938334, -480938323, -480938333, 674904740, 1489872925, 53993721));
            TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938332, -480938331, -480938330, 674904740, 1489872925, 53993721, (zu)((zu)((Object)TQ.l1krnlIrO("vmslamfg", 2131222302, -480938328, -480938323, -480938326, 1315495302, 1566669430, -1265466772, (TQ)this)[TQ.l1krnlIrO("vemhb", 2131222296, -480938328, -480938336, -480938335, 925632709, -791434302, -1850054235)[2]])), (Matrix4f)TQ.l1krnlIrO("zndg", 2131222290, -480938329, -480938312, -480938333, 674904740, 1489872925, 53993721));
            TQ.l1krnlIrO("vmslamfg", 2131222300, -480938308, -480938331, -480938307, 674904740, 1489872925, 53993721, (zi)((zi)((Object)TQ.l1krnlIrO("gstnzqir", 2131222302, -480938328, -480938323, -480938326, -375882371, 319147275, -174692204, (TQ)this)[TQ.l1krnlIrO("taeq", 2131222296, -480938328, -480938336, -480938335, 193583310, -1654458073, 642846889)[3]])), (int)TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938310, -480938331, -480938309, 674904740, 1489872925, 53993721, (zn)((zn)((Object)TQ.l1krnlIrO("nmbys", 2131222296, -480938311, -480938331, -480938326, 300808992, -719134202, 492232553)[TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938336, -480938335, -387851646, 489623153, 113562929)[4]]))));
        });
    }

    private int N(double object, int n) {
        object = TQ.l1krnlIrO("jjqiwboz", 2131222290, -480938245, -480938447, -480938266, 674904740, 1489872925, 53993721, (double)(object / TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938433, -480938448, -394731701, 234129906, -1833933426)[0]), (double)TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938433, -480938448, 1115934340, 741587869, 1570612983)[1], (double)TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938433, -480938448, 1552868290, -326651594, 181370991)[2]);
        return (int)TQ.l1krnlIrO("rgiay", 2131222290, -480938446, -480938331, -480938444, 674904740, 1489872925, 53993721, n, (int)((double)TQ.l1krnlIrO("gstnzqir", 2131222290, -480938446, -480938306, -480938445, 674904740, 1489872925, 53993721, n) * object));
    }

    private void N(Tg tg, String string, double d, NXi nXi, double d2, float f, float f2, float f3, float f4, double d3) {
        TQ.l1krnlIrO("rgiay", 2131222300, -480938328, -480938322, -480938321, 674904740, 1489872925, 53993721, (TQ)this);
        double d4 = d - TQ.l1krnlIrO("taeq", 2131222302, -480938242, -480938365, -480938241, -1135217191, 1130652926, 2024799159, (NXi)nXi);
        double d5 = d2 - TQ.l1krnlIrO("libsghor", 2131222302, -480938242, -480938325, -480938241, -1999075913, 1287027114, 426616366, (NXi)nXi);
        double d6 = -(d5 * (double)f - d4 * (double)f2);
        double d7 = -(d4 * (double)f + d5 * (double)f2);
        float f5 = (float)TQ.l1krnlIrO("taeq", 2131222290, -480938353, -480938327, -480938243, 674904740, 1489872925, 53993721, (double)d6, (double)d7) * TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938314, -480938313, 1490508096, 215533804, -1480625225)[3] / TQ.l1krnlIrO("taeq", 2131222296, -480938328, -480938314, -480938313, -49438288, -1982237826, 1903283506)[4];
        CallSite callSite = TQ.l1krnlIrO("jjqiwboz", 2131222290, -480938355, -480938331, -480938354, 674904740, 1489872925, 53993721, (float)f5);
        float f6 = f3 + TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938352, -480938331, -480938356, 674904740, 1489872925, 53993721, (Tg)tg) * TQ.l1krnlIrO("vhcyhi", 2131222290, -480938353, -480938368, -480938367, 674904740, 1489872925, 53993721, (double)((double)callSite));
        float f7 = f4 + TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938352, -480938331, -480938356, 674904740, 1489872925, 53993721, (Tg)tg) * TQ.l1krnlIrO("libsghor", 2131222290, -480938353, -480938322, -480938367, 674904740, 1489872925, 53993721, (double)((double)callSite));
        if (string != null) {
            CallSite callSite2 = TQ.l1krnlIrO("gstnzqir", 2131222290, -480938453, -480938327, -480938452, 674904740, 1489872925, 53993721);
            CallSite callSite3 = TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938314, -480938313, 1537993520, 2073489694, 389228319)[5];
            TQ.l1krnlIrO("cqgef", 2131222290, -480938462, -480938331, -480938461, 674904740, 1489872925, 53993721, (Bm)((Object)callSite2), (String)string, (float)(f6 - TQ.l1krnlIrO("gstnzqir", 2131222300, -480938449, -480938306, -480938464, 674904740, 1489872925, 53993721, (Bm)((Object)callSite2), (String)string, (float)callSite3, (BY)((BY)((Object)TQ.l1krnlIrO("uyjn", 2131222296, -480938451, -480938450, -480938326, 1755430095, -1571247708, -1795940750)[TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938247, -480938335, -1339615426, 2076147600, 1854894324)[4]])), (boolean)TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938252, -480938251, -2136967153, -791565922, 406701739)[2]) / TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938314, -480938313, 1349274189, -469068477, -1013263769)[6]), (float)(f7 - TQ.l1krnlIrO("libsghor", 2131222296, -480938328, -480938314, -480938313, -1233215276, -1661784084, -203211811)[7]), (float)callSite3, (int)TQ.l1krnlIrO("cqgef", 2131222300, -480938352, -480938323, -480938309, 674904740, 1489872925, 53993721, (Tg)tg), (int)TQ.l1krnlIrO("nmbys", 2131222296, -480938328, -480938267, -480938463, 302805379, -908420492, 1564454947)[0]);
        }
        TQ.l1krnlIrO("zndg", 2131222300, -480938460, -480938439, -480938438, 674904740, 1489872925, 53993721, (Matrix4f)TQ.l1krnlIrO("nmbys", 2131222300, -480938460, -480938457, -480938440, 674904740, 1489872925, 53993721, (Matrix4f)TQ.l1krnlIrO("jjqiwboz", 2131222300, -480938460, -480938459, -480938333, 674904740, 1489872925, 53993721, (Matrix4f)((Matrix4f)TQ.l1krnlIrO("beexgs", 2131222302, -480938328, -480938323, -480938326, -667716765, 1628240194, 1768615246, (TQ)this)[TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938247, -480938335, -1282298040, 1871202721, 749938937)[5]])), (float)f6, (float)f7, (float)TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938458, -480938313, -2089819747, -1125938654, -554920095)[0]), (float)callSite, (float)TQ.l1krnlIrO("jjqiwboz", 2131222296, -480938328, -480938458, -480938313, 796307021, 1684534285, 166436135)[1], (float)TQ.l1krnlIrO("zndg", 2131222296, -480938328, -480938458, -480938313, 165773669, 249253151, -1793011995)[2], (float)TQ.l1krnlIrO("rgiay", 2131222296, -480938328, -480938458, -480938313, -2145519448, -493325300, 598983444)[3]);
        TQ.l1krnlIrO("nmbys", 2131222290, -480938462, -480938306, -480938434, 674904740, 1489872925, 53993721, (Zu)((Object)TQ.l1krnlIrO("nmbys", 2131222300, -480938249, -480938327, -480938437, 674904740, 1489872925, 53993721, (ZH)((ZH)((Object)TQ.l1krnlIrO("gstnzqir", 2131222302, -480938328, -480938323, -480938326, 964895759, -345419501, 782348030, (TQ)this)[TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938247, -480938335, 880061588, 1910175092, 633788787)[6]])))), (Matrix4f)((Matrix4f)TQ.l1krnlIrO("vemhb", 2131222302, -480938328, -480938323, -480938326, 2084924366, 1595216243, -523921995, (TQ)this)[TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938336, -480938335, -1547267631, 1427791086, -1934409801)[0]]), (float)TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938458, -480938313, 2016274330, -567537192, -699385747)[4], (float)TQ.l1krnlIrO("cqgef", 2131222296, -480938328, -480938436, -480938313, 1239695687, 1510500910, 1550594602)[0], (float)TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938436, -480938313, -559645234, -64039877, 300000566)[1], (float)TQ.l1krnlIrO("gstnzqir", 2131222296, -480938328, -480938436, -480938313, -167225590, -382303465, 855109640)[2], (float)TQ.l1krnlIrO("beexgs", 2131222296, -480938328, -480938436, -480938313, 1737072406, 2078212976, -1345665356)[3], (int)TQ.l1krnlIrO("beexgs", 2131222300, -480938328, -480938331, -480938435, 674904740, 1489872925, 53993721, (TQ)this, (double)d3, (int)TQ.l1krnlIrO("beexgs", 2131222300, -480938352, -480938323, -480938309, 674904740, 1489872925, 53993721, (Tg)tg)));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight((Integer.rotateLeft(Integer.rotateLeft(n, 21), 8) ^ 0x3D4D886B) + 1, 18);
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft(Long.rotateLeft(Long.rotateRight(Long.rotateRight(-Long.rotateLeft(l, 57), 46) ^ 0xC02C5D7210691104L, 25), 44), 38);
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-1, 94, 105, -33, -26, -71, 103, 9, -113, 73, 0, -63, -113, -122, -116, -45};
        int n = 0;
        int n2 = 46;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 227;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-n, 9), 17) ^ 0xFE2CFC21;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-13, 77, -108, 54, 125, -128, -46, -113, -12, 37, 9, -30, 31, -65, -6, 81};
        int n = 0;
        int n2 = 120;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 169;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        I1IjI = "\u00e9\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00dc\u0011\u00a8\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00dc'\u0089\u00fd\u00b3\u00f3I\u00e9\u00a9\u0088\u00e4Y\u00f7\u00b1FJ%\u0005\u008c\u00ee\u00fb\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c5\u0006\u00fc\u00c6\u0098\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00eapL6\u00f5\u00de\u00fb\u00fe\u00bb*\u00d7\u0099\u00a7\u00f2$\u00fb\u00a8\fB-\u00a7\u0092\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ca\u001bp\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00e4$\u00cb\u00da\u0083\u00d4O\u00d0\u00b2\u0093\u00efY\u00d4\u00aaNTk<\u0082\u00e8\u00b7\u00fb\u001e\u00a8\u00bb\u00da\u00d5\u00b5\u0089\u00f8\u0007\u00ea\u00bc\u00ce\u00fd\u0002\u00d7\u00a9\f{+\u00f0\u0091\u00f9\u00a6\u00e6\u000f\u00f3\u00b3\u00da\u00e9\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c50\u0081\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00f0\u00a7h\u0003m\u00d8\u00bb\u00d8\u0081\u00d6O\u00d8W\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u009fG\u0003\u000b\u00ee\u00a4\u00fc\u0015\u00f0\u00bc\u0095\u00edW\u00b5\u0089\u00f8\u0007\u00ea\u00bc\u00ce\u00fd\u0002\u00d7\u00a9\fq0\u00b8\r\u00fd\u00b1\u00fd\u0014\u00a7\u0083\u00d5\u00ec\u00de-\u00d8\u009b\u009b\u00da3\u00d3\u00eay\\\u007f\u00b3\u00fd\u00b3\u00f3I\u00e9\u00a9\u0088\u00e4Y\u00f2\u00acPL\u00cd\u00fd\u00b3\u00f3I\u00f0\u00bc\u008f\u00efY\u00f7\u00b1FJ%%\u00cb\u00f9S\u00fd\u00b6\u00dc\u0003\u00e4\u00a9\u00eb\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00ealZ.\u00f9\u00d3\u00e8\u00fe\u00bb\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00ea\u00a2\u0018t.\u00bc\u00e5\u00fd\u00ea\u00fe\u0007\u00f2\u00ba\u00ce\u00db\u0002\u00cc\u00acM_\u007f\u0099\u00df\u00d7\u0081\u00d4\u001c\u00ce\u0098\u008c\u00a78\u00e6\u00ac\u0018|\u0002\u009b\u00d5\u00da\u0081\u00bb0\u0097\u00d2\u0016\u00d5\u0010\u00d5\u008c\u00bb/\u00f2o\u00ee\u00a2\u00bd\f\u00f3\u00b0\u008d\u00a7 \u00db\u00a6WW6\u00afd_e\u00d8\u00ec\u00d4\u00c1\u00fd\u00b3\u00f3I\u00f0\u00bc\u008f\u00efY\u00ed\u00bcPL!*&\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u0087N\u0003\u00eb\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00eapL6\u00f5\u00de\u00fb\u00fe.\u00f0\u00a4\u00ff\u0016d\u00fd\u00b3\u00f3I\u00e9\u00a9\u0088\u00e4Y\u00fd\u00aaOT!$z\u00f5\u00aa\u00fc\u00d3N&\u00b5\u0083\u0097\u00fd\u00b3\u00f3I\u00f0\u00bc\u008f\u00efY\u00f3\u00a4WP(\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00ealZ.\u00f9c\u00e8\u00fe\u00bb<\u008a\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00e4\u00a9\u0018\u0011\b:\u00e6\u00da\u00bf\u00c0#\u00f1\u00f2\u00bb\u00ebMN\u00e8e\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00d2\u009c\u0018t.\u0010;\u00fd\u00ea\u00fe\u0007\u00f2\u00ba\u00ce\u00db\u0002\u00cc\u00acM_\u007f*\u0001\u00d7\u0081\u00d4\u001c\u00ce\u0098\u008c\u00a7\u001a\u00c8\u00fe\nt\u000f5\u000b\u00e6\u0097\u00d7\u000b\u00b3\u00b1\u008b\u00b3\u00a8\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00f2\u0014\u0081\u00b5\u0089\u00fd\u0014\u00fb\u00f2\u008b\u00e7\u001b\u00d2\u00eanY0\u00ee\u00c0\u00e4\u00f1\u00f4]\u00e0\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ca/&\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00f3\u0096\u0018\u0011\b\fJ\u00da\u00bf\u00c0#\u00f1\u00f2\u00bb\u00ecM|\u00e2\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00fd/4\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2>\u00bb\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u009fk\u0003\u0010\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00fc\u00a2\u0018q\rnt\u00d7\u0081\u00d4\u001c\u00ce\u0098\u008c\u00a7,\u00cb\u00fe\u00ce\u00f8\u00a0\u00fc\u0012\u00f5\u00a9\u0098\u0098\u00da\u0083\u00d4 \u00b5\u0091\u008e\u00fa\u0011\u0091\u00afLU(\u00b3\u00fd\u00fd\u00b1\u00e0\u000f\u00e4\u00e9\u0087\u00b3(\u00b5\u0089\u00f8\u0007\u00ea\u00bc\u00ce\u00fd\u0002\u00d7\u00a9\ft-\u00eft\u00a7I\u00f3\u00b1\u00f3\u0012\u00f9K\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c68\u00f0\u009fD\u0098\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00c4\u00b6\u0018\u0011\b\u00d7\u00f4\u00da\u00bf\u00c0#\u00f1\u00f2\u00bb\u00ecM\u0098\u00b5\u009f\u00fb\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00f2\u0018\u00e4e\u00a6\u0016\u00cf\u00fa\u00e8\u00a0\u00e0\u0007\u00e8\u00b2\u0093\u0083\u00d5\u00ec\u00c4\u008a\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00eapL6\u0018\u00cc\u00fb\u00fe\u00d4*\u00d7\u0099\u00a7\u00f2$\u00fb\u00a8\fz\u001dJ\u00f8\u00b5\u0083\u00bb\u00d0\u00aa\u00e0\u0001\u00b3\u00b7\u008e\u00e5\u001a\u0091\u0088BL6\u00b4\u00eb\u00a8\u00a3\u00a9O\u00ca\u00c9\u001c\u00f3\u00a8\u00bd\u000b\u00f3\u00b7\u0080\u00e6\u0011\u0091\u00a7OY>\u00b8L\u00f8\u00ea\u00e1\u001f\u00ef\u00a9\u0084\u00e5\u0005\u0091\u0097FV \u00b8\r\u00cf\u00bc\u00e1\u0012\u00f9\u00b0\u00d6\u0006\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c68\u00cb\u0090Vp\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2\u0012\u0092\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c68\u00e9\u0080s\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00e7\u0001p\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00f21l\u00f1\u00b5\u008f\u00b6\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ca,\u0083\u00d8\u0081\u00bb\"4\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c5%\u0010\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00ealZ.\"[\u00e8\u00fe\u00bb0\u00e0\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ff,\u00cb\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u008d\u00e9\u0018\u00d9\u00eapL6\u0018\u008d\u00fb\u00fe\u00bb*\u00d7\u0099\u00a7\u00f2$\u00fb\u00a8\fB1J\u0010\u00b5\u0089\u00f8\u0007\u00ea\u00bc\u00ce\u00e4\u0017\u00d0\u00a2\fq0\"J\u00fd\u00a7\u00fe\u0003\u00a7\u00f9\u00d8\u00cc\u00e8\u00a4\u00e6\u000f\u00ff\u009b\u0088\u00ed\u001a\u00da\u00b6|\bw\u00ec\u0088\u00fe\u00f1\u00aaW\u00ab\u00ec\u0087\u00b0\u0015\u008d\u00a4E^&\u00bf\u00db\u00ac\u00f1\u00f1W\u00a4\u00bb\u00d0\u00bfB\u00d8\u00f5\u0017^\u0098\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u00a9o\u0003\u008f\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00e4\u00b0\u0018\u0011\b\f\u00e3\u00da\u00bf\u00c0#\u00f1\u00f2\u00bb\u00ebM\u00e0R\u0081\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00fc\u00a8\u0018t.\u00fd\u00df\u00fd\u00ea\u00fe\u0007\u00f2\u00ba\u00ce\u00db\u0002\u00cc\u00acM_\u007f\u00da\u00ef\u00da\u008c\u00dbO\u00cas\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00f2\u0003K\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2<s\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c68\u00f0\u00b2p\u0084\u00f9\u00b1\u00df\t\u00f8\u00b8\u008d\u00de\u001f\u00db\u00b2nY0\u0003\u008a\u00e4\u00e5)\u00f5\u00b6\u00e6\u0007\u00f2\u00be\u0084\u00db\u0007\u00cb\u00a4Q] \u0010\u00b5\u0081\u00ca\u00f9\u00b1\u00fa\t\u00f8\u0082\u00d4\u00b0C\u0086\u00d5\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u009fV\u0003\u00e0\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00e4\u001cK\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ec 4\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00dc=\u00e7W\u00ee\u00a2\u00bd\f\u00f3\u00b0\u008d\u00a7;\u00df\u00b1QQ<s^\u00a7\u0097\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00e4\u00b0\u0018t+\u00af\u00d8\u00b3\u00af\u00fd\u000b\u00f0\u00f2\u00ac\u00e9\u0002\u00cc\u00ac[\f\"\u00e6\u00f9\u00da\u0083\u00d4 \u00d5\u00f4\u00b7\u00dd\u0088\u00f1\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u008b{Q\u007f\u00d8\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2\u001a&\u00b5\u0089\u00f8\u0007\u00ea\u00bc\u00ce\u00e4\u0017\u00d0\u00a2\fw&-k\u00ff\u00b1\u00a9\u00f8y\u0081\u00d5\u00ec\u00db\u00f1\u00b5\u0093$\u00daU\u00de\u0013\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u0088S\u00039\u00f9\u00b6\u00e6E\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00f2\u001f\u00e2\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2\u0003\u00f2\u00b6\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00e4:\u00a8\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00f1\u0080\u00d6\u0083\u00d8\u008c\u00bb/\u00d1\u0081\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u00aaT\u0003\u00e9\u008f\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u009f@\u0003\u00f6\u00f4\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00c6.\u00d7K\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ff\u0007\u00dc\u00e9\u00b7\u00e0\u0003\u00f2\u00a9\u00b5\u00e1\u001b\u00db\u0088JT(\u00b4\u00cc\u0081\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u008b[m\u007f\u0006\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00ca?\u0093\u00f9\u00bd\u00e6\u0092\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2\u0015\u00bb\u00d0\u008e\u00d6 \u00e6\u008f\u00a4\u00e5Y\u00f0\u00bdv\u0003\u001e\u00f4\u00c5\u0097\u00da\u00ec\u00d4\u009d\u00b6\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00d2%\u008e\u00f9\u00b1\u00fa\t\u00f8\u0082\u00d3\u00bbE\u008f\u00f2f\u00e5\u00b5\u00fd\u0012\u00d5\u00b5\u008c\u00c6e\u00b5\u0089\u00fd\u0014\u00fb\u00f2\u008b\u00e7\u001b\u00d2\u00eau]'\u0005\"\u00ee\u00f6\u00f6]\u00cb\u00d0\u00af\u00f3\u0010\u00fd\u00f2\u0094\u00fc\u001f\u00d2\u00eaEM*\u0012\u0097\u00f5\u00aa\u00fcI\u00df\u00b2\u008f\u00fb\u0003\u00d3\u00a0Q\u0003m'W\u00b5\u0089\u00f8\u0007\u00ea\u00bc\u00ce\u00e4\u0017\u00d0\u00a2\fk0\u00af\u0016\u00f2\u00a2\u00a9\u00e9\u00d8\u0083\u00e84\u00d9\u00b0\u00ce\u00e4\u001d\u00dd\u00f9\u00b1\u00fa\t\u00f8\u0082\u00d3\u00bbE\u008c\u00f4\u0097\u00b5\u0089\u00d9\"\u00da\u00a7\u00b3\u00cd\u001b\u0091\u009fO\u0003}";
        lOqilini = new int[]{655370, 0x1CC0001, 18415635, 90308609, 96796674, 0x5500001, 23199745, 96468995, 61407233, 54132738, 103940106, 38928405, 80936970, 102170625, 57344022, 58851367, 83099666, 64421898, 53280778, 111476739, 98107402, 0x3440004, 111673345, 93126671, 103153665, 61472780, 0x20D0002, 101253134, 63766538, 23724033, 96075777, 96665602, 54067201, 6029322, 75694094, 99483658, 30212099, 68354058, 109379588, 62980108, 99418113, 24969220, 0x303000D, 53936129, 71106582, 0x1000012, 54263816, 13434902, 1310738, 17956871, 53084163, 0x6660004, 94765076, 87162890, 100794369, 15859726, 10, 97845252, 31326229, 0xA00010, 82247693, 85524491, 19660853, 88473610, 100139017, 96927758, 2490378, 8257560, 28770324, 0x1810010, 104595473, 65142787, 9830410, 111738901, 23789585, 101187585, 85327875, 92995585, 0xB00006, 115212308, 110362636, 65077249, 117178380, 30408718, 111149061, 65994757, 103219211, 109641729, 78315521, 84344847, 54001665, 105709583, 62259201, 0x300002, 108265489, 43384842, 113115168, 42663937, 27197459, 0x1610001, 96141313, 58785793, 30081025, 93061121, 116523018, 34537529, 48955410, 42729482, 66977813, 102236174, 94109706, 11927566, 38273034, 62324746, 51380250, 109707274, 40960026, 14876687, 117964814, 0x66A000A, 32702490, 106692618, 78381057, 98762762, 44957724, 76611610, 44040206, 66322442, 69009440, 24903681, 0x320020, 65339402, 26279950, 40304650, 72679470, 5373962, 55050275, 23265282, 81592330, 78446630, 0x5510011, 46792712, 84279297, 12845065, 6684696, 50135046, 47317017, 86245390, 118882305, 100859909, 90374184, 0x6010001, 72548354, 28442629, 87818250, 96206852, 23396357};
        TQ.T();
        TQ.P();
        TQ.n();
        TQ.t();
        TQ.j();
        TQ.v();
        TQ.b();
        TQ.s();
    }

    private static /* synthetic */ CallSite l1krnlIrO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lOqilini[n2 ^ 0xE35576A8];
        int n9 = n8 >>> 16;
        String string2 = TQ.lOkIikmni(I1IjI.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xE35576A8);
        n8 = lOqilini[n3 ^ 0xE35576A8];
        int n10 = n8 >>> 16;
        String string3 = TQ.lOkIikmni(I1IjI.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xE35576A8);
        n8 = lOqilini[n4 ^ 0xE35576A8];
        int n11 = n8 >>> 16;
        String string4 = TQ.lOkIikmni(I1IjI.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xE35576A8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7F07DFAA) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ CallSite lOsI0Is(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lOqilini[n2 ^ 0xE35576A8];
        int n9 = n8 >>> 16;
        String string2 = TQ.lOkIikmni(I1IjI.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xE35576A8);
        n8 = lOqilini[n3 ^ 0xE35576A8];
        int n10 = n8 >>> 16;
        String string3 = TQ.lOkIikmni(I1IjI.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xE35576A8);
        n8 = lOqilini[n4 ^ 0xE35576A8];
        int n11 = n8 >>> 16;
        String string4 = TQ.lOkIikmni(I1IjI.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xE35576A8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x7F07DFAA) + -178;
        switch (n) {
            case 0: {
                MethodHandle methodHandle = lookup.findStaticGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 1: {
                MethodHandle methodHandle = lookup.findStaticSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 2: {
                MethodHandle methodHandle = lookup.findGetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 3: {
                MethodHandle methodHandle = lookup.findSetter(clazz, string3, (Class<?>)MethodType.fromMethodDescriptorString("()".concat(string4), clazz.getClassLoader()).returnType());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 4: {
                MethodType methodType2 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType2);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 5: {
                MethodType methodType3 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                if (string3.equals("<init>")) {
                    MethodHandle methodHandle = lookup.findConstructor(clazz, methodType3);
                    return new ConstantCallSite(methodHandle.asType(methodType));
                }
                MethodHandle methodHandle = lookup.findSpecial(clazz, string3, methodType3, lookup.lookupClass());
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 6: {
                MethodType methodType4 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findStatic(clazz, string3, methodType4);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
            case 7: {
                MethodType methodType5 = MethodType.fromMethodDescriptorString(string4, clazz.getClassLoader());
                MethodHandle methodHandle = lookup.findVirtual(clazz, string3, methodType5);
                return new ConstantCallSite(methodHandle.asType(methodType));
            }
        }
        throw new IllegalArgumentException("invalid native bootstrap selector");
    }

    private static /* synthetic */ String lOkIikmni(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-18, -43, -42, 71, 81, 73, 76, 55, 94, -93, -32, 19, 125, 69, 13, -111};
        byte[] byArray3 = new byte[]{-86, -78, 39, -110, 29, -106, 19, -89, -90, 70, 62, -97, 124, -113, -83, -49};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void lIO0pqnOs(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[157];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            int n = 0;
            while (n < string.length()) {
                int n2 = string.charAt(n) << 8 | string.charAt(n + 1);
                int n3 = string.charAt(n + 2) << 8 | string.charAt(n + 3);
                int n4 = n + 4;
                nArray[n2] = stringBuilder.length() << 16 | n3;
                stringBuilder.append(string, n4, n4 + n3);
                n = n4 + n3;
            }
        }
        I1IjI = stringBuilder.toString();
        lOqilini = nArray;
    }
}
