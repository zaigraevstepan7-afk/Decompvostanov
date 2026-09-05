/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package KDFzREm;

import KDFzREm.RD;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lQ;
import KDFzREm.lY;
import KDFzREm.lw;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.joml.Vector4f;

@UZ(L="ViewModel", y=UR.VISUAL, N=Uz.WORLD)
public class TY
extends UM {
    private static float[] u;
    private static float[] i;
    private static float[] R;
    private static String[] M;
    private static float[] B;
    private static String[] Z;
    private static short[] z;
    private static float[] U;
    private static short[] W;
    public Object[] L;
    private static short[] m;
    private static short[] P;
    private static float[] s;
    private static byte[] T;
    private static short[] b;
    private static /* synthetic */ String I1q0mi;
    private static /* synthetic */ int[] oolkpkOl0;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(n ^ 0xE97C04D0, 8) ^ 0xBC0A734A, 17), 17), 9);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-124, 63, -116, -25, -20, 30, -6, 29, -1, 120, -14, -86, 22, -89, 39, -76};
        int n = 0;
        int n2 = 109;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 101;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        u = new float[]{0.0f, -1.0f, 1.0f, 0.05f, 0.0f};
        s = new float[]{-1.0f, 1.0f, 0.05f, 0.0f, -1.0f};
        i = new float[]{1.0f, 0.05f};
        B = new float[]{1.0f, 0.1f, 2.0f, 0.05f, 0.0f, -1.0f, 1.0f, 0.05f};
        R = new float[]{0.0f, -1.0f, 1.0f, 0.05f, 0.0f, -1.0f};
        U = new float[]{1.0f, 0.05f, 1.0f, 0.1f, 2.0f, 0.05f};
    }

    private static void T() {
        P = new short[]{0, 1, 2, 3, 4};
        z = new short[]{5, 6, 7};
        b = new short[]{0, 1, 2, 3, 4, 5};
        m = new short[]{6, 7, 0, 1, 2, 3, 4};
        W = new short[]{5, 6, 7};
    }

    public TY() {
        TY.lOirstl("fuakj", 642514642, -1300719771, -1300719772, -1300719769, 642514642, (TY)this);
        CallSite callSite = TY.lOirstl("wstqo", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("trsbpcog", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[0]), (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719751, -1300719752, 642514646)[0], (float)TY.lOirstl("llfq", 642514646, -1300719771, -1300719751, -1300719752, 642514646)[1], (float)TY.lOirstl("trid", 642514646, -1300719771, -1300719751, -1300719752, 642514646)[2], (float)TY.lOirstl("trsbpcog", 642514646, -1300719771, -1300719751, -1300719752, 642514646)[3]);
        TY.lOirstl("fuakj", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("fuakj", 642514646, -1300719771, -1300719803, -1300719763, 642514646)[0]] = callSite;
        CallSite callSite2 = TY.lOirstl("thfjuwxq", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("cqplhplg", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[1]), (float)TY.lOirstl("wstqo", 642514646, -1300719771, -1300719751, -1300719752, 642514646)[4], (float)TY.lOirstl("wstqo", 642514646, -1300719771, -1300719804, -1300719752, 642514646)[0], (float)TY.lOirstl("wxpx", 642514646, -1300719771, -1300719804, -1300719752, 642514646)[1], (float)TY.lOirstl("trsbpcog", 642514646, -1300719771, -1300719804, -1300719752, 642514646)[2]);
        TY.lOirstl("wstqo", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("nochq", 642514646, -1300719771, -1300719803, -1300719763, 642514646)[1]] = callSite2;
        CallSite callSite3 = TY.lOirstl("bodfwr", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("llfq", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[2]), (float)TY.lOirstl("trid", 642514646, -1300719771, -1300719804, -1300719752, 642514646)[3], (float)TY.lOirstl("nochq", 642514646, -1300719771, -1300719804, -1300719752, 642514646)[4], (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719761, -1300719752, 642514646)[0], (float)TY.lOirstl("fmrpshvj", 642514646, -1300719771, -1300719761, -1300719752, 642514646)[1]);
        TY.lOirstl("bodfwr", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("amjk", 642514646, -1300719771, -1300719803, -1300719763, 642514646)[2]] = callSite3;
        CallSite callSite4 = TY.lOirstl("llfq", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("fuakj", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[3]), (float)TY.lOirstl("bodfwr", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[0], (float)TY.lOirstl("bodfwr", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[1], (float)TY.lOirstl("btxwctd", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[2], (float)TY.lOirstl("nochq", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[3]);
        TY.lOirstl("rywf", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("trid", 642514646, -1300719771, -1300719803, -1300719763, 642514646)[3]] = callSite4;
        CallSite callSite5 = TY.lOirstl("fuakj", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("trid", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[4]), (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[4], (float)TY.lOirstl("cqplhplg", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[5], (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[6], (float)TY.lOirstl("trid", 642514646, -1300719771, -1300719801, -1300719752, 642514646)[7]);
        TY.lOirstl("amjk", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("trsbpcog", 642514646, -1300719771, -1300719803, -1300719763, 642514646)[4]] = callSite5;
        CallSite callSite6 = TY.lOirstl("wstqo", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("amjk", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[5]), (float)TY.lOirstl("trsbpcog", 642514646, -1300719771, -1300719802, -1300719752, 642514646)[0], (float)TY.lOirstl("trid", 642514646, -1300719771, -1300719802, -1300719752, 642514646)[1], (float)TY.lOirstl("btxwctd", 642514646, -1300719771, -1300719802, -1300719752, 642514646)[2], (float)TY.lOirstl("bodfwr", 642514646, -1300719771, -1300719802, -1300719752, 642514646)[3]);
        TY.lOirstl("amjk", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("wxpx", 642514646, -1300719771, -1300719807, -1300719763, 642514646)[0]] = callSite6;
        CallSite callSite7 = TY.lOirstl("trsbpcog", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("fmrpshvj", 642514646, -1300719771, -1300719745, -1300719746, 642514646)[6]), (float)TY.lOirstl("amjk", 642514646, -1300719771, -1300719802, -1300719752, 642514646)[4], (float)TY.lOirstl("cqplhplg", 642514646, -1300719771, -1300719802, -1300719752, 642514646)[5], (float)TY.lOirstl("fuakj", 642514646, -1300719771, -1300719808, -1300719752, 642514646)[0], (float)TY.lOirstl("wxpx", 642514646, -1300719771, -1300719808, -1300719752, 642514646)[1]);
        TY.lOirstl("btxwctd", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("wxpx", 642514646, -1300719771, -1300719807, -1300719763, 642514646)[1]] = callSite7;
        CallSite callSite8 = TY.lOirstl("fuakj", 642514652, -1300719749, -1300719753, -1300719750, 642514652, (lY)this, (String)((Object)TY.lOirstl("wxpx", 642514646, -1300719771, -1300719805, -1300719746, 642514646)[0]), (float)TY.lOirstl("amjk", 642514646, -1300719771, -1300719808, -1300719752, 642514646)[2], (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719808, -1300719752, 642514646)[3], (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719808, -1300719752, 642514646)[4], (float)TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719808, -1300719752, 642514646)[5]);
        TY.lOirstl("fmrpshvj", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this)[TY.lOirstl("nochq", 642514646, -1300719771, -1300719807, -1300719763, 642514646)[2]] = callSite8;
        TY.lOirstl("amjk", 642514652, -1300719749, -1300719753, -1300719806, 642514652, (lY)this, (String)((Object)TY.lOirstl("llfq", 642514646, -1300719771, -1300719805, -1300719746, 642514646)[1]), () -> {
            TY.lOirstl("nochq", 642514642, -1300719771, -1300719772, -1300719769, -1178205610, (TY)this);
            TY.lOirstl("fuakj", 642514653, -1300719760, -1300719747, -1300719748, -1178205610, (List)((Object)TY.lOirstl("cqplhplg", 642514652, -1300719760, -1300719757, -1300719758, -1178205610, (Object)((lQ)((Object)TY.lOirstl("trsbpcog", 642514640, -1300719771, -1300719773, -1300719774, 2099016755, (TY)this)[TY.lOirstl("fuakj", 642514646, -1300719771, -1300719754, -1300719763, -1697884590)[2]])), (Object)((lQ)((Object)TY.lOirstl("bodfwr", 642514640, -1300719771, -1300719773, -1300719774, -1688866147, (TY)this)[TY.lOirstl("rywf", 642514646, -1300719771, -1300719754, -1300719763, 1370454360)[3]])), (Object)((lQ)((Object)TY.lOirstl("wstqo", 642514640, -1300719771, -1300719773, -1300719774, 1137199436, (TY)this)[TY.lOirstl("trid", 642514646, -1300719771, -1300719754, -1300719763, 1218876002)[4]])), (Object)((lQ)((Object)TY.lOirstl("trsbpcog", 642514640, -1300719771, -1300719773, -1300719774, -1996159258, (TY)this)[TY.lOirstl("nochq", 642514646, -1300719771, -1300719754, -1300719763, 979970584)[5]])), (Object)((lQ)((Object)TY.lOirstl("btxwctd", 642514640, -1300719771, -1300719773, -1300719774, 2117553918, (TY)this)[TY.lOirstl("llfq", 642514646, -1300719771, -1300719754, -1300719763, 370546826)[6]])), (Object)((lQ)((Object)TY.lOirstl("thfjuwxq", 642514640, -1300719771, -1300719773, -1300719774, 1767625880, (TY)this)[TY.lOirstl("cqplhplg", 642514646, -1300719771, -1300719759, -1300719763, -1988989615)[0]])), (Object)((lQ)((Object)TY.lOirstl("cqplhplg", 642514640, -1300719771, -1300719773, -1300719774, 1235187948, (TY)this)[TY.lOirstl("nochq", 642514646, -1300719771, -1300719759, -1300719763, 694957555)[1]])), (Object)((lQ)((Object)TY.lOirstl("fuakj", 642514640, -1300719771, -1300719773, -1300719774, 1178767978, (TY)this)[TY.lOirstl("cqplhplg", 642514646, -1300719771, -1300719759, -1300719763, 1066976908)[2]])))), lw::s);
        });
    }

    static {
        TY.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{101, 26, -21, -127, -97, -48, 118, 68, -93, 5, -128, 68, 52, 99, 22, -75};
        int n = 0;
        int n2 = 167;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 123;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{41, 63, 77, 113, 100, -83, -25, 3, -102, 103, 119, 15, 62, 32, -68, 58};
        int n = 0;
        int n2 = 162;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 143;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{38, 95, 119, 63, -122, 80, -119, 31, -109, 99, -111, -80, -52, -87, -47, -66};
        int n = 0;
        int n2 = 181;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 7;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (TY.lOirstl("fuakj", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this) == null) {
            TY.lOirstl("cqplhplg", 642514641, -1300719771, -1300719773, -1300719774, 642514641, (TY)this, (Object[])new Object[TY.lOirstl("fmrpshvj", 642514646, -1300719771, -1300719795, -1300719796, 642514646)[0]]);
            CallSite callSite = TY.lOirstl("amjk", 642514640, -1300719771, -1300719773, -1300719774, 642514640, (TY)this);
        }
    }

    private static void s() {
        T = new byte[]{8};
    }

    private static void j() {
        M = new String[]{"right-hand-x", "right-hand-y", "right-hand-z", "right-scale", "left-hand-x", "left-hand-y", "left-hand-z"};
        Z = new String[]{"left-scale", "reset"};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{62, 39, -94, 109, 60, -62, 19, 81, -64, -36, 64, 3, 119, 85, -13, 13};
        int n = 0;
        int n2 = 183;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 205;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{121, 11, -45, -60, 39, -55, 65, 124, -58, 95, -101, -32, 56, -41, -53, 96};
        int n = 0;
        int n2 = 41;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 59;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(n, 14), 24), 17), 21), 20);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-128, 91, 103, 37, 38, -45, 8, -83, 77, -11, -128, -69, -111, -6, 117, -113};
        int n = 0;
        int n2 = 71;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 49;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(-Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(n ^ 0x1C37F56A, 10), 6), 27), 15);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{18, -14, -82, 98, -77, -90, 16, 75, 120, 26, -76, 104, -55, 20, -60, 106};
        int n = 0;
        int n2 = 69;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 115;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(RD rD) {
        TY.lOirstl("llfq", 642514642, -1300719771, -1300719772, -1300719769, -1178205610, (TY)this);
        TY.lOirstl("thfjuwxq", 642514642, -1300719766, -1300719755, -1300719756, -1178205610, (Vector4f)TY.lOirstl("fmrpshvj", 642514642, -1300719770, -1300719775, -1300719776, -1178205610, (RD)rD), (float)TY.lOirstl("thfjuwxq", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("btxwctd", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("trsbpcog", 642514640, -1300719771, -1300719773, -1300719774, -1560506343, (TY)this)[TY.lOirstl("fuakj", 642514646, -1300719771, -1300719772, -1300719763, 1116904558)[0]])))))), (float)TY.lOirstl("fuakj", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("trsbpcog", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("thfjuwxq", 642514640, -1300719771, -1300719773, -1300719774, 1161261927, (TY)this)[TY.lOirstl("thfjuwxq", 642514646, -1300719771, -1300719772, -1300719763, -2115264518)[1]])))))), (float)TY.lOirstl("llfq", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("trid", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("cqplhplg", 642514640, -1300719771, -1300719773, -1300719774, -1874383366, (TY)this)[TY.lOirstl("wxpx", 642514646, -1300719771, -1300719772, -1300719763, 1429578830)[2]])))))), (float)TY.lOirstl("amjk", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("rywf", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("trsbpcog", 642514640, -1300719771, -1300719773, -1300719774, 1585900437, (TY)this)[TY.lOirstl("wxpx", 642514646, -1300719771, -1300719772, -1300719763, -744810152)[3]])))))));
        TY.lOirstl("thfjuwxq", 642514642, -1300719766, -1300719755, -1300719756, -1178205610, (Vector4f)TY.lOirstl("bodfwr", 642514642, -1300719770, -1300719753, -1300719776, -1178205610, (RD)rD), (float)TY.lOirstl("llfq", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("rywf", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("trsbpcog", 642514640, -1300719771, -1300719773, -1300719774, -206552535, (TY)this)[TY.lOirstl("amjk", 642514646, -1300719771, -1300719772, -1300719763, 1429243035)[4]])))))), (float)TY.lOirstl("llfq", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("rywf", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("btxwctd", 642514640, -1300719771, -1300719773, -1300719774, -1504581782, (TY)this)[TY.lOirstl("amjk", 642514646, -1300719771, -1300719772, -1300719763, -282689762)[5]])))))), (float)TY.lOirstl("wxpx", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("llfq", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("rywf", 642514640, -1300719771, -1300719773, -1300719774, 325392719, (TY)this)[TY.lOirstl("wstqo", 642514646, -1300719771, -1300719754, -1300719763, -640005109)[0]])))))), (float)TY.lOirstl("wstqo", 642514642, -1300719767, -1300719768, -1300719765, -1178205610, (Float)((Float)((Object)TY.lOirstl("thfjuwxq", 642514642, -1300719764, -1300719761, -1300719762, -1178205610, (lQ)((lQ)((Object)TY.lOirstl("trid", 642514640, -1300719771, -1300719773, -1300719774, 2024959188, (TY)this)[TY.lOirstl("bodfwr", 642514646, -1300719771, -1300719754, -1300719763, 980230039)[1]])))))));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateLeft(-n, 16), 22), 22) ^ 0x8BF29637;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-50, -79, -63, -110, -116, -37, 81, -80, -33, 78, 107, -40, -95, -117, -116, 16};
        int n = 0;
        int n2 = 234;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 197;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        I1q0mi = "\u00f9\u001d\u00f7\u00c9\u0084\u008dZ\b%;!Z\u00cc\u00fb\u00da\u009b\u00a58\u00f2\u00c6\u00dd\u00af\u001a\u0013\"' \u0010\u00d8\u00b5\u009d\u00ae\u00c6\u001d\u00f7\u00c9\u0084\u008dZ\u00110<*Z\u00f9\u00fa\u00c6H\u00f36\u00a6(x\u00cb\u00d8\u0017\u00b5x\u00d1\u00c2\u0093\u009a\u0014R=3#\u0012\u0085\u00c1\u00d6K\u00f82\u00e9\u0093\u0013\u0002\u0093\u001d\u001d\u00d6\u00ec\u00b4\u0096'8<}!,\u0091\u00c2\u00de\u00b0C0\u00b2\u00c4\u0093\u0082\u0012R\u0002&?\u001c\u00c4\u00e9\u008f\u009d_0\u00eb\u00c9\u00dd\u0080\u0014\u00136}\u001f\u0000\u00c4\u00e0\u00d5\u00b3Y4\u00a6\u0081\u00be\u00a71;+\u0000\b\u0018\u0085\u00e2\u00c7\u00eaB\u00c59~\u008a\u0013N\u00b9\u0015\u00db\u00d2\u00a0\u00a9\u0018R=9\u00d9x\u00d1\u00c7\u0080\u008bZ\u0017>?!Z\u00fc\u00eb\u00d7\u00c3\u009e#\u00a9\u00ce\u00c9&0\u00eb\u00c9\u00dd\u0080\u0014\u00136}\u000b\u0019\u00c5\u00ef\u00c0\u00c6\u001d\u001d\u00f7\u00c9\u0084\u008dZ\u00110<*Z\u00e5\u00ec\u00de\u00b4V%\u00a6\u00e4\u0098\u008d\u0003\u001c~>,\u001b\u00cd\u00a1\u00fb\u00b3_4\u00fe\u00dc\u00c9\u00a0\u001f\u001c'3b\u0019\u00cb\u00e0\u00d3\u00fez3\u00f7\u00cd\u0091\u0098N1;3;\u0014\u0085\u00e2\u00d5\u00bfR~\u00d2\u00ca\u0098\u0089\u0016\tj\u001e'\u0014\u00dc\u00ef\u009b\u00bdT?\u00fa\u0087\u00bd\u008e\u001f\u00182&v9\u00c0\u00ef\u00c2\u00b0\u001a=\u00fc\u00c6\u0095\u00c3:\u001f;7.\u0001\u0091\u00c2\u00de\u00b0C0\u00b2\u00c4\u0093\u0082\u0012R\u001e0'\u0010\u00c9\u00fa\u008f\u009d_0\u00eb\u00c9\u00dd\u0080\u0014\u00136}\u0002\u0017\u00c0\u00eb\u00d7\u00a5\u000ex\u00d1\u00c2\u0093\u009a\u0014R$&$\u0019\u0085\u00c2\u00dd\u00a2Aj\u00acL>\u00ef\u00ed\u0093\u008f\u001d.\u0015\u00db\u00d2\u00a0\u00a9\u0018R\u0005\u000bL\u00164\u00e90#\u00fa\u0087\u0098\u0083\u0018\u0011~\u0004(\u0016\u00de\u00e1\u00c6\u00e595\u00ebY\u0017\u00db\u00ee\u00b4\u00c59\u0012#5b\u001f\u00c5\u00e3\u00d8\u00d7'4\u00fe\u00dc\u009d\u009eA\u001bjw\u001d\u00d6\u00ec\u00b4\u0096'8<}!,\u0091\u00c2\u00de\u00b0)0\u00b2\u00c4\u0093\u0082\u0012R\u0002&?\u001c\u00c4\u00e9\u008f\u0097\u0019\u0017\u00db\u0081\u00be\u00a71;+\u0000\b\u0018\u0085\u00e2\u00e5\u00ea\u00c9\u009a\u0015\u00db\u00d2\u00a0\u00a9\u0018R=\u0003\u00ed\u008a\u0015\u00db\u00d2\u00a0\u00a9\u0018R\u0003\u0016\u00a4n\u001d\u00f7\u00c9\u0084\u008dZ\u00110<*Z\u00e5\u00ec\u00de\u00b4V%\u00a6\u009b0\u00eb\u00c9\u00dd\u0099\u0001\u0014=}\u0001\u001c\u00d9\u00fa\u00e5=\u00f2\u00c9\u0086\u00ba\u0014\u0011$7q\u0002\u00dax\u00dby7Z";
        oolkpkOl0 = new int[]{24051722, 4980737, 0x330003, 31784970, 0x900001, 10485781, 0x2220001, 32505875, 35323906, 31064074, 30998529, 3670036, 11862031, 34668554, 35454979, 24969233, 24772611, 0x1900019, 9764865, 23527425, 26148865, 33751054, 0x2200002, 12910754, 23592967, 32, 31719425, 2097171, 0x910001, 3538946, 9830410, 27852848, 26083329, 5046273, 9371649, 5111809, 12845057, 32440321, 24707073, 0x4F0040, 9568257, 9633794};
        TY.T();
        TY.s();
        TY.P();
        TY.j();
    }

    private static /* synthetic */ void OltlO(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[42];
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
        I1q0mi = stringBuilder.toString();
        oolkpkOl0 = nArray;
    }

    private static /* synthetic */ CallSite lOirstl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oolkpkOl0[n2 ^ 0xB2789765];
        int n7 = n6 >>> 16;
        String string2 = TY.oolkOtt(I1q0mi.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xB2789765);
        n6 = oolkpkOl0[n3 ^ 0xB2789765];
        int n8 = n6 >>> 16;
        String string3 = TY.oolkOtt(I1q0mi.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xB2789765);
        n6 = oolkpkOl0[n4 ^ 0xB2789765];
        int n9 = n6 >>> 16;
        String string4 = TY.oolkOtt(I1q0mi.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xB2789765);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x264BFE64) + -178;
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

    private static /* synthetic */ CallSite OOritpn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = oolkpkOl0[n2 ^ 0xB2789765];
        int n7 = n6 >>> 16;
        String string2 = TY.oolkOtt(I1q0mi.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xB2789765);
        n6 = oolkpkOl0[n3 ^ 0xB2789765];
        int n8 = n6 >>> 16;
        String string3 = TY.oolkOtt(I1q0mi.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xB2789765);
        n6 = oolkpkOl0[n4 ^ 0xB2789765];
        int n9 = n6 >>> 16;
        String string4 = TY.oolkOtt(I1q0mi.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xB2789765);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x264BFE64) + -178;
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

    private static /* synthetic */ String oolkOtt(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{62, -49, 114, 11, -52, 79, 20, -1, -98, -67, -126, 97, 40, -17, 91, -93};
        byte[] byArray3 = new byte[]{82, 71, -93, 120, 60, 48, -77, 115, 113, 8, 109, 87, -102, -58, -23, 11};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }
}
