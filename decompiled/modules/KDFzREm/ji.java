/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNUB
 */
package KDFzREm;

import KDFzREm.ML;
import KDFzREm.MT;
import KDFzREm.MW;
import KDFzREm.MZ;
import KDFzREm.Mi;
import KDFzREm.Mu;
import KDFzREm.NNUB;
import KDFzREm.RK;
import KDFzREm.RO;
import KDFzREm.RQ;
import KDFzREm.RX;
import KDFzREm.Ra;
import KDFzREm.Rg;
import KDFzREm.Rh;
import KDFzREm.Rj;
import KDFzREm.Rp;
import KDFzREm.Rv;
import KDFzREm.Rw;
import KDFzREm.Rx;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.jB;
import KDFzREm.jL;
import KDFzREm.jM;
import KDFzREm.jN;
import KDFzREm.jR;
import KDFzREm.ju;
import KDFzREm.jy;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

@UZ(L="Removals", y=UR.VISUAL, N=Uz.SCREEN)
public class ji
extends UM {
    private static short[] B;
    private static String[] Z;
    public Object[] L;
    private static byte[] z;
    private static boolean[] U;
    private static short[] W;
    private static boolean[] m;
    private static byte[] P;
    private static short[] s;
    private static short[] T;
    private static short[] b;
    private static short[] j;
    private static boolean[] v;
    private static String[] n;
    private static byte[] t;
    private static boolean[] G;
    private static String[] l;
    private static String[] d;
    public Object[] u;
    public Object[] i;
    private static boolean[] w;
    private static boolean[] k;
    public Object[] R;
    private static String[] Y;
    private static short[] Q;
    private static short[] O;
    private static byte[] g;
    private static short[] I;
    private static String[] J;
    private static boolean[] o;
    private static boolean[] q;
    private static boolean[] K;
    private static byte[] V;
    public Object[] M;
    private static byte[] e;
    private static boolean[] H;
    private static float[] c;
    private static boolean[] X;
    private static /* synthetic */ String Ilpnmrtt;
    private static /* synthetic */ int[] IIrpsjrOi;

    private static /* synthetic */ String w(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{1, -70, -97, 63, 51, -30, 95, -29, 56, -3, 99, 58, -44, 73, -29, -115};
        int n = 0;
        int n2 = 186;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 81;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int L(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 4), 9) ^ 0x19E8D721, 21) ^ 0x66AB7A82) + 1 ^ 0x9D385C;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-95, -20, -77, -18, -111, -49, 87, 95, 28, -116, -122, 66, -16, 92, -116, -112};
        int n = 0;
        int n2 = 22;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 107;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        b = new short[]{0, 1, 2, 3, 0, 1, 0};
        j = new short[]{1, 2};
        W = new short[]{0, 1, 2, 3};
        O = new short[]{4, 5, 6, 0, 3, 2, 0, 1};
        B = new short[]{3, 4};
        Q = new short[]{1, 5, 2};
        s = new short[]{1, 0, 0};
        T = new short[]{1, 2, 6, 7, 0, 1, 7, 0};
        I = new short[]{1};
    }

    private static /* synthetic */ String P(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-21, -3, -11, 87, -128, 30, 64, -61, -40, 88, 16, -13, -44, -85, -2, -97};
        int n = 0;
        int n2 = 152;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 39;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String T(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{13, -12, 53, -24, 89, -60, -36, -14, -125, -126, 104, 87, -79, -53, 20, -14};
        int n = 0;
        int n2 = 107;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 111;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void T() {
        CallSite callSite;
        if (ji.IlkOlrO("nkpnawl", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this) == null) {
            ji.IlkOlrO("ohobcm", -1337186220, -1812642170, -1812642161, -1812642164, -1337186220, -1337186220, (ji)this, (Object[])new Object[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[2]]);
            callSite = ji.IlkOlrO("yejouoi", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this);
        }
        if (ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642153, -1812642164, -1337186219, -1337186219, (ji)this) == null) {
            ji.IlkOlrO("nkpnawl", -1337186220, -1812642170, -1812642153, -1812642164, -1337186220, -1337186220, (ji)this, (Object[])new Object[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[3]]);
            callSite = ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642153, -1812642164, -1337186219, -1337186219, (ji)this);
        }
        if (ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this) == null) {
            ji.IlkOlrO("cpojw", -1337186220, -1812642170, -1812642155, -1812642164, -1337186220, -1337186220, (ji)this, (Object[])new Object[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[4]]);
            callSite = ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this);
        }
        if (ji.IlkOlrO("cpojw", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this) == null) {
            ji.IlkOlrO("yejouoi", -1337186220, -1812642170, -1812642146, -1812642164, -1337186220, -1337186220, (ji)this, (Object[])new Object[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[5]]);
            callSite = ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this);
        }
        if (ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642116, -1812642164, -1337186219, -1337186219, (ji)this) == null) {
            ji.IlkOlrO("cpojw", -1337186220, -1812642170, -1812642116, -1812642164, -1337186220, -1337186220, (ji)this, (Object[])new Object[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[6]]);
            callSite = ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642116, -1812642164, -1337186219, -1337186219, (ji)this);
        }
    }

    public ji() {
        ji.IlkOlrO("yejouoi", -1337186217, -1812642170, -1812642171, -1812642174, -1337186217, -1337186217, (ji)this);
        Class[] classArray = new Class[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642175, -1812642162, -1337186221, -1337186221)[1]];
        classArray[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642175, -1812642162, -1337186221, -1337186221)[2]] = ML.class;
        jR jR2 = new jR((String)((Object)ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642173, -1812642176, -1337186221, -1337186221)[0]), (boolean)ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642175, -1812642162, -1337186221, -1337186221)[0], classArray);
        ji.IlkOlrO("nkpnawl", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[0]] = jR2;
        Class[] classArray2 = new Class[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642175, -1812642162, -1337186221, -1337186221)[4]];
        classArray2[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642175, -1812642162, -1337186221, -1337186221)[5]] = Mi.class;
        jR jR3 = new jR((String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642173, -1812642176, -1337186221, -1337186221)[1]), (boolean)ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642175, -1812642162, -1337186221, -1337186221)[3], classArray2);
        ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[1]] = jR3;
        Class[] classArray3 = new Class[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642165, -1812642162, -1337186221, -1337186221)[1]];
        classArray3[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642165, -1812642162, -1337186221, -1337186221)[2]] = RQ.class;
        jR jR4 = new jR((String)((Object)ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642173, -1812642176, -1337186221, -1337186221)[2]), (boolean)ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642165, -1812642162, -1337186221, -1337186221)[0], classArray3);
        ji.IlkOlrO("wcnyukio", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[2]] = jR4;
        Class[] classArray4 = new Class[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642165, -1812642162, -1337186221, -1337186221)[4]];
        classArray4[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642167, -1812642162, -1337186221, -1337186221)[0]] = RO.class;
        jR jR5 = new jR((String)((Object)ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642168, -1812642176, -1337186221, -1337186221)[0]), (boolean)ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642165, -1812642162, -1337186221, -1337186221)[3], classArray4);
        ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[3]] = jR5;
        Class[] classArray5 = new Class[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642167, -1812642162, -1337186221, -1337186221)[2]];
        classArray5[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[0]] = Rg.class;
        jR jR6 = new jR((String)((Object)ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642168, -1812642176, -1337186221, -1337186221)[1]), (boolean)ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642167, -1812642162, -1337186221, -1337186221)[1], classArray5);
        ji.IlkOlrO("cpojw", -1337186219, -1812642170, -1812642153, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[4]] = jR6;
        Class[] classArray6 = new Class[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[2]];
        classArray6[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[3]] = MT.class;
        jR jR7 = new jR((String)((Object)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642156, -1812642176, -1337186221, -1337186221)[0]), (boolean)ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[1], classArray6);
        ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642153, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[5]] = jR7;
        Class[] classArray7 = new Class[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[5]];
        classArray7[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[6]] = Rj.class;
        jR jR8 = new jR((String)((Object)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642156, -1812642176, -1337186221, -1337186221)[1]), (boolean)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[4], classArray7);
        ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642163, -1812642166, -1337186221, -1337186221)[6]] = jR8;
        Class[] classArray8 = new Class[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642158, -1812642162, -1337186221, -1337186221)[0]];
        classArray8[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642158, -1812642162, -1337186221, -1337186221)[1]] = Rv.class;
        jR jR9 = new jR((String)((Object)ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642156, -1812642176, -1337186221, -1337186221)[2]), (boolean)ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642154, -1812642162, -1337186221, -1337186221)[7], classArray8);
        ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642157, -1812642166, -1337186221, -1337186221)[0]] = jR9;
        Class[] classArray9 = new Class[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[1]];
        classArray9[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[2]] = RK.class;
        jR jR10 = new jR((String)((Object)ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642160, -1812642176, -1337186221, -1337186221)[0]), (boolean)ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[0], classArray9);
        ji.IlkOlrO("ocormr", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642157, -1812642166, -1337186221, -1337186221)[1]] = jR10;
        Class[] classArray10 = new Class[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[4]];
        classArray10[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[5]] = Mu.class;
        jR jR11 = new jR((String)((Object)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642160, -1812642176, -1337186221, -1337186221)[1]), (boolean)ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[3], classArray10);
        ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642145, -1812642166, -1337186221, -1337186221)[0]] = jR11;
        Class[] classArray11 = new Class[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[7]];
        classArray11[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[0]] = Rx.class;
        jR jR12 = new jR((String)((Object)ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642160, -1812642176, -1337186221, -1337186221)[2]), (boolean)ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642159, -1812642162, -1337186221, -1337186221)[6], classArray11);
        ji.IlkOlrO("yejouoi", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642145, -1812642166, -1337186221, -1337186221)[1]] = jR12;
        Class[] classArray12 = new Class[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[2]];
        classArray12[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[3]] = Rh.class;
        jR jR13 = new jR((String)((Object)ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[0]), (boolean)ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[1], classArray12);
        ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642145, -1812642166, -1337186221, -1337186221)[2]] = jR13;
        ju ju2 = new ju((String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[1]), (boolean)ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[4]);
        ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642145, -1812642166, -1337186221, -1337186221)[3]] = ju2;
        jN jN2 = new jN((String)((Object)ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[2]), (boolean)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[5]);
        ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[0]] = jN2;
        jL jL2 = new jL((String)((Object)ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[3]), (boolean)ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642148, -1812642162, -1337186221, -1337186221)[6]);
        ji.IlkOlrO("cpojw", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[1]] = jL2;
        jy jy2 = new jy((String)((Object)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[4]), (boolean)ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642149, -1812642162, -1337186221, -1337186221)[0]);
        ji.IlkOlrO("nkpnawl", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[2]] = jy2;
        lv[] lvArray = new jM[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642152, -1812642151, -1337186221, -1337186221)[0]];
        lvArray[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642149, -1812642162, -1337186221, -1337186221)[1]] = (jR)((Object)ji.IlkOlrO("ocormr", -1337186219, -1812642170, -1812642153, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[3]]);
        lvArray[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642149, -1812642162, -1337186221, -1337186221)[2]] = (jR)((Object)ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[4]]);
        lvArray[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642152, -1812642151, -1337186221, -1337186221)[1]] = (jR)((Object)ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[5]]);
        lvArray[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642152, -1812642151, -1337186221, -1337186221)[2]] = (jR)((Object)ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[6]]);
        lvArray[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642152, -1812642151, -1337186221, -1337186221)[3]] = (jR)((Object)ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642161, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642150, -1812642166, -1337186221, -1337186221)[7]]);
        lvArray[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642138, -1812642151, -1337186221, -1337186221)[0]] = (ju)((Object)ji.IlkOlrO("wcnyukio", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642137, -1812642166, -1337186221, -1337186221)[0]]);
        lvArray[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642138, -1812642151, -1337186221, -1337186221)[1]] = (jN)((Object)ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642137, -1812642166, -1337186221, -1337186221)[1]]);
        lvArray[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642138, -1812642151, -1337186221, -1337186221)[2]] = (jR)((Object)ji.IlkOlrO("pxrcat", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642140, -1812642166, -1337186221, -1337186221)[0]]);
        lvArray[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642138, -1812642151, -1337186221, -1337186221)[3]] = (jL)((Object)ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642140, -1812642166, -1337186221, -1337186221)[1]]);
        lvArray[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642138, -1812642151, -1337186221, -1337186221)[4]] = (jR)((Object)ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642140, -1812642166, -1337186221, -1337186221)[2]]);
        lvArray[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642138, -1812642151, -1337186221, -1337186221)[5]] = (jR)((Object)ji.IlkOlrO("wcnyukio", -1337186219, -1812642170, -1812642153, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642139, -1812642166, -1337186221, -1337186221)[0]]);
        lvArray[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642142, -1812642151, -1337186221, -1337186221)[0]] = (jR)((Object)ji.IlkOlrO("wcnyukio", -1337186219, -1812642170, -1812642155, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642139, -1812642166, -1337186221, -1337186221)[1]]);
        lvArray[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642142, -1812642151, -1337186221, -1337186221)[1]] = (jR)((Object)ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642139, -1812642166, -1337186221, -1337186221)[2]]);
        lvArray[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642142, -1812642151, -1337186221, -1337186221)[2]] = (jR)((Object)ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642171, -1812642166, -1337186221, -1337186221)[0]]);
        lvArray[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642142, -1812642151, -1337186221, -1337186221)[3]] = (jR)((Object)ji.IlkOlrO("rfjxkk", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642171, -1812642166, -1337186221, -1337186221)[1]]);
        lvArray[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642142, -1812642151, -1337186221, -1337186221)[4]] = (jy)((Object)ji.IlkOlrO("yejouoi", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642171, -1812642166, -1337186221, -1337186221)[2]]);
        CallSite callSite = ji.IlkOlrO("ohobcm", -1337186215, -1812642141, -1812642144, -1812642143, -1337186215, -1337186215, (lY)this, (String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[5]), (lv[])lvArray);
        ji.IlkOlrO("nkpnawl", -1337186219, -1812642170, -1812642146, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642171, -1812642166, -1337186221, -1337186221)[3]] = callSite;
        lv[] lvArray2 = new jB[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642130, -1812642151, -1337186221, -1337186221)[0]];
        NNUB[] nNUBArray = new NNUB[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642130, -1812642151, -1337186221, -1337186221)[1]];
        nNUBArray[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642132, -1812642162, -1337186221, -1337186221)[1]] = ji.IlkOlrO("rfjxkk", -1337186221, -1812642131, -1812642134, -1812642133, -1337186221, -1337186221);
        nNUBArray[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642132, -1812642162, -1337186221, -1337186221)[2]] = ji.IlkOlrO("ohobcm", -1337186221, -1812642131, -1812642136, -1812642133, -1337186221, -1337186221);
        lvArray2[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642149, -1812642162, -1337186221, -1337186221)[3]] = new jB((String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642129, -1812642176, -1337186221, -1337186221)[0]), (boolean)ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642132, -1812642162, -1337186221, -1337186221)[0], nNUBArray);
        NNUB[] nNUBArray2 = new NNUB[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[1]];
        nNUBArray2[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[2]] = ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642131, -1812642122, -1812642133, -1337186221, -1337186221);
        lvArray2[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642132, -1812642162, -1337186221, -1337186221)[3]] = new jB((String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642129, -1812642176, -1337186221, -1337186221)[1]), (boolean)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[0], nNUBArray2);
        NNUB[] nNUBArray3 = new NNUB[ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[4]];
        nNUBArray3[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[5]] = ji.IlkOlrO("ohobcm", -1337186221, -1812642131, -1812642121, -1812642133, -1337186221, -1337186221);
        lvArray2[ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642130, -1812642151, -1337186221, -1337186221)[2]] = new jB((String)((Object)ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642129, -1812642176, -1337186221, -1337186221)[2]), (boolean)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[3], nNUBArray3);
        NNUB[] nNUBArray4 = new NNUB[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642124, -1812642151, -1337186221, -1337186221)[0]];
        nNUBArray4[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[7]] = ji.IlkOlrO("pxrcat", -1337186221, -1812642131, -1812642123, -1812642133, -1337186221, -1337186221);
        nNUBArray4[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642126, -1812642162, -1337186221, -1337186221)[0]] = ji.IlkOlrO("pxrcat", -1337186221, -1812642131, -1812642125, -1812642133, -1337186221, -1337186221);
        nNUBArray4[ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642124, -1812642151, -1337186221, -1337186221)[1]] = ji.IlkOlrO("ohobcm", -1337186221, -1812642131, -1812642128, -1812642133, -1337186221, -1337186221);
        lvArray2[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642130, -1812642151, -1337186221, -1337186221)[3]] = new jB((String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642129, -1812642176, -1337186221, -1337186221)[3]), (boolean)ji.IlkOlrO("cpojw", -1337186221, -1812642170, -1812642135, -1812642162, -1337186221, -1337186221)[6], nNUBArray4);
        NNUB[] nNUBArray5 = new NNUB[ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[1]];
        nNUBArray5[ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642126, -1812642162, -1337186221, -1337186221)[2]] = ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642131, -1812642114, -1812642133, -1337186221, -1337186221);
        nNUBArray5[ji.IlkOlrO("pxrcat", -1337186221, -1812642170, -1812642126, -1812642162, -1337186221, -1337186221)[3]] = ji.IlkOlrO("pxrcat", -1337186221, -1812642131, -1812642113, -1812642133, -1337186221, -1337186221);
        lvArray2[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642127, -1812642151, -1337186221, -1337186221)[0]] = new jB((String)((Object)ji.IlkOlrO("mbrqrdpr", -1337186221, -1812642170, -1812642129, -1812642176, -1337186221, -1337186221)[4]), (boolean)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642126, -1812642162, -1337186221, -1337186221)[1], nNUBArray5);
        CallSite callSite2 = ji.IlkOlrO("wcnyukio", -1337186215, -1812642141, -1812642144, -1812642143, -1337186215, -1337186215, (lY)this, (String)((Object)ji.IlkOlrO("nkpnawl", -1337186221, -1812642170, -1812642147, -1812642176, -1337186221, -1337186221)[6]), (lv[])lvArray2);
        ji.IlkOlrO("mbrqrdpr", -1337186219, -1812642170, -1812642116, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642171, -1812642166, -1337186221, -1337186221)[4]] = callSite2;
        CallSite callSite3 = ji.IlkOlrO("nkpnawl", -1337186215, -1812642141, -1812642169, -1812642117, -1337186215, -1337186215, (lY)this, (String)((Object)ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642129, -1812642176, -1337186221, -1337186221)[5]), (float)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642115, -1812642118, -1337186221, -1337186221)[0], (float)ji.IlkOlrO("ohobcm", -1337186221, -1812642170, -1812642115, -1812642118, -1337186221, -1337186221)[1], (float)ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642115, -1812642118, -1337186221, -1337186221)[2], (float)ji.IlkOlrO("ocormr", -1337186221, -1812642170, -1812642115, -1812642118, -1337186221, -1337186221)[3]);
        ji.IlkOlrO("wcnyukio", -1337186219, -1812642170, -1812642116, -1812642164, -1337186219, -1337186219, (ji)this)[ji.IlkOlrO("rfjxkk", -1337186221, -1812642170, -1812642171, -1812642166, -1337186221, -1337186221)[5]] = callSite3;
    }

    static {
        ji.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{37, 116, -79, -109, -45, 73, -117, -98, 78, -126, -94, -81, -119, -86, -39, -14};
        int n = 0;
        int n2 = 70;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-85, -73, 9, -3, -53, -75, 116, 43, 36, 109, -70, 6, -55, -95, -127, -75};
        int n = 0;
        int n2 = 84;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 131;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 31), 4) ^ 0x85ECA435, 6), 10), 9);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-102, -90, 25, -83, -103, -35, -8, 7, 127, -41, -100, 51, 35, 109, -106, -54};
        int n = 0;
        int n2 = 94;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 119;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        t = new byte[]{16, 2, 3, 4};
        P = new byte[]{5, 6, 7, 8, 9, 10};
        V = new byte[]{11, 12, 13, 14, 15};
        e = new byte[]{5, 2, 2, 3};
        g = new byte[]{3, 2};
        z = new byte[]{4, 2, 4, 2, 3, 8, 2};
    }

    private static /* synthetic */ String b(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{105, -70, -22, -86, -115, 80, -6, 9, 93, 80, -62, 29, -6, -78, 97, -99};
        int n = 0;
        int n2 = 85;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 139;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String s(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{63, 117, 54, -67, -17, 7, 1, -75, 75, 86, -55, -52, -71, 73, 79, -107};
        int n = 0;
        int n2 = 90;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 157;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void s() {
        d = new String[]{"tilt-view", "vignette-overlay", "fire-overlay"};
        Z = new String[]{"under-water-overlay", "wall-overlay"};
        Y = new String[]{"rain", "fog", "blindness"};
        J = new String[]{"nausea", "totem-pop", "status-effect-overlay"};
        n = new String[]{"scoreboard", "holograms", "camera-clip", "heart-effect", "fishing-bobber", "removals", "sounds"};
        l = new String[]{"trident", "wither-spawn", "end-portal-open", "anarchy-events", "exp-bottle", "sound-multiplier"};
    }

    private static /* synthetic */ String n(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-119, 33, 53, -115, 46, -6, -78, -37, 79, -9, -26, -100, -57, 62, -84, -15};
        int n = 0;
        int n2 = 119;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 141;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String l(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{36, 62, 18, 103, -49, -126, -13, -117, -88, 52, -20, -38, 61, 102, 106, -59};
        int n = 0;
        int n2 = 29;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 5;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String d(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-22, -47, 103, -72, 102, -9, 91, 87, -79, -71, 73, -60, -43, -35, -72, -17};
        int n = 0;
        int n2 = 236;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 99;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String m(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{50, -62, -105, 58, 74, -101, -57, -71, 120, -64, -70, -56, -109, -109, 120, -126};
        int n = 0;
        int n2 = 16;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 53;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void m() {
        k = new boolean[]{true, true, false, true, true, false};
        X = new boolean[]{true, true, false, true, true};
        H = new boolean[]{false, true, true};
        q = new boolean[]{false, true, true, false, true, true, false, true};
        m = new boolean[]{true, false};
        K = new boolean[]{true, true, false, true, true, false, true, true};
        w = new boolean[]{false, true, true, false, true, true, true};
        o = new boolean[]{true, false, true, false};
        v = new boolean[]{true, false, true, true};
        G = new boolean[]{true, true, false, true, true, false, true, false};
        U = new boolean[]{true, true, false, true};
    }

    private static /* synthetic */ String t(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-69, -12, -35, 15, 54, -12, 42, 51, 57, -79, -84, -74, 39, -59, -123, -46};
        int n = 0;
        int n2 = 73;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 123;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String v(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-123, -31, 45, -127, -40, -5, 93, -72, -48, -63, 97, 31, 23, 58, -79, 7};
        int n = 0;
        int n2 = 23;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 91;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void j() {
        c = new float[]{0.5f, 0.0f, 1.0f, 0.01f};
    }

    private static /* synthetic */ String j(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-38, 119, 28, 97, 54, 89, 102, -116, -69, -23, 19, -120, -115, -83, -63, 60};
        int n = 0;
        int n2 = 77;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-91, -69, 0, 54, -41, 90, -84, 97, -124, 46, 89, -89, 71, -125, 59, -6};
        int n = 0;
        int n2 = 158;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 153;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-58, -27, 118, 120, -95, -45, 4, 112, 118, 24, 24, 80, -89, 72, -41, 107};
        int n = 0;
        int n2 = 4;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 159;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{64, 13, 85, 24, 63, -63, 91, -102, -6, 12, 70, 85, 122, -114, -118, 86};
        int n = 0;
        int n2 = 119;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 217;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft((Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(n, 22), 18), 1), 25) ^ 0x1D5D6C9) + 1 ^ 0xDABE177A, 8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{63, -46, 7, 79, -123, -120, -111, 89, 45, 30, -31, -99, 85, 79, -51, -110};
        int n = 0;
        int n2 = 38;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 191;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n, 5) ^ 0x4C9D5805, 6) ^ 0xB0E70A86, 22), 24), 13), 11);
    }

    private static /* synthetic */ String E(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-65, -37, 17, 86, -78, -39, 3, 40, 34, -50, -66, 119, 0, 70, 66, -102};
        int n = 0;
        int n2 = 71;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 99;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(MT mT) {
        ji.IlkOlrO("wcnyukio", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)mT);
    }

    @uF
    public void N(RX rX) {
        ji.IlkOlrO("yejouoi", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rX);
    }

    @uF
    public void N(Mu mu) {
        ji.IlkOlrO("rfjxkk", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)mu);
    }

    private void N(Object object) {
        ji.IlkOlrO("cpojw", -1337186217, -1812642170, -1812642171, -1812642174, -749438630, 583005623, (ji)this);
        ji.IlkOlrO("wcnyukio", -1337186216, -1812642106, -1812642105, -1812642108, -749438630, 583005623, (List)((List)((Object)ji.IlkOlrO("ohobcm", -1337186217, -1812642120, -1812642155, -1812642119, -749438630, 583005623, (lj)((lj)((Object)ji.IlkOlrO("nkpnawl", -1337186219, -1812642170, -1812642146, -1812642164, -1213272800, -1169540952, (ji)this)[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642171, -1812642166, 300246214, -1054540659)[6]]))))), jM2 -> ji.IlkOlrO("pxrcat", -1337186217, -1812642092, -1812642144, -1812642172, -749438630, 583005623, (jM)jM2, (Object)object));
    }

    @uF
    public void N(Rg rg) {
        ji.IlkOlrO("ocormr", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rg);
    }

    @uF
    public void N(RK rK) {
        ji.IlkOlrO("rfjxkk", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rK);
    }

    @uF
    public void N(Rv rv) {
        ji.IlkOlrO("yejouoi", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rv);
    }

    @uF
    public void N(MZ mZ) {
        ji.IlkOlrO("ohobcm", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)mZ);
    }

    @uF
    public void N(RO rO) {
        ji.IlkOlrO("ocormr", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rO);
    }

    @uF
    public void N(Ra ra) {
        ji.IlkOlrO("pxrcat", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)ra);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(-n, 14) ^ 0x2F4B151C, 21), 8);
    }

    @uF
    public void N(RQ rQ) {
        ji.IlkOlrO("pxrcat", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rQ);
    }

    @uF
    public void N(Rw rw) {
        ji.IlkOlrO("ocormr", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rw);
    }

    @uF
    public void N(Rx rx) {
        ji.IlkOlrO("yejouoi", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rx);
    }

    @uF
    public void N(Mi mi) {
        ji.IlkOlrO("nkpnawl", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)mi);
    }

    @uF
    public void N(Rp rp) {
        ji.IlkOlrO("mbrqrdpr", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rp);
    }

    @uF
    public void N(Rh rh) {
        ji.IlkOlrO("rfjxkk", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rh);
    }

    @uF
    public void N(ML mL) {
        ji.IlkOlrO("yejouoi", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)mL);
    }

    @uF
    public void N(Rj rj) {
        ji.IlkOlrO("pxrcat", -1337186217, -1812642170, -1812642169, -1812642172, -749438630, 583005623, (ji)this, (Object)rj);
    }

    @uF
    public void N(MW mW) {
        ji.IlkOlrO("wcnyukio", -1337186217, -1812642170, -1812642171, -1812642174, -749438630, 583005623, (ji)this);
        CallSite callSite = ji.IlkOlrO("mbrqrdpr", -1337186216, -1812642106, -1812642107, -1812642110, -749438630, 583005623, (List)((List)((Object)ji.IlkOlrO("ocormr", -1337186217, -1812642120, -1812642155, -1812642119, -749438630, 583005623, (lj)((lj)((Object)ji.IlkOlrO("ohobcm", -1337186219, -1812642170, -1812642116, -1812642164, 1300797519, 849300833, (ji)this)[ji.IlkOlrO("wcnyukio", -1337186221, -1812642170, -1812642171, -1812642166, -1393483053, -138403343)[7]]))))));
        while (ji.IlkOlrO("nkpnawl", -1337186216, -1812642109, -1812642112, -1812642111, -749438630, 583005623, (Iterator)((Object)callSite)) != false) {
            jB jB2 = (jB)((Object)ji.IlkOlrO("nkpnawl", -1337186216, -1812642109, -1812642098, -1812642119, -749438630, 583005623, (Iterator)((Object)callSite)));
            if (ji.IlkOlrO("wcnyukio", -1337186217, -1812642097, -1812642169, -1812642100, -749438630, 583005623, (jB)jB2, (MW)mW) == false) continue;
            ji.IlkOlrO("yejouoi", -1337186217, -1812642090, -1812642169, -1812642089, -749438630, 583005623, (MW)mW, (float)ji.IlkOlrO("nkpnawl", -1337186217, -1812642101, -1812642104, -1812642103, -749438630, 583005623, (Float)((Float)((Object)ji.IlkOlrO("ocormr", -1337186217, -1812642102, -1812642155, -1812642119, -749438630, 583005623, (lQ)((lQ)((Object)ji.IlkOlrO("ocormr", -1337186219, -1812642170, -1812642116, -1812642164, 488667617, 353763160, (ji)this)[ji.IlkOlrO("yejouoi", -1337186221, -1812642170, -1812642099, -1812642166, 1062657927, 2120013228)[0]])))))));
        }
    }

    private static /* synthetic */ String W(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{85, -107, -123, 35, -16, -86, -38, 60, 1, -108, 57, 75, -93, -38, 102, -18};
        int n = 0;
        int n2 = 12;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 185;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-55, -33, 40, 74, -2, 34, -25, -20, 4, -93, -56, -27, -21, -27, 79, -80};
        int n = 0;
        int n2 = 214;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 71;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String G(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, 88, -103, -77, -51, -49, -1, -83, 95, 104, -3, -120, -79, 102, 99, 63};
        int n = 0;
        int n2 = 107;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 57;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ilpnmrtt = "\u00f3F4{\u001a\u0085I\u00d8\u00b1-\u0003x\u00a9\u00c7\u00a4\u00d0\u00f6U\raO\u00bbc\u0004`g\u00b5P\u009e\u00b1h\u0014l\u0006\\O\u00a2x\u00dc\u00f2L\u0004Y\u008e\u008e\u00aak({C\u0091\u0012\u00dd\u00bcl-#\u009f\u00c1\u00b7\u00d4\u009f@yUGl\u000e\u0018\u0090c\u0004`g\u00b5P\u009e\u00b7k\u0098\u00dd\u000e\u000epT\u0086\\\u009e\u00a8v#`\u00e3\u00fc\u00b1\u00c1\u0087F6uG\u00cb\u008cc\u0004`g\u00b5P\u009e\u0093L\u001fY2F4{\u001a\u009c\\\u00df\u00ba-\f`\u00a3\u00d4\u00b1\u00b8H\u008b\u00aa\u0007d7\u000f\u0095E\u0085\u00ffk({C\u0091\u0012\u00dd\u00bcl-#\u0083\u00d7\u00afe\u00b4Sy3c\u00a0\u0000Yc\u0004`g\u00b5P\u009e\u00b7@\u00a3\u00f3\u00a9k({C\u0091\u0012\u00dd\u00bcl-#\u0083\u00d7\u00af\u00c6\u0091Sy\u009cH0_T\u0093U[e\u00dak\t^s\u008ao\u00f4\u00b0-\u0007[\u00f7\u009c\u009fh(\u000e\u0004\u00bb\u00d2c\u0004`g\u00b5P\u009e\u00b1i\u0096K-{A\u00a6\\\u00dd\u00a8g\u00ffk({C\u0091\u0012\u00c4\u00a9k&#\u00aa\u00c0\u00abc\u00a3N-t\u001a\u00b3R\u00df\u00aew'i\u00be\u008e\u00ecV>\u0084\u00a4\u00fd\u00b0\u009cc\u0004`g\u00b5P\u009e\u00b7O\u0089O\u00a9\u008e\u00b9\u0086GT\u0090c\u0004`g\u00b5P\u009e\u0090U\u00b7\u0084sF\u00d2akL\u00bae\u008e/\u00a5\u00afN(\u000e\u000epT\u0086\\\u009e\u00b1c$k\u00e3\u00fa\u00a7\u00e7eD6!\u00b1F4{\u001a\u0085I\u00d8\u00b1-\u0006e\u00bf\u00c1\u001dc\u0004`g\u00b5P\u009e\u00b1SE\u0099F1TP\u0088I\u00b0}\u0085B:n\u00dd\u000e\u0014~\u0088\u00e3l\u0019\u00b4^\u00aa\u0091^US'hT\u0084R\u00c3\rtpk\t^s\u008ao\u00f4\u00b0-&U\u00f7\u00f9\u00af\u00e0.FmvT\u009eZ\u009e\u008ev8e\u00a2\u00d2\u00fe\u00c7\u001ea\u00043y\u00bby\u00f7\u00a7P\u000fa\u00e3\u00d9\u0094\u00balk\t^s\u008ao\u00f4\u00b0-&U\u00f7\u00f9\u00af\u00dc2FmvT\u009eZ\u009e\u008ev8e\u00a2\u00d2\u00fe\u00e6\bl\u0006\\O\u00a2x\u00dc\u00f2n<7\u00e5\u00f9\u008e\u00f9\u0002]\u0010_X\u00dfQ\u00db\u00e6\u0087\u008e";
        IIrpsjrOi = new int[]{4521994, 25493505, 9175061, 14286849, 24969219, 0x1160001, 2949139, 20905985, 24576002, 25559041, 11468819, 0x1400001, 26345474, 10616833, 8650753, 8519681, 25624577, 20185089, 19202049, 0x400001, 5177345, 11403265, 14548993, 0x880001, 19267585, 24051713, 9109505, 19136513, 25427969, 8847361, 20250625, 13172738, 8585217, 0x810001, 19333121, 0x140001, 11337729, 14614538, 0x1810001, 29622329, 33423361, 0x1800001, 0x1140001, 0x66000C, 8716290, 2031630, 0x1220002, 0x410001, 25690114, 21037058, 0x1170001, 20316162, 0xA10001, 25296898, 8978434, 0x1130001, 20709378, 19398658, 33357825, 0x1150001, 0x120002, 26476592, 1376266, 21168148, 22478862, 12713991, 15925280, 25821192, 5242902, 18, 0x1700007, 4325379, 24707076, 0xA3000A, 13303823, 20840449, 23396362, 7471119, 15269898, 14352387, 19529738, 20447236, 18350090};
        ji.P();
        ji.b();
        ji.m();
        ji.j();
        ji.s();
    }

    private static /* synthetic */ CallSite IlkOlrO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IIrpsjrOi[n2 ^ 0x93F54686];
        int n8 = n7 >>> 16;
        String string2 = ji.l1I0q(Ilpnmrtt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x93F54686);
        n7 = IIrpsjrOi[n3 ^ 0x93F54686];
        int n9 = n7 >>> 16;
        String string3 = ji.l1I0q(Ilpnmrtt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x93F54686);
        n7 = IIrpsjrOi[n4 ^ 0x93F54686];
        int n10 = n7 >>> 16;
        String string4 = ji.l1I0q(Ilpnmrtt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x93F54686);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB04C28E1) + -178;
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

    private static /* synthetic */ CallSite ookIOt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IIrpsjrOi[n2 ^ 0x93F54686];
        int n8 = n7 >>> 16;
        String string2 = ji.l1I0q(Ilpnmrtt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x93F54686);
        n7 = IIrpsjrOi[n3 ^ 0x93F54686];
        int n9 = n7 >>> 16;
        String string3 = ji.l1I0q(Ilpnmrtt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x93F54686);
        n7 = IIrpsjrOi[n4 ^ 0x93F54686];
        int n10 = n7 >>> 16;
        String string4 = ji.l1I0q(Ilpnmrtt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x93F54686);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xB04C28E1) + -178;
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

    private static /* synthetic */ String l1I0q(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, -127, -49, -67, -111, -90, -84, -93, 18, -92, 14, -115, 106, -89, 68, 0};
        byte[] byArray3 = new byte[]{-65, -76, 17, 8, 23, 59, 46, -31, 74, 40, -124, -48, 35, -101, -57, -36};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void OO0O00(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[83];
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
        Ilpnmrtt = stringBuilder.toString();
        IIrpsjrOi = nArray;
    }
}
