/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNYO
 *  KDFzREm.NNde
 *  KDFzREm.NNuU
 *  KDFzREm.NQl
 *  KDFzREm.NQo
 *  KDFzREm.NXi
 *  org.joml.Vector2f
 *  org.joml.Vector3d
 */
package KDFzREm;

import KDFzREm.Bm;
import KDFzREm.Mn;
import KDFzREm.NNNYO;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NXi;
import KDFzREm.RV;
import KDFzREm.Rs;
import KDFzREm.Ru;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZH;
import KDFzREm.Zu;
import KDFzREm.dx;
import KDFzREm.iw;
import KDFzREm.kW;
import KDFzREm.mB;
import KDFzREm.mE;
import KDFzREm.mU;
import KDFzREm.mW;
import KDFzREm.mb;
import KDFzREm.mm;
import KDFzREm.ms;
import KDFzREm.mz;
import KDFzREm.q;
import KDFzREm.uF;
import KDFzREm.wR;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector2f;
import org.joml.Vector3d;

@UZ(L="AnarchyHelper", y=UR.MISC, N=Uz.HELPER)
public class mZ
extends UM
implements mB {
    private static short[] R;
    private static short[] M;
    private static byte[] B;
    private static short[] Z;
    private static short[] z;
    private static short[] U;
    private static short[] W;
    private static String[] m;
    public Object[] L;
    private static String[] P;
    private static boolean[] s;
    private static short[] T;
    private static byte[] b;
    private static byte[] j;
    private static float[] v;
    private static short[] n;
    private static byte[] t;
    private static String[] G;
    private static String[] l;
    public Object[] u;
    private static String[] d;
    private static short[] w;
    private static String[] k;
    public Object[] i;
    private static /* synthetic */ String IltkOjp;
    private static /* synthetic */ int[] oonjI;

    private static /* synthetic */ String w(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-15, -113, -65, -71, 97, -10, 123, -42, 30, -106, -66, -43, -52, 9, -79, 83};
        int n = 0;
        int n2 = 39;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 29;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(-n, 19) ^ 0x8CE669BA, 13), 24);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-31, 5, -108, -71, -54, -38, 34, 35, 120, 70, 4, -121, 67, -81, 124, 121};
        int n = 0;
        int n2 = 20;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 81;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        j = new byte[]{13, 2};
        B = new byte[]{3, 4, 5, 6, 7, 8};
        t = new byte[]{9, 10, 11, 12, 2};
        b = new byte[]{-10, 16, 4, 6, 8};
    }

    private static /* synthetic */ String P(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, 14, -9, -66, -128, 92, -126, -116, -49, 9, 93, 60, -9, 119, 77, -109};
        int n = 0;
        int n2 = 59;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String T(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-41, 99, -119, -63, 109, -124, -124, -32, 72, -42, -83, -114, 91, -88, 52, -118};
        int n = 0;
        int n2 = 240;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 89;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void T() {
        s = new boolean[]{false, true, false, false, false};
    }

    private static /* synthetic */ String Q(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{9, 35, 11, -8, -16, -50, -91, -9, 60, 46, -101, 34, -65, 74, -57, -111};
        int n = 0;
        int n2 = 252;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 251;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public mZ() {
        mZ.llststs("itongjo", -671640283, 672667205, 672667204, 672667207, -671640283, -671640283, -671640283, (mZ)this);
        mU mU2 = new mU(this, (String)((Object)mZ.llststs("kqjxu", -671640287, 672667205, 672667156, 672667159, -671640287, -671640287, -671640287)[0]), (NQl)mZ.llststs("lsoxkm", -671640287, 672667158, 672667153, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667156, 672667159, -671640287, -671640287, -671640287)[1]), (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667156, 672667159, -671640287, -671640287, -671640287)[2]));
        mZ.llststs("fautvh", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("kaaj", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[0]] = mU2;
        mU mU3 = new mU(this, (String)((Object)mZ.llststs("ixye", -671640287, 672667205, 672667156, 672667159, -671640287, -671640287, -671640287)[3]), (NQl)mZ.llststs("yfllrml", -671640287, 672667158, 672667155, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("kaaj", -671640287, 672667205, 672667156, 672667159, -671640287, -671640287, -671640287)[4]), (String)((Object)mZ.llststs("lsoxkm", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[0]));
        mZ.llststs("fautvh", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[1]] = mU3;
        mU mU4 = new mU(this, (String)((Object)mZ.llststs("fautvh", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[1]), (NQl)mZ.llststs("kqjxu", -671640287, 672667158, 672667165, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("lsoxkm", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[2]), (String)((Object)mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[3]));
        mZ.llststs("kaaj", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("yfllrml", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[2]] = mU4;
        mU mU5 = new mU(this, (String)((Object)mZ.llststs("ixye", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[4]), (NQl)mZ.llststs("ixye", -671640287, 672667158, 672667164, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("lsoxkm", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[5]), (String)((Object)mZ.llststs("mwoktwig", -671640287, 672667205, 672667154, 672667159, -671640287, -671640287, -671640287)[6]));
        mZ.llststs("jswjfxqq", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("fautvh", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[3]] = mU5;
        mU mU6 = new mU(this, (String)((Object)mZ.llststs("jswjfxqq", -671640287, 672667205, 672667167, 672667159, -671640287, -671640287, -671640287)[0]), (NQl)mZ.llststs("lsoxkm", -671640287, 672667158, 672667166, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667167, 672667159, -671640287, -671640287, -671640287)[1]), (String)((Object)mZ.llststs("lsoxkm", -671640287, 672667205, 672667167, 672667159, -671640287, -671640287, -671640287)[2]));
        mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("lsoxkm", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[4]] = mU6;
        mU mU7 = new mU(this, (String)((Object)mZ.llststs("mwoktwig", -671640287, 672667205, 672667167, 672667159, -671640287, -671640287, -671640287)[3]), (NQl)mZ.llststs("fautvh", -671640287, 672667158, 672667161, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("yfllrml", -671640287, 672667205, 672667167, 672667159, -671640287, -671640287, -671640287)[4]), (String)((Object)mZ.llststs("tazkt", -671640287, 672667205, 672667167, 672667159, -671640287, -671640287, -671640287)[5]));
        mZ.llststs("kqjxu", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("ixye", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[5]] = mU7;
        mU mU8 = new mU(this, (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667160, 672667159, -671640287, -671640287, -671640287)[0]), (NQl)mZ.llststs("kaaj", -671640287, 672667158, 672667163, 672667152, -671640287, -671640287, -671640287), (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667160, 672667159, -671640287, -671640287, -671640287)[1]), (String)((Object)mZ.llststs("kaaj", -671640287, 672667205, 672667160, 672667159, -671640287, -671640287, -671640287)[2]));
        mZ.llststs("jswjfxqq", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("lsoxkm", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[6]] = mU8;
        mz mz2 = new mz(this, (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667160, 672667159, -671640287, -671640287, -671640287)[3]), (q)((Object)mZ.llststs("kaaj", -671640287, 672667162, 672667173, 672667172, -671640287, -671640287, -671640287)), (String)((Object)mZ.llststs("lsoxkm", -671640287, 672667205, 672667160, 672667159, -671640287, -671640287, -671640287)[4]));
        mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("qqolyin", -671640287, 672667205, 672667241, 672667203, -671640287, -671640287, -671640287)[7]] = mz2;
        mz mz3 = new mz(this, (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667160, 672667159, -671640287, -671640287, -671640287)[5]), (q)((Object)mZ.llststs("kqjxu", -671640287, 672667162, 672667138, 672667172, -671640287, -671640287, -671640287)), (String)((Object)mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[0]));
        mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("fautvh", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[0]] = mz3;
        mz mz4 = new mz(this, (String)((Object)mZ.llststs("kqjxu", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[1]), (q)((Object)mZ.llststs("kqjxu", -671640287, 672667162, 672667213, 672667172, -671640287, -671640287, -671640287)), (String)((Object)mZ.llststs("yfllrml", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[2]));
        mZ.llststs("lsoxkm", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("itongjo", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[1]] = mz4;
        mz mz5 = new mz(this, (String)((Object)mZ.llststs("mwoktwig", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[3]), (q)((Object)mZ.llststs("kaaj", -671640287, 672667162, 672667236, 672667172, -671640287, -671640287, -671640287)), (String)((Object)mZ.llststs("kqjxu", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[4]));
        mZ.llststs("tazkt", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("yfllrml", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[2]] = mz5;
        mz mz6 = new mz(this, (String)((Object)mZ.llststs("jswjfxqq", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[5]), (q)((Object)mZ.llststs("kaaj", -671640287, 672667162, 672667174, 672667172, -671640287, -671640287, -671640287)), (String)((Object)mZ.llststs("fautvh", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[6]));
        mZ.llststs("yfllrml", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[3]] = mz6;
        mz mz7 = new mz(this, (String)((Object)mZ.llststs("itongjo", -671640287, 672667205, 672667175, 672667159, -671640287, -671640287, -671640287)[7]), (q)((Object)mZ.llststs("mwoktwig", -671640287, 672667162, 672667200, 672667172, -671640287, -671640287, -671640287)), (String)((Object)mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667169, 672667159, -671640287, -671640287, -671640287)[0]));
        mZ.llststs("kqjxu", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("yfllrml", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[4]] = mz7;
        Object[] objectArray = new mU[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667230, 672667227, -671640287, -671640287, -671640287)[0]];
        objectArray[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667238, 672667263, -671640287, -671640287, -671640287)[0]] = (mU)((Object)mZ.llststs("kaaj", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[5]]);
        objectArray[mZ.llststs("mwoktwig", -671640287, 672667205, 672667238, 672667263, -671640287, -671640287, -671640287)[1]] = (mU)((Object)mZ.llststs("yfllrml", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667173, 672667203, -671640287, -671640287, -671640287)[6]]);
        objectArray[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667230, 672667227, -671640287, -671640287, -671640287)[1]] = (mU)((Object)mZ.llststs("fautvh", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("yfllrml", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[0]]);
        objectArray[mZ.llststs("qqolyin", -671640287, 672667205, 672667246, 672667227, -671640287, -671640287, -671640287)[0]] = (mU)((Object)mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("yfllrml", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[1]]);
        objectArray[mZ.llststs("qqolyin", -671640287, 672667205, 672667246, 672667227, -671640287, -671640287, -671640287)[1]] = (mU)((Object)mZ.llststs("ixye", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("mwoktwig", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[2]]);
        objectArray[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667246, 672667227, -671640287, -671640287, -671640287)[2]] = (mU)((Object)mZ.llststs("lsoxkm", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("fautvh", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[3]]);
        objectArray[mZ.llststs("qqolyin", -671640287, 672667205, 672667246, 672667227, -671640287, -671640287, -671640287)[3]] = (mU)((Object)mZ.llststs("itongjo", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("mwoktwig", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[4]]);
        objectArray[mZ.llststs("itongjo", -671640287, 672667205, 672667246, 672667227, -671640287, -671640287, -671640287)[4]] = (mU)((Object)mZ.llststs("ixye", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[5]]);
        objectArray[mZ.llststs("yfllrml", -671640287, 672667205, 672667246, 672667227, -671640287, -671640287, -671640287)[5]] = (mU)((Object)mZ.llststs("mwoktwig", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("kqjxu", -671640287, 672667205, 672667168, 672667203, -671640287, -671640287, -671640287)[6]]);
        objectArray[mZ.llststs("mwoktwig", -671640287, 672667205, 672667138, 672667227, -671640287, -671640287, -671640287)[0]] = (mU)((Object)mZ.llststs("ixye", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("ixye", -671640287, 672667205, 672667171, 672667203, -671640287, -671640287, -671640287)[0]]);
        objectArray[mZ.llststs("tazkt", -671640287, 672667205, 672667138, 672667227, -671640287, -671640287, -671640287)[1]] = (mU)((Object)mZ.llststs("qqolyin", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("kqjxu", -671640287, 672667205, 672667171, 672667203, -671640287, -671640287, -671640287)[1]]);
        objectArray[mZ.llststs("itongjo", -671640287, 672667205, 672667138, 672667227, -671640287, -671640287, -671640287)[2]] = (mU)((Object)mZ.llststs("lsoxkm", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("tazkt", -671640287, 672667205, 672667171, 672667203, -671640287, -671640287, -671640287)[2]]);
        objectArray[mZ.llststs("qqolyin", -671640287, 672667205, 672667138, 672667227, -671640287, -671640287, -671640287)[3]] = (mU)((Object)mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("kqjxu", -671640287, 672667205, 672667170, 672667203, -671640287, -671640287, -671640287)[0]]);
        CallSite callSite = mZ.llststs("kaaj", -671640277, 672667214, 672667181, 672667180, -671640277, -671640277, -671640277, (Object[])objectArray);
        mZ.llststs("kqjxu", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("lsoxkm", -671640287, 672667205, 672667170, 672667203, -671640287, -671640287, -671640287)[1]] = callSite;
        mb mb2 = new mb();
        mZ.llststs("itongjo", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("itongjo", -671640287, 672667205, 672667170, 672667203, -671640287, -671640287, -671640287)[2]] = mb2;
        ms ms2 = new ms(this, (mb)((Object)mZ.llststs("lsoxkm", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("fautvh", -671640287, 672667205, 672667183, 672667203, -671640287, -671640287, -671640287)[0]]));
        mZ.llststs("itongjo", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("yfllrml", -671640287, 672667205, 672667183, 672667203, -671640287, -671640287, -671640287)[1]] = ms2;
        mE mE2 = new mE(this);
        mZ.llststs("lsoxkm", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("ixye", -671640287, 672667205, 672667183, 672667203, -671640287, -671640287, -671640287)[2]] = mE2;
        wR wR2 = new wR((int)mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667238, 672667263, -671640287, -671640287, -671640287)[2]);
        mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667183, 672667203, -671640287, -671640287, -671640287)[3]] = wR2;
    }

    static {
        mZ.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, -17, 55, -13, 95, 21, 125, -126, 18, -82, -102, -114, -123, -25, -59, 95};
        int n = 0;
        int n2 = 106;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 83;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String I(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{101, -84, -123, -63, 86, 55, 94, 64, -117, 77, -83, 7, -29, 53, -101, -44};
        int n = 0;
        int n2 = 33;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 175;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{125, -63, 3, 71, -78, -107, 13, 120, -117, 60, -89, -43, -109, 119, -126, -19};
        int n = 0;
        int n2 = 162;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 207;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-112, -78, -68, -34, 110, 98, -63, 33, -16, 35, 87, 125, 31, -47, 82, -94};
        int n = 0;
        int n2 = 212;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 77;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft((Integer.rotateRight(n ^ 0xC35B1289, 18) ^ 0x8FBB6C7A) + 1, 25);
    }

    private void b() {
        CallSite callSite;
        if (mZ.llststs("itongjo", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this) == null) {
            mZ.llststs("kaaj", -671640282, 672667205, 672667236, 672667201, -671640282, -671640282, -671640282, (mZ)this, (Object[])new Object[mZ.llststs("tazkt", -671640287, 672667205, 672667204, 672667227, -671640287, -671640287, -671640287)[2]]);
            callSite = mZ.llststs("ixye", -671640281, 672667205, 672667236, 672667201, -671640281, -671640281, -671640281, (mZ)this);
        }
        if (mZ.llststs("ixye", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this) == null) {
            mZ.llststs("fautvh", -671640282, 672667205, 672667220, 672667201, -671640282, -671640282, -671640282, (mZ)this, (Object[])new Object[mZ.llststs("fautvh", -671640287, 672667205, 672667204, 672667227, -671640287, -671640287, -671640287)[3]]);
            callSite = mZ.llststs("itongjo", -671640281, 672667205, 672667220, 672667201, -671640281, -671640281, -671640281, (mZ)this);
        }
        if (mZ.llststs("fautvh", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this) == null) {
            mZ.llststs("ixye", -671640282, 672667205, 672667206, 672667201, -671640282, -671640282, -671640282, (mZ)this, (Object[])new Object[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667204, 672667227, -671640287, -671640287, -671640287)[4]]);
            callSite = mZ.llststs("tazkt", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this);
        }
    }

    private static /* synthetic */ String b(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-38, -105, -20, -16, 98, 68, 8, -79, -56, -115, 36, -13, -47, -16, 74, 3};
        int n = 0;
        int n2 = 54;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 53;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void s() {
        P = new String[]{"desorientation", "\u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f", "desorientation", "trap", "\u0422\u0440\u0430\u043f\u043a\u0430"};
        k = new String[]{"trap", "god-aura", "\u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430", "godsaura", "sheer-dust", "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", "sheerdust"};
        G = new String[]{"stratum", "\u041f\u043b\u0430\u0441\u0442", "stratum", "snowball", "\u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430", "freezeball"};
        d = new String[]{"fierytornado", "\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447", "fierytornado", "holy-water", "potion-holy-water", "rage"};
        l = new String[]{"potion-rage", "paladin", "potion-paladin", "assassin", "potion-assassin", "drowsiness", "potion-drowsiness", "radiation"};
        m = new String[]{"potion-radiation"};
    }

    private static /* synthetic */ String s(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-112, -85, -43, 57, -109, 109, -96, -37, 17, 81, 54, 32, -75, -119, -93, -119};
        int n = 0;
        int n2 = 51;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 193;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String n(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-70, -91, -41, 2, 89, 48, 36, -106, -22, -12, -67, -69, -32, -112, 27, 106};
        int n = 0;
        int n2 = 255;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 81;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String l(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{45, 103, 16, -31, -91, -53, -114, -30, -50, -70, 12, -77, -42, 32, 100, -53};
        int n = 0;
        int n2 = 182;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 251;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String d(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-66, -122, 73, -114, 84, -99, 115, 37, 85, -42, -54, 17, 41, 109, -73, -128};
        int n = 0;
        int n2 = 51;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 63;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void m() {
        v = new float[]{0.0f};
    }

    private static /* synthetic */ String m(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{51, 39, -127, 116, 34, 97, 47, -58, 24, 8, 112, 101, -46, 82, -98, 124};
        int n = 0;
        int n2 = 241;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 7;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String k(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{41, 66, -36, 33, -111, -82, 90, -91, 20, 40, -82, 35, -82, -112, -84, -117};
        int n = 0;
        int n2 = 89;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String t(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-117, -40, 115, 74, -110, 123, -5, 3, -115, 90, -24, -52, 110, 92, 69, 126};
        int n = 0;
        int n2 = 203;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 217;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String g(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{116, 26, -7, 69, 114, 24, 59, -37, -106, 114, 15, 104, 41, 83, -43, -108};
        int n = 0;
        int n2 = 193;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 57;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String v(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{2, -60, 88, 22, 42, 86, -87, 113, -34, 102, -45, -52, 96, 52, -81, 13};
        int n = 0;
        int n2 = 144;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            ++n2;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String j(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-44, 45, 11, -26, 86, 78, -58, 23, 85, 61, -65, -8, -69, 3, -34, -26};
        int n = 0;
        int n2 = 13;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 65;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void j() {
        Z = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
        W = new short[]{4, 5, 0, 1, 2, 0, 1};
        T = new short[]{2, 3, 0, 1, 2, 3, 4};
        n = new short[]{5, 0, 1};
        w = new short[]{2, 3, 4};
        U = new short[]{4, 5, 6, 7};
        R = new short[]{3, 6, 5, 7};
        z = new short[]{7, 5, 5, 4, 4, 0, 5};
        M = new short[]{3, 7};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{125, 91, -74, -84, 10, 17, 79, -49, 30, 25, 82, -15, -20, -41, -35, 89};
        int n = 0;
        int n2 = 126;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-108, 87, -15, 59, -22, -68, -59, 36, -122, 11, -41, -126, -73, 20, 101, 9};
        int n = 0;
        int n2 = 161;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 215;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 25), 1), 25) ^ 0x513E4875, 18);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-118, -116, 68, -118, 96, 25, -78, -111, -17, 47, -21, -8, -15, 50, -94, -92};
        int n = 0;
        int n2 = 16;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 73;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 25) ^ 0x81876D9B, 24), 19), 15);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, -98, -30, 9, 8, 27, 60, 22, 80, -39, -106, 108, -92, -34, -126, 42};
        int n = 0;
        int n2 = 249;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 221;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{22, 28, 2, -107, -44, -56, -110, -5, 78, 6, -29, -89, -18, -58, -26, 117};
        int n = 0;
        int n2 = 88;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 227;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight((Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-n, 27), 21) ^ 0x53D94440, 1) ^ 0xF47599F5) + 1, 1);
    }

    @Override
    public void N(dx dx2) {
        mZ.llststs("ruhxoxyc", -671640283, 672667205, 672667204, 672667207, 1272656357, -885556870, -1018865111, (mZ)this);
        mZ.llststs("itongjo", -671640283, 672667149, 672667213, 672667150, 1272656357, -885556870, -1018865111, (wR)((wR)((Object)mZ.llststs("kaaj", -671640281, 672667205, 672667206, 672667201, -1306743320, 1197780573, 1027139679, (mZ)this)[mZ.llststs("kqjxu", -671640287, 672667205, 672667244, 672667203, -724475175, -1409979483, 10994292)[1]])), (dx)dx2);
    }

    @uF
    public void N(Ru ru) {
        mZ.llststs("jswjfxqq", -671640283, 672667205, 672667204, 672667207, 1272656357, -885556870, -1018865111, (mZ)this);
        mZ.llststs("ixye", -671640283, 672667149, 672667213, 672667148, 1272656357, -885556870, -1018865111, (wR)((wR)((Object)mZ.llststs("itongjo", -671640281, 672667205, 672667206, 672667201, 837312382, -1781838149, 1490089396, (mZ)this)[mZ.llststs("lsoxkm", -671640287, 672667205, 672667136, 672667203, -1438911142, -867182485, 1407582181)[3]])), (int)(mZ.llststs("jswjfxqq", -671640277, 672667139, 672667236, 672667208, 1272656357, -885556870, -1018865111) != false ? mZ.llststs("kqjxu", -671640287, 672667205, 672667138, 672667227, 1739472430, -841151128, 1748561398)[4] : mZ.llststs("fautvh", -671640287, 672667205, 672667238, 672667263, 1453363386, 189369575, 2142522443)[3]));
        mZ.llststs("mwoktwig", -671640283, 672667149, 672667229, 672667151, 1272656357, -885556870, -1018865111, (wR)((wR)((Object)mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667206, 672667201, -351657853, -2121520301, 1298333049, (mZ)this)[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667200, 672667203, 2052331019, -1583548382, 2090950486)[0]])), (Object)ru);
    }

    @uF
    public void N(Ry ry) {
        mZ.llststs("lsoxkm", -671640283, 672667205, 672667204, 672667207, 1272656357, -885556870, -1018865111, (mZ)this);
        mZ.llststs("ruhxoxyc", -671640283, 672667202, 672667213, 672667207, 1272656357, -885556870, -1018865111, (ms)((ms)((Object)mZ.llststs("ixye", -671640281, 672667205, 672667206, 672667201, 1487062061, 1430079907, 64633878, (mZ)this)[mZ.llststs("mwoktwig", -671640287, 672667205, 672667200, 672667203, -445128750, 71995191, 1728687540)[1]])));
    }

    @uF
    public void N(RV rV) {
        mZ.llststs("tazkt", -671640283, 672667205, 672667204, 672667207, 1272656357, -885556870, -1018865111, (mZ)this);
        CallSite callSite = mZ.llststs("ruhxoxyc", -671640283, 672667212, 672667213, 672667215, 1272656357, -885556870, -1018865111, (mb)((mb)((Object)mZ.llststs("fautvh", -671640281, 672667205, 672667206, 672667201, -2071208814, 1988574152, -1705546259, (mZ)this)[mZ.llststs("lsoxkm", -671640287, 672667205, 672667200, 672667203, 853155214, -1211860531, 471571511)[4]])));
        if (mZ.llststs("kaaj", -671640278, 672667214, 672667209, 672667208, 1272656357, -885556870, -1018865111, (List)((Object)callSite)) != false) {
            return;
        }
        CallSite callSite2 = mZ.llststs("lsoxkm", -671640278, 672667214, 672667211, 672667210, 1272656357, -885556870, -1018865111, (List)((Object)callSite));
        CallSite callSite3 = mZ.llststs("ruhxoxyc", -671640277, 672667221, 672667220, 672667223, 1272656357, -885556870, -1018865111);
        while (mZ.llststs("yfllrml", -671640278, 672667222, 672667217, 672667208, 1272656357, -885556870, -1018865111, (Iterator)((Object)callSite2)) != false) {
            mW mW2 = (mW)((Object)mZ.llststs("yfllrml", -671640278, 672667222, 672667216, 672667219, 1272656357, -885556870, -1018865111, (Iterator)((Object)callSite2)));
            CallSite callSite4 = mZ.llststs("mwoktwig", -671640283, 672667218, 672667229, 672667228, 1272656357, -885556870, -1018865111, (mW)mW2);
            CallSite callSite5 = mZ.llststs("itongjo", -671640283, 672667224, 672667229, 672667228, 1272656357, -885556870, -1018865111, (kW)((Object)mZ.llststs("lsoxkm", -671640277, 672667231, 672667230, 672667225, 1272656357, -885556870, -1018865111)));
            reference var8_8 = callSite4 - callSite5;
            if (var8_8 < mZ.llststs("itongjo", -671640287, 672667205, 672667204, 672667227, -1108395409, -1046761268, 349634700)[0]) {
                mZ.llststs("ruhxoxyc", -671640278, 672667222, 672667226, 672667207, 1272656357, -885556870, -1018865111, (Iterator)((Object)callSite2));
                continue;
            }
            CallSite callSite6 = mZ.llststs("mwoktwig", -671640283, 672667232, 672667229, 672667235, 1272656357, -885556870, -1018865111, (NNde)mZ.llststs("ixye", -671640283, 672667239, 672667238, 672667233, 1272656357, -885556870, -1018865111, (NNNYO)((NNNYO)mZ.llststs("tazkt", -671640281, 672667237, 672667236, 672667201, -1445473178, -1955978780, 400552433, (NNuU)((NNuU)mZ.llststs("ruhxoxyc", -671640281, 672667205, 672667229, 672667201, 114135692, 2090955311, 1947237777, (mZ)this)[mZ.llststs("fautvh", -671640287, 672667205, 672667200, 672667203, 735007883, 409200306, 975336124)[5]]))[mZ.llststs("ruhxoxyc", -671640287, 672667205, 672667200, 672667203, 1994338156, -2144405293, 887856783)[6]])));
            CallSite callSite7 = mZ.llststs("ruhxoxyc", -671640283, 672667240, 672667243, 672667242, 1272656357, -885556870, -1018865111, (Vector3d)mZ.llststs("itongjo", -671640283, 672667218, 672667213, 672667234, 1272656357, -885556870, -1018865111, (mW)mW2), (double)mZ.llststs("lsoxkm", -671640281, 672667245, 672667244, 672667247, -170575014, 182636823, -987625511, (NXi)callSite6), (double)mZ.llststs("ruhxoxyc", -671640281, 672667245, 672667246, 672667247, 819159245, -2131490492, -1580967204, (NXi)callSite6), (double)mZ.llststs("ixye", -671640281, 672667245, 672667241, 672667247, -1524657623, -2061227274, 1663081759, (NXi)callSite6), (Vector3d)new Vector3d());
            CallSite callSite8 = mZ.llststs("yfllrml", -671640277, 672667252, 672667213, 672667255, 1272656357, -885556870, -1018865111, (float)((float)mZ.llststs("kqjxu", -671640281, 672667240, 672667253, 672667247, -1438100419, -1809869447, 1207487166, (Vector3d)callSite7)), (float)((float)mZ.llststs("jswjfxqq", -671640281, 672667240, 672667229, 672667247, -2038922056, 110302456, 2061083390, (Vector3d)callSite7)), (float)((float)mZ.llststs("ruhxoxyc", -671640281, 672667240, 672667200, 672667247, 1858847252, -321905900, -1820024413, (Vector3d)callSite7)));
            if (callSite8 == null) continue;
            callSite8 = mZ.llststs("ixye", -671640283, 672667254, 672667249, 672667248, 1272656357, -885556870, -1018865111, (Vector2f)callSite8);
            CallSite callSite9 = mZ.llststs("yfllrml", -671640278, 672667250, 672667229, 672667228, 1272656357, -885556870, -1018865111, (mm)((Object)mZ.llststs("ruhxoxyc", -671640283, 672667218, 672667220, 672667251, 1272656357, -885556870, -1018865111, (mW)mW2)));
            CallSite callSite10 = callSite9 <= 0 ? mZ.llststs("kqjxu", -671640287, 672667205, 672667261, 672667260, 1591629132, -881583846, 1071579089)[0] : (CallSite)((float)mZ.llststs("ixye", -671640277, 672667262, 672667257, 672667256, 1272656357, -885556870, -1018865111, (int)var8_8, (int)mZ.llststs("ixye", -671640287, 672667205, 672667238, 672667263, 50737401, -1492677789, -1335729000)[4]) / (float)callSite9);
            mZ.llststs("fautvh", -671640277, 672667252, 672667213, 672667137, 1272656357, -885556870, -1018865111, (Bm)((Object)callSite3), (Zu)((Object)mZ.llststs("itongjo", -671640283, 672667258, 672667220, 672667141, 1272656357, -885556870, -1018865111, (ZH)((ZH)((Object)mZ.llststs("itongjo", -671640287, 672667259, 672667229, 672667201, -939245521, 1833481798, -1252403061)[mZ.llststs("mwoktwig", -671640287, 672667205, 672667244, 672667203, -1053970469, -693167394, -1130373403)[0]])))), (String)((Object)mZ.llststs("ixye", -671640278, 672667250, 672667213, 672667140, 1272656357, -885556870, -1018865111, (mm)((Object)mZ.llststs("fautvh", -671640283, 672667218, 672667220, 672667251, 1272656357, -885556870, -1018865111, (mW)mW2)))), (int)mZ.llststs("yfllrml", -671640287, 672667205, 672667204, 672667227, 592801, 1349380016, 865910531)[1], (float)mZ.llststs("fautvh", -671640281, 672667254, 672667253, 672667143, 504298542, -1458676973, -1697518415, (Vector2f)callSite8), (float)mZ.llststs("tazkt", -671640281, 672667254, 672667229, 672667143, -787014043, -898520203, 1315745808, (Vector2f)callSite8), (NQo)mZ.llststs("itongjo", -671640283, 672667218, 672667206, 672667142, 1272656357, -885556870, -1018865111, (mW)mW2), (int)var8_8, (float)callSite10);
        }
    }

    @uF
    public void N(Mn mn) {
        mZ.llststs("jswjfxqq", -671640283, 672667205, 672667204, 672667207, 1272656357, -885556870, -1018865111, (mZ)this);
        mZ.llststs("ruhxoxyc", -671640283, 672667202, 672667229, 672667207, 1272656357, -885556870, -1018865111, (ms)((ms)((Object)mZ.llststs("yfllrml", -671640281, 672667205, 672667206, 672667201, 733834292, -1035179530, 2131458846, (mZ)this)[mZ.llststs("jswjfxqq", -671640287, 672667205, 672667200, 672667203, 1692553140, 167996879, 892682132)[2]])));
        mZ.llststs("lsoxkm", -671640283, 672667212, 672667229, 672667207, 1272656357, -885556870, -1018865111, (mb)((mb)((Object)mZ.llststs("mwoktwig", -671640281, 672667205, 672667206, 672667201, 917200866, -879904468, 50376959, (mZ)this)[mZ.llststs("kqjxu", -671640287, 672667205, 672667200, 672667203, -1819822699, 1201245978, -478414095)[3]])));
    }

    @uF
    public void N(Rs rs) {
        mZ.llststs("kqjxu", -671640283, 672667205, 672667204, 672667207, 1272656357, -885556870, -1018865111, (mZ)this);
        mZ.llststs("qqolyin", -671640283, 672667145, 672667213, 672667144, 1272656357, -885556870, -1018865111, (mE)((mE)((Object)mZ.llststs("jswjfxqq", -671640281, 672667205, 672667206, 672667201, -1947326424, 1472354155, -1618759959, (mZ)this)[mZ.llststs("tazkt", -671640287, 672667205, 672667136, 672667203, 1872559726, 504354398, 53103113)[1]])), (Rs)rs);
        mZ.llststs("ruhxoxyc", -671640283, 672667202, 672667213, 672667144, 1272656357, -885556870, -1018865111, (ms)((ms)((Object)mZ.llststs("itongjo", -671640281, 672667205, 672667206, 672667201, -1078756163, -834945042, 1243406023, (mZ)this)[mZ.llststs("kaaj", -671640287, 672667205, 672667136, 672667203, -71487372, 956549161, 1991706827)[2]])), (Rs)rs);
    }

    @uF(u=true)
    public void N(iw iw2) {
        mZ.llststs("tazkt", -671640283, 672667205, 672667204, 672667207, -671640283, -671640283, -671640283, (mZ)this);
        mZ.llststs("jswjfxqq", -671640278, 672667214, 672667147, 672667146, -671640278, -671640278, -671640278, (List)((List)((Object)mZ.llststs("ixye", -671640281, 672667205, 672667206, 672667201, -671640281, -671640281, -671640281, (mZ)this)[mZ.llststs("mwoktwig", -671640287, 672667205, 672667136, 672667203, -671640287, -671640287, -671640287)[0]])), mU2 -> mZ.llststs("qqolyin", -671640283, 672667157, 672667229, 672667151, -671640283, -671640283, -671640283, (mU)mU2, (Object)iw2));
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{23, 105, -121, 89, -17, -97, 62, -63, 77, -97, -40, 4, -89, -61, -46, -124};
        int n = 0;
        int n2 = 106;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-90, 120, -88, 91, -34, -120, -12, -49, -109, 86, 12, -83, 76, 42, -15, 108};
        int n = 0;
        int n2 = 165;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 19;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String O(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{31, 55, 44, 6, -92, -26, -118, -88, 76, 17, 79, 81, 8, -13, -109, 83};
        int n = 0;
        int n2 = 79;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 47;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String G(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-79, -32, -16, -126, -7, -35, 41, -101, 60, 19, -9, 47, 82, -30, 104, -82};
        int n = 0;
        int n2 = 41;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 149;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-119, 10, -112, 81, 54, -40, 25, 54, 95, -109, -58, 101, -97, -25, 62, -7};
        int n = 0;
        int n2 = 252;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 5;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        IltkOjp = "\u00b8D\u00caF\u00cfE\u000eIZ\u00d49)\u00c5\u00c1o\u00f9R\u00f9\u0085o\u00fey\u00fcc\u000b\u0014ggx\u0084D\u00caF\u00cfE\u000eIw\u00feKD\u00caF\u00cfE\u000eIm\u00c6\u00a4ZZD\u00caF\u00cfE\u000eIm\u00fe\u00f8)\u00c0w\u00d9F\u00194E\u00f1\u001cS\u00cf{KD\u00caF\u00cfE\u000eIB\u00c6\u00b7a\u00fa]\u00b2u\u0017\u000fl\u00b3\u007fx\u00d14\u00a8()\u00c0w\u00d9F\u00194E\u00f1\u001cK\u00d7{9I\u00a5j\u000fK\u00c8z\u00e7R&\u000b/\u00ed\b\u00d4)\u00c0S\u00efgL\fo\u00f1_>\u00f4%s\u0004\u0093r\u00beZ\u00a6\\JF\u00b8D\u00caF\u00cfE\u000eIV\bZy)\u00c0S\u00efgL\fo\u00f1_>\u00f4%s;>r\u00bfX\u00a6\u00e8L\u00e6]\u00ebaL\na\u00f2T>\u00ed\"z\u0015\u00d0t\u00b7\u00f8F\u00caz\u00b4L\f\u0014g\u00b3Y~\u00cf,?\u0019\u00b5c\u00f8S\u00ef2\u0005]!\u00b7D\u00caF\u00cfE\u000eIN\u00d2Wt\u00d6\u00e7)\u00c0V\u00fcv\u0002Il\u00fd]v\u008d\u000fr%\u00aac\u00f8\u0007\u00b7a\u00fa]\u00b2l\u0002\bg\u00b3~p\u00d6(\u0015a\u00fa]\u00b2u\u0017\u000fl\u00b3ze\u00c72q;\u0010r*\u00de\u0017\u009bD\u00caF\u00cfE\u000eIN\u00d2}H\u00ed\u00db)\u00c0V\u00fcv\u0002Iu\u00e8Z}\u008d\td*\u0081a\u00f8S\u00ef;\u0093D\u00caF\u00cfE\u000eIN\u00c4Z\u009f\u009eI\u00c5\u0015\u00d4\u0093D\u00caF\u00cfE\u000eIw\u00ce\u0096\u00b7\f\u0010r\u00eb\u0013\u00f7o\u000e\n/\u00caVr\u00d6/b}\u0019\u00a1\u00fdD\u00caF\u00cfE\u000eIk\u00cb\u009e)\u00d6k)\u00c0V\u00fcv\u0002Il\u00fd]v\u008d\u0013d\u0002*n\u00eb\u0007W)\u00c0w\u00d9F\u00194E\u00f1\u001c_\u00f3/+\u00e7)\u00c0w\u00d9F\u00194E\u00f1\u001c_\u00fa)+{L\u00e6]\u00ebaL\na\u00f2T>\u00ed\"z*0t\u00b7\u0015\u00cb\u00dbD\u00c8x\u00d1o\u0011\u0001/\u00f6\\|\u00ceoF*\u0090t\u00e3N\u00aedXOL\u00f3Av\u008d*\u007f\"\u009f/\u00daY\u00fet\f\u00143\u00f8\b&4D\u00caF\u00cfE\u000eIN\u00cdR\u00ae\u00a8D\u00caF\u00cfE\u000eIZ\u00c49[\u00c0V\u00fcv\u0002Il\u00fd]v\u008d\u000fr\u001atc\u00f8\u0007\u00b4L\t\u0007v\u00fd\u001cd\u00d6)|_]i\u00ffH\u00a6\u0096\u0081e\u00e1S\u00ebe\u001aD\u00caF\u00cfE\u000eIm\u00f1\u009bL\u00c7x\u00dbz1#m\u00b3q|\u0099\f[4\u00f5z\u00dey\u00f0/9\u0013;\u00d0Yp\u00d4!?\u001c\u00d2n\u00eb\u0013\u00cet\u0011\u000fn\u00fb\bX\u00e4\u0006\\;\u00f7F\u00f6n\u00d8mL(Q\u00f3\bX\u00e4iF\u00dba\u00ffr\u00f8x\u0017KD\u00caF\u00cfE\u000eIN\u00d2FD\u00e1a\u00f4\u008bL\u00e6]\u00ebaL\na\u00f2T>\u00f14b&\u00beg\u00b7\u00ddG\u00b8B\u00b7f\u008at\u00e9N\u00fct\f\u0014\u009b)\u00c0w\u00d9F\u00194E\u00f1\u001c_\u00ec$uK\u00dbL\u00e6]\u00ebaL\u0013t\u00f5_>\u00c45~,\u0087i\u00e3R\u00b2C\f\bs\u00e9^t\u00d0{9\u0019{)\u00c0V\u00fcv\u0002Iu\u00e8Z}\u008d\fy<';\u00b3y\u00c7D\u00caF\u00cfE\u000eIm\u00d9\u00bcKD\u00caF\u00cfE\u000eIm\u00c9\u001aD\u00caF\u00cfE\u000eIm\u00cb\u00ae3\u0018D\u00caF\u00cfE\u000eIy\u001aD\u00caF\u00cfE\u000eIm\u00ef\u00d2\u00a4)\u00c0w\u00d9F\u00194E\u00f1\u001cz\u00f5{\u00e6PW:\u0094S\u0092e\u00f4H\u00b0K\u00c8z\u00e7R&\u000b/\u00d2b}\u0099\u0013\u00f8)\u00da\u009bW\bD\u00caF\u00cfE\u000eIw\u00ed\u00d9r\u00eb\u0013\u00f7o\u000e\n/\u00caVr\u00d6/bC\u00d2\u00066\u00e5s\u00c9Q\u00edt\u001a\u00f5L\u00c7x\u00dbz1#m\u00b3Wi\u0099iF\u00abs%\u00a1\u0090u\u00ee\u00e7)\u00c0w\u00d9F\u00194E\u00f1\u001c|\u00cf{\u009eL\u00c7x\u00dbz1#m\u00b3ab\u0099iF'\u0086";
        oonjI = new int[]{2555914, 14942209, 56426499, 52559873, 12124179, 62521345, 55115778, 53215242, 37158913, 0x33000A, 49152018, 0x55000E, 58654727, 25559043, 45481992, 20316182, 4915210, 58589185, 3997710, 18087954, 42401799, 55246852, 15859732, 51838986, 60293121, 655363, 52625417, 23592961, 53936142, 24903690, 0x2B20002, 37224454, 42860556, 19267585, 19464205, 23658497, 46006288, 15007756, 28049423, 10747925, 21757963, 9830401, 19398657, 22478849, 0xF10001, 57409553, 0x3990003, 30408747, 0x1C0001, 56754186, 13369368, 23724049, 851973, 8454165, 60555278, 37617674, 52494337, 9895938, 0xA20002, 17170446, 43646979, 22544389, 34078730, 10, 6553614, 25755668, 23527425, 27066383, 38273087, 34013185, 1900554, 60227585, 22872074, 7471108, 29032469, 59113487, 50462730, 61472783, 1179655, 47054880, 51183626, 56360961, 43843603, 33292299, 0x2B00002, 55509005, 56623106, 55050241, 60096514, 1703938, 0x190001, 0x3000002, 54853634, 53870593, 3211266, 0x990009, 54984705, 7733259, 51118081, 62455809, 19333121, 6488065, 24838145, 33226753, 45350914, 34734117, 58523649};
        mZ.j();
        mZ.P();
        mZ.T();
        mZ.m();
        mZ.s();
    }

    private static /* synthetic */ CallSite llststs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = oonjI[n2 ^ 0x28181645];
        int n9 = n8 >>> 16;
        String string2 = mZ.lIOlnintl(IltkOjp.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x28181645);
        n8 = oonjI[n3 ^ 0x28181645];
        int n10 = n8 >>> 16;
        String string3 = mZ.lIOlnintl(IltkOjp.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x28181645);
        n8 = oonjI[n4 ^ 0x28181645];
        int n11 = n8 >>> 16;
        String string4 = mZ.lIOlnintl(IltkOjp.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x28181645);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD7F79593) + -178;
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

    private static /* synthetic */ String lIOlnintl(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{78, -109, -127, 13, -62, 31, -98, -8, -106, 49, -83, 95, -3, -67, 29, -78};
        byte[] byArray3 = new byte[]{0, 98, -37, 94, 105, -122, 46, -33, 32, 9, -60, -75, -55, 127, 105, 85};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lOrIlpr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = oonjI[n2 ^ 0x28181645];
        int n8 = n7 >>> 16;
        String string2 = mZ.lIOlnintl(IltkOjp.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x28181645);
        n7 = oonjI[n3 ^ 0x28181645];
        int n9 = n7 >>> 16;
        String string3 = mZ.lIOlnintl(IltkOjp.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x28181645);
        n7 = oonjI[n4 ^ 0x28181645];
        int n10 = n7 >>> 16;
        String string4 = mZ.lIOlnintl(IltkOjp.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x28181645);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD7F79593) + -178;
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

    private static /* synthetic */ void OOmtIkpm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[107];
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
        IltkOjp = stringBuilder.toString();
        oonjI = nArray;
    }

    private static /* synthetic */ CallSite IItI0ipsj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oonjI[n2 ^ 0x28181645];
        int n7 = n6 >>> 16;
        String string2 = mZ.lIOlnintl(IltkOjp.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x28181645);
        n6 = oonjI[n3 ^ 0x28181645];
        int n8 = n6 >>> 16;
        String string3 = mZ.lIOlnintl(IltkOjp.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x28181645);
        n6 = oonjI[n4 ^ 0x28181645];
        int n9 = n6 >>> 16;
        String string4 = mZ.lIOlnintl(IltkOjp.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x28181645);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD7F79593) + -178;
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
}
