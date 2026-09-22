/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNNEg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNde
 *  KDFzREm.NNuU
 *  KDFzREm.NXi
 *  org.joml.Matrix4fStack
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NNNNEg;
import KDFzREm.NNNwS;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.Ru;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZH;
import KDFzREm.Zu;
import KDFzREm.dx;
import KDFzREm.iw;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.lb;
import KDFzREm.mB;
import KDFzREm.mH;
import KDFzREm.mI;
import KDFzREm.mJ;
import KDFzREm.mV;
import KDFzREm.me;
import KDFzREm.mo;
import KDFzREm.mq;
import KDFzREm.uF;
import KDFzREm.wB;
import KDFzREm.wR;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.joml.Matrix4fStack;

@UZ(L="HolyHelper", y=UR.MISC, N=Uz.HELPER)
public class mO
extends UM
implements mB {
    private static double[] i;
    public Object[] L;
    private static short[] R;
    private static short[] M;
    private static String[] B;
    private static byte[] Z;
    private static short[] z;
    private static short[] U;
    private static boolean[] W;
    private static short[] m;
    private static short[] P;
    private static short[] s;
    private static int[] T;
    public Object[] u;
    private static short[] b;
    private static short[] j;
    private static /* synthetic */ String lIlspnnm;
    private static /* synthetic */ int[] Iljqnpri;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(n ^ 0xAAE19E7, 28), 8), 2), 27);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-118, -90, -123, -39, -117, -121, 110, -96, 4, -106, -101, 106, 37, -121, -70, -12};
        int n = 0;
        int n2 = 221;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        i = new double[]{-15.0, -15.0, -15.0, 15.0, 15.0, 15.0, -0.05};
    }

    private static void T() {
        j = new short[]{0, 1, 2, 3, 0, 1};
        M = new short[]{0, 1, 2};
        s = new short[]{3, 0, 1, 2, 3, 4, 5, 6};
        z = new short[]{5, 2, 5, 7};
        b = new short[]{0, 4};
        m = new short[]{0, 4, 0};
        P = new short[]{4, 0, 4, 3};
        U = new short[]{1, 6, 4};
        R = new short[]{3, 0, 0, 4, 7, 3};
    }

    public mO() {
        mO.lOtii0r("rpswg", -678136599, 1153379482, 1153379483, 1153379480, -678136599, -678136599, (mO)this);
        mJ mJ2 = new mJ(this, (String)((Object)mO.lOtii0r("vdpq", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[0]));
        mO.lOtii0r("rwkt", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379483, 1153379484, -678136595, -678136595)[0]] = mJ2;
        mI mI2 = new mI(this, (String)((Object)mO.lOtii0r("neloo", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[1]));
        mO.lOtii0r("vtkwex", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379483, 1153379484, -678136595, -678136595)[1]] = mI2;
        mo mo2 = new mo(this, (String)((Object)mO.lOtii0r("vtkwex", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[2]));
        mO.lOtii0r("vtkwex", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("bunthwys", -678136595, 1153379482, 1153379483, 1153379484, -678136595, -678136595)[2]] = mo2;
        mV mV2 = new mV(this, (String)((Object)mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[3]));
        mO.lOtii0r("bunthwys", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("kxeceut", -678136595, 1153379482, 1153379483, 1153379484, -678136595, -678136595)[3]] = mV2;
        me me2 = new me(this, (String)((Object)mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[4]));
        mO.lOtii0r("neloo", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379483, 1153379484, -678136595, -678136595)[4]] = me2;
        mH mH2 = new mH(this, (String)((Object)mO.lOtii0r("vtkwex", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[5]));
        mO.lOtii0r("bunthwys", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("kxeceut", -678136595, 1153379482, 1153379483, 1153379484, -678136595, -678136595)[5]] = mH2;
        CallSite callSite = mO.lOtii0r("phwme", -678136601, 1153379485, 1153379477, 1153379466, -678136601, -678136601, (Object)((mq)((Object)mO.lOtii0r("rpswg", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379479, 1153379484, -678136595, -678136595)[0]])), (Object)((mq)((Object)mO.lOtii0r("jvxkl", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("phwme", -678136595, 1153379482, 1153379479, 1153379484, -678136595, -678136595)[1]])), (Object)((mq)((Object)mO.lOtii0r("jvxkl", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("vdpq", -678136595, 1153379482, 1153379479, 1153379484, -678136595, -678136595)[2]])), (Object)((mq)((Object)mO.lOtii0r("vrlhmv", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[0]])), (Object)((mq)((Object)mO.lOtii0r("kxeceut", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[1]])), (Object)((mq)((Object)mO.lOtii0r("vdpq", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[2]])));
        mO.lOtii0r("rpswg", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[3]] = callSite;
        CallSite callSite2 = mO.lOtii0r("kxeceut", -678136601, 1153379465, 1153379470, 1153379471, -678136601, -678136601, (lY)this, (String)((Object)mO.lOtii0r("zgojife", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[6]), (boolean)mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379467, 1153379464, -678136595, -678136595)[0]);
        mO.lOtii0r("jvxkl", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("zgojife", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[4]] = callSite2;
        lb lb2 = (lb)((Object)mO.lOtii0r("bunthwys", -678136599, 1153379459, 1153379470, 1153379456, -678136599, -678136599, (lb)((Object)mO.lOtii0r("kxeceut", -678136601, 1153379465, 1153379470, 1153379458, -678136601, -678136601, (lY)this, (String)((Object)mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379472, 1153379473, -678136595, -678136595)[7]), (int)mO.lOtii0r("vtkwex", -678136595, 1153379482, 1153379468, 1153379469, -678136595, -678136595)[0])), lw2 -> {
            mO.lOtii0r("phwme", -678136599, 1153379482, 1153379483, 1153379480, -411357620, 179329063, (mO)this);
            return (boolean)mO.lOtii0r("jvxkl", -678136599, 1153379542, 1153379528, 1153379529, -411357620, 179329063, (Boolean)((Boolean)((Object)mO.lOtii0r("phwme", -678136599, 1153379535, 1153379463, 1153379544, -411357620, 179329063, (lT)((lT)((Object)mO.lOtii0r("vdpq", -678136597, 1153379482, 1153379481, 1153379486, -491213778, -813417774, (mO)this)[mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379531, 1153379484, 633405377, -916609425)[5]]))))));
        }));
        mO.lOtii0r("zgojife", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("qihkxh", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[5]] = lb2;
        wR wR2 = new wR((int)mO.lOtii0r("vtkwex", -678136595, 1153379482, 1153379457, 1153379462, -678136595, -678136595)[0], (int)mO.lOtii0r("phwme", -678136595, 1153379482, 1153379467, 1153379464, -678136595, -678136595)[1]);
        mO.lOtii0r("vtkwex", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[6]] = wR2;
        CallSite callSite3 = mO.lOtii0r("bunthwys", -678136599, 1153379461, 1153379463, 1153379514, -678136599, -678136599, (wB)new wB((double)mO.lOtii0r("neloo", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[0], (double)mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[1], (double)mO.lOtii0r("qihkxh", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[2], (double)mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[3], (double)mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[4], (double)mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[5]), (double)mO.lOtii0r("neloo", -678136595, 1153379482, 1153379463, 1153379460, -678136595, -678136595)[6]);
        mO.lOtii0r("vtkwex", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("vtkwex", -678136595, 1153379482, 1153379476, 1153379484, -678136595, -678136595)[7]] = callSite3;
    }

    static {
        mO.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{67, 123, -77, 24, -84, 85, 28, -112, -42, -17, -45, -13, 48, -14, -78, -96};
        int n = 0;
        int n2 = 33;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 207;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{100, -17, -74, 119, 114, 30, -65, 75, -11, 48, 102, 67, -28, -89, 81, -17};
        int n = 0;
        int n2 = 52;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 175;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(-n ^ 0x7290472D, 9), 22), 15), 30);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{84, -23, -9, 110, 75, -115, -127, -112, 21, -91, 76, -14, 92, 0, 81, 28};
        int n = 0;
        int n2 = 239;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 227;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        T = new int[]{-11104513};
    }

    private static void s() {
        Z = new byte[]{5, 120, 4, 8, 7};
    }

    private void n() {
        mO.lOtii0r("jvxkl", -678136599, 1153379482, 1153379483, 1153379480, -411357620, 179329063, (mO)this);
        if (mO.lOtii0r("jvxkl", -678136599, 1153379542, 1153379528, 1153379529, -411357620, 179329063, (Boolean)((Boolean)((Object)mO.lOtii0r("qihkxh", -678136599, 1153379535, 1153379463, 1153379544, -411357620, 179329063, (lT)((lT)((Object)mO.lOtii0r("rwkt", -678136597, 1153379482, 1153379481, 1153379486, 1592333646, 2048547966, (mO)this)[mO.lOtii0r("vdpq", -678136595, 1153379482, 1153379531, 1153379484, -1450355150, -337526246)[0]])))))) == false) {
            return;
        }
        CallSite callSite = mO.lOtii0r("neloo", -678136601, 1153379542, 1153379543, 1153379540, -411357620, 179329063, (boolean)mO.lOtii0r("jvxkl", -678136602, 1153379523, 1153379520, 1153379521, -411357620, 179329063, (dx)((Object)mO.lOtii0r("tuqlcz", -678136599, 1153379537, 1153379481, 1153379532, -411357620, 179329063, (mq)((mq)((Object)mO.lOtii0r("rpswg", -678136597, 1153379482, 1153379481, 1153379486, 511494567, 1250032144, (mO)this)[mO.lOtii0r("zgojife", -678136595, 1153379482, 1153379531, 1153379484, 1486733677, 291081478)[1]])))), (Object)mO.lOtii0r("bunthwys", -678136599, 1153379505, 1153379533, 1153379522, -411357620, 179329063, (NNNwS)((NNNwS)mO.lOtii0r("bunthwys", -678136597, 1153379504, 1153379468, 1153379486, -1452706951, 2046683973, (NNuU)((NNuU)mO.lOtii0r("jvxkl", -678136597, 1153379482, 1153379512, 1153379486, -1007439686, 771652636, (mO)this)[mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379531, 1153379484, 2063589714, 1852493601)[2]]))[mO.lOtii0r("zgojife", -678136595, 1153379482, 1153379531, 1153379484, -249311158, -578450057)[3]]))));
        mO.lOtii0r("rpswg", -678136597, 1153379482, 1153379481, 1153379486, -1346135135, -2087637133, (mO)this)[mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379531, 1153379484, 1928546107, 2004891856)[4]] = callSite;
    }

    private static void m() {
        B = new String[]{"explosive-stuff", "exp-bottle", "explosive-trap", "snow-ball", "stun", "trap", "show-stun-zone", "zone-color"};
    }

    private static void v() {
        W = new boolean[]{false, true, true, false};
    }

    private void j() {
        CallSite callSite;
        if (mO.lOtii0r("zgojife", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this) == null) {
            mO.lOtii0r("rpswg", -678136598, 1153379482, 1153379478, 1153379486, -678136598, -678136598, (mO)this, (Object[])new Object[mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379457, 1153379462, -678136595, -678136595)[2]]);
            callSite = mO.lOtii0r("rpswg", -678136597, 1153379482, 1153379478, 1153379486, -678136597, -678136597, (mO)this);
        }
        if (mO.lOtii0r("rwkt", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this) == null) {
            mO.lOtii0r("tuqlcz", -678136598, 1153379482, 1153379481, 1153379486, -678136598, -678136598, (mO)this, (Object[])new Object[mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379457, 1153379462, -678136595, -678136595)[3]]);
            callSite = mO.lOtii0r("kxeceut", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this);
            callSite[mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379457, 1153379462, -678136595, -678136595)[4]] = mO.lOtii0r("qihkxh", -678136601, 1153379542, 1153379543, 1153379540, -678136601, -678136601, (boolean)mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379467, 1153379464, -678136595, -678136595)[3]);
        }
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, -68, -95, 80, -124, -46, 77, 35, -48, 77, -105, -48, 104, 112, -83, -71};
        int n = 0;
        int n2 = 26;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 235;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n ^ 0x9C694E1F, 10), 15) ^ 0xD1C111F4, 16), 19);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-53, 23, 26, 9, 99, 24, 78, -109, -4, 29, 97, -32, -32, 41, -2, -2};
        int n = 0;
        int n2 = 36;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 243;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(-Integer.rotateLeft(n, 3), 28) ^ 0x789931EE;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{70, 77, 89, -22, 125, -63, -66, 47, -17, 45, -33, 36, 38, 13, 11, 17};
        int n = 0;
        int n2 = 201;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 63;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(MR mR) {
        mO.lOtii0r("rpswg", -678136599, 1153379482, 1153379483, 1153379480, -411357620, 179329063, (mO)this);
        CallSite callSite = mO.lOtii0r("tuqlcz", -678136599, 1153379530, 1153379512, 1153379497, -411357620, 179329063, (NNde)mO.lOtii0r("kxeceut", -678136599, 1153379502, 1153379512, 1153379541, -411357620, 179329063, (MR)mR));
        CallSite callSite2 = mO.lOtii0r("vdpq", -678136599, 1153379502, 1153379531, 1153379506, -411357620, 179329063, (MR)mR);
        if (mO.lOtii0r("rwkt", -678136599, 1153379542, 1153379528, 1153379529, -411357620, 179329063, (Boolean)((Boolean)((Object)mO.lOtii0r("zgojife", -678136597, 1153379482, 1153379481, 1153379486, -509703891, -1631029605, (mO)this)[mO.lOtii0r("kxeceut", -678136595, 1153379482, 1153379487, 1153379484, -710447267, -1700410817)[3]]))) != false) {
            mO.lOtii0r("tuqlcz", -678136599, 1153379482, 1153379470, 1153379534, -411357620, 179329063, (mO)this, (MR)mR, (Matrix4fStack)callSite2, (NXi)callSite);
        }
    }

    private void N(MR mR, Matrix4fStack matrix4fStack, NXi nXi) {
        mO.lOtii0r("tuqlcz", -678136599, 1153379482, 1153379483, 1153379480, -411357620, 179329063, (mO)this);
        mO.lOtii0r("tuqlcz", -678136599, 1153379516, 1153379517, 1153379506, -411357620, 179329063, (Matrix4fStack)matrix4fStack);
        CallSite callSite = mO.lOtii0r("rwkt", -678136599, 1153379490, 1153379478, 1153379488, -411357620, 179329063, (NXi)mO.lOtii0r("qihkxh", -678136599, 1153379490, 1153379470, 1153379491, -411357620, 179329063, (NXi)new NXi((double)mO.lOtii0r("qihkxh", -678136597, 1153379505, 1153379510, 1153379511, 790331114, -906909288, (NNNwS)((NNNwS)mO.lOtii0r("rpswg", -678136597, 1153379504, 1153379468, 1153379486, -523006956, -1602126148, (NNuU)((NNuU)mO.lOtii0r("qihkxh", -678136597, 1153379482, 1153379512, 1153379486, -1589606220, 1225784358, (mO)this)[mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379507, 1153379484, -1685427866, 1121152724)[0]]))[mO.lOtii0r("vdpq", -678136595, 1153379482, 1153379507, 1153379484, -108478091, 795124612)[1]])), (double)mO.lOtii0r("zgojife", -678136597, 1153379505, 1153379509, 1153379511, -524464327, -569260388, (NNNwS)((NNNwS)mO.lOtii0r("phwme", -678136597, 1153379504, 1153379468, 1153379486, 1822815654, 2008016864, (NNuU)((NNuU)mO.lOtii0r("phwme", -678136597, 1153379482, 1153379512, 1153379486, -176723234, -1175407712, (mO)this)[mO.lOtii0r("rpswg", -678136595, 1153379482, 1153379508, 1153379484, -1184365206, -427917215)[0]]))[mO.lOtii0r("neloo", -678136595, 1153379482, 1153379508, 1153379484, 1394804446, 432950981)[1]])), (double)mO.lOtii0r("bunthwys", -678136597, 1153379505, 1153379499, 1153379511, -609175749, 1028769813, (NNNwS)((NNNwS)mO.lOtii0r("phwme", -678136597, 1153379504, 1153379468, 1153379486, 1828408979, 592497799, (NNuU)((NNuU)mO.lOtii0r("neloo", -678136597, 1153379482, 1153379512, 1153379486, -1017098362, -560619942, (mO)this)[mO.lOtii0r("vrlhmv", -678136595, 1153379482, 1153379508, 1153379484, -315602336, 1564601217)[2]]))[mO.lOtii0r("rwkt", -678136595, 1153379482, 1153379498, 1153379484, 117001860, 1731787902)[0]]))), (NXi)mO.lOtii0r("kxeceut", -678136599, 1153379505, 1153379496, 1153379497, -411357620, 179329063, (NNNwS)((NNNwS)mO.lOtii0r("rpswg", -678136597, 1153379504, 1153379468, 1153379486, -2021333564, 1339094938, (NNuU)((NNuU)mO.lOtii0r("kxeceut", -678136597, 1153379482, 1153379512, 1153379486, 1346943920, -870712745, (mO)this)[mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379498, 1153379484, 2088653861, -91094722)[1]]))[mO.lOtii0r("qihkxh", -678136595, 1153379482, 1153379498, 1153379484, -130702699, -571604915)[2]])), (double)((double)mO.lOtii0r("kxeceut", -678136602, 1153379500, 1153379470, 1153379501, -411357620, 179329063, (NNNNEg)mO.lOtii0r("tuqlcz", -678136599, 1153379502, 1153379478, 1153379503, -411357620, 179329063, (MR)mR), (boolean)mO.lOtii0r("zgojife", -678136595, 1153379482, 1153379467, 1153379464, 2052469148, -1726488803)[2]))), (NXi)nXi);
        mO.lOtii0r("rwkt", -678136599, 1153379516, 1153379489, 1153379494, -411357620, 179329063, (Matrix4fStack)matrix4fStack, (float)((float)mO.lOtii0r("phwme", -678136597, 1153379490, 1153379479, 1153379511, -1997988721, -1435131960, (NXi)callSite)), (float)((float)mO.lOtii0r("vrlhmv", -678136597, 1153379490, 1153379472, 1153379511, -1926574499, 1798688016, (NXi)callSite)), (float)((float)mO.lOtii0r("vrlhmv", -678136597, 1153379490, 1153379457, 1153379511, -542694636, -1383204876, (NXi)callSite)));
        mO.lOtii0r("phwme", -678136601, 1153379538, 1153379470, 1153379539, -411357620, 179329063, (Matrix4fStack)matrix4fStack, (Zu)((Object)mO.lOtii0r("vdpq", -678136599, 1153379492, 1153379478, 1153379493, -411357620, 179329063, (ZH)((ZH)((Object)mO.lOtii0r("vrlhmv", -678136595, 1153379495, 1153379470, 1153379486, -257090373, 472775038)[mO.lOtii0r("phwme", -678136595, 1153379482, 1153379498, 1153379484, -1232732072, 409767367)[3]])))), (Zu)((Object)mO.lOtii0r("kxeceut", -678136599, 1153379492, 1153379478, 1153379493, -411357620, 179329063, (ZH)((ZH)((Object)mO.lOtii0r("neloo", -678136595, 1153379495, 1153379470, 1153379486, -1953678599, 1306371661)[mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379546, 1153379484, 850096419, 1112425633)[0]])))), (NXi)mO.lOtii0r("kxeceut", -678136595, 1153379490, 1153379481, 1153379547, -975072939, 1149258889), (wB)((wB)((Object)mO.lOtii0r("neloo", -678136597, 1153379482, 1153379481, 1153379486, -1182170432, -186851816, (mO)this)[mO.lOtii0r("tuqlcz", -678136595, 1153379482, 1153379546, 1153379484, -2134570913, 1591941881)[1]])), (int)mO.lOtii0r("bunthwys", -678136601, 1153379548, 1153379470, 1153379549, -411357620, 179329063, (int)mO.lOtii0r("phwme", -678136599, 1153379545, 1153379550, 1153379551, -411357620, 179329063, (Integer)((Object)mO.lOtii0r("vtkwex", -678136599, 1153379459, 1153379463, 1153379544, -411357620, 179329063, (lb)((lb)((Object)mO.lOtii0r("tuqlcz", -678136597, 1153379482, 1153379481, 1153379486, 858615968, -777193240, (mO)this)[mO.lOtii0r("kxeceut", -678136595, 1153379482, 1153379546, 1153379484, 39981765, -1520100598)[2]]))))), (int)mO.lOtii0r("jvxkl", -678136595, 1153379482, 1153379457, 1153379462, -621872589, -631310923)[1]));
        mO.lOtii0r("rpswg", -678136599, 1153379516, 1153379536, 1153379506, -411357620, 179329063, (Matrix4fStack)matrix4fStack);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-n ^ 0x171B472A, 18) ^ 0x5336DDD1, 10), 15);
    }

    @Override
    public void N(dx dx2) {
        mO.lOtii0r("vrlhmv", -678136599, 1153379482, 1153379483, 1153379480, -411357620, 179329063, (mO)this);
        mO.lOtii0r("vdpq", -678136599, 1153379515, 1153379470, 1153379519, -411357620, 179329063, (wR)((wR)((Object)mO.lOtii0r("kxeceut", -678136597, 1153379482, 1153379481, 1153379486, -328807358, -13818535, (mO)this)[mO.lOtii0r("qihkxh", -678136595, 1153379482, 1153379487, 1153379484, 2123047231, 1041856015)[0]])), (dx)dx2);
    }

    @uF
    public void N(Ru ru) {
        mO.lOtii0r("bunthwys", -678136599, 1153379482, 1153379483, 1153379480, -411357620, 179329063, (mO)this);
        mO.lOtii0r("zgojife", -678136599, 1153379515, 1153379512, 1153379513, -411357620, 179329063, (wR)((wR)((Object)mO.lOtii0r("rwkt", -678136597, 1153379482, 1153379481, 1153379486, -1754746166, 570099475, (mO)this)[mO.lOtii0r("rpswg", -678136595, 1153379482, 1153379487, 1153379484, -1180071423, 1153271215)[2]])), (Object)ru);
        mO.lOtii0r("tuqlcz", -678136599, 1153379482, 1153379518, 1153379480, -411357620, 179329063, (mO)this);
    }

    @uF(u=true)
    public void N(iw iw2) {
        mO.lOtii0r("vtkwex", -678136599, 1153379482, 1153379483, 1153379480, -678136599, -678136599, (mO)this);
        mO.lOtii0r("rpswg", -678136602, 1153379485, 1153379474, 1153379475, -678136602, -678136602, (List)((List)((Object)mO.lOtii0r("jvxkl", -678136597, 1153379482, 1153379481, 1153379486, -678136597, -678136597, (mO)this)[mO.lOtii0r("neloo", -678136595, 1153379482, 1153379487, 1153379484, -678136595, -678136595)[1]])), mq2 -> mO.lOtii0r("vrlhmv", -678136599, 1153379537, 1153379512, 1153379513, -678136599, -678136599, (mq)mq2, (Object)iw2));
    }

    private static /* synthetic */ long N(long l) {
        return -Long.rotateRight(Long.rotateLeft(Long.rotateLeft(Long.rotateRight(-l, 40), 33), 10), 29);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{81, -70, 98, 103, 27, -59, -48, -8, 78, -82, 17, 67, 5, -3, 64, -85};
        int n = 0;
        int n2 = 32;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 193;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int R(int n) {
        return -Integer.rotateRight(-Integer.rotateLeft(n ^ 0x88F69391, 11), 21) ^ 0x803C0CA1;
    }

    private static /* synthetic */ void ntfClinit() {
        lIlspnnm = "\u001f)M\u00b7\u00bd:C\u00f3$5\u00cb\u00c0}S\u009cw|DG\u0086\u00ab9T\u008e\u0005\u000elon\u0090\u009c\u001dW\u00f7\u00004\u0091\u00c1&)W\u00beLk\u009d\u008f\u001d\u0016\u00cd\u00006\u0083\u008bJ\n4G\u00f5t:\u00d5\u00a3\u0085DG\u0086\u00ab9T\u008e\r\f\u0002$DG\u0086\u00ab9T\u008e;\u0010:\u0084)[}DG\u0086\u00ab9T\u008e/\u0016\u0091\u00f1\u00e4Z(\u00ba\u001eLJ\u00b8\u00bf\u0006k\u00e4\fw\u00aa\u00fclSwn}DG\u0086\u00ab9T\u008e/\u0000\u008d\u009f\u00a6aw\u009d\u00d6\tM\u00c8\rw\u00a8\u00cdv\u001c4D\u00bcDG\u0086\u00ab9T\u008e\f\u0017\u00e6LJ\u00b8\u00bf\u0006k\u00e4\fw\u0088\u00fd>$4:\u00b8a.\u0090\u0098\u0012^\u008e2,\u0096\u00cdk\u000fe\u0001\u00e7LJ\u00b8\u00bf\u0006k\u00e4\fw\u0088\u00f0>UZ\u00c2LJ\u00b8\u00bf\u0006k\u00e4\fw\u00aa\u00fclS\u001ar\u00a6KE\u00ba\u0083.|\u00ccN\u0016\u00bc\u00cd>\u00a1eu\u0094\u0096\u0018f\u0097Ql\u00d3[Lk\u009d\u008f\u001d\u0016\u00cd\u00006\u0083\u008bJ\n4>ct:\u00bb)M\u00b7\u00bd:C\u00f3$5\u00cb\u00eaK\f;\u0019\u00cc\u0097I\u00e1aw\u009d\u00d6\u0010X\u00cf\u0006w\u00a6\u00cbj\u0004;:\u00e5\u00a6)M\u0093\u008b\u001b\u0016\u00cb\u000e5\u0088\u008bH\t*)\u00e7x5\u009a\u00aa\bX\u00c2\nc\u00a3FG\u00ba\u00d00V\u00d3\u0006w\u008e\u00cbh\u0004q\u0016\u00eats\u0095\u0081H_\u009a\u00a6LJ\u00b8\u00bf\u0006k\u00e4\fw\u0088\u00fd>$4:\u00f8a.\u0090\u0098\u0012^\u008e2,\u0096\u00cdk\u000fe\u0012\u00a7LJ\u00b8\u00bf\u0006k\u00e4\fw\u0088\u00c6>\u00fcf\u00ddDG\u0086\u00ab9T\u008e/\u0016\u00aa\u00d3V\u00a2\u00a1DG\u0086\u00ab9T\u008e\r:\u00a6)M\u00b7\u00bd:C\u00f3$5\u00cb\u00eaT\u0007e\u0002\u00e0?\u00b1c\u00f5id\u0090\u009d#\u000f\u0091Rn&)M\u0096\u0098\nX\u008e\r9\u008a\u00c3*'<Hkcu\u00c7\u00c6aw\u009d\u00d6\u0010X\u00cf\u0006w\u00ad\u00caq\r9G\u00de\u00aeam\u0089\u009c3_\u0084)M\u00b7\u00bd:C\u00f3$5\u00cb\u00ea]\u0001e\u00e8os\u00b9\u0098\u001fQ\u00fe\u00e7DG\u0086\u00ab9T\u008e\r3KDG\u0086\u00ab9T\u008e,\n\u00a7\u00c5DG\u0086\u00ab9T\u008e/\u0000\u008d\u00bb)M\u00b7\u00bd:C\u00f3$5\u00cb\u00fepS\u0093DG\u0086\u00ab9T\u008e;\u0000ceu\u0094\u0096\u0018f\u0096Ri\u00dc\u009dt\u00c5DG\u0086\u00ab9T\u008e;7\u00ddDG\u0086\u00ab9T\u008e\f)\u00edid\u0090\u009d#\u000f\u0091Pl\u00d0B\u0084Lk\u009d\u008f\u001d\u0016\u00cd\u00006\u0083\u008bJ\n4G\u00cft:\u00d5\u00af(LJ\u00b8\u00bf\u0006k\u00e4\fw\u00a9\u00f6>$1)g/k\u0093\u0094\u0010\u0016\u00ec\u0000,\u0096\u00cd}\\8\btab\u0097\u00c20r\u00e5'\"\u00b6\u00e1hG\u0010\u0003i;(\u00aa\u00e2r`\u0092\u008a\u0010X\u00d5\u0004\u001c\u001eLk\u009d\u008f\u001d\u0016\u00d4\u00151\u0088\u008bc\u001d0ABin\u0092\u00d6,K\u00c4\u00051\u0087\u00c5q\re\u000bzKE\u00ba\u0083.|\u00ccN4\u0093\u009f\u00dfLk\u009d\u008f\u001d\u0016\u00cd\u00006\u0083\u008bJ\n4>\u0094t:\u00b0\u0093\u001dO\u00c0N4\u0085\u00cabG\u00119\u009deb\u0088\u00c20S\u00c0\u00179\u00cb\u00c8d\u00069t\u00b8bk\u0099\u009a\b\u0002\u00ed\u000b9\u0092\u00c5*\u0004?5\u0090/N\u009e\u0093\u0019Z\u00d5Z\u0014\u008e\u00c5s\tq7\u0096nf\u00d3\u00b6\u001eS\u00c4\u0002,\u00df\u00e8o\t(:\u00d8l`\u0092\u009eSv\u00c3\u000b=\u0087\u00d0>A\u00121\u0096v`\u00d3\u008c\bP\u00cdN\u0014\u008d\u00d7qS\u00dfD(\u00b0\u00b28\u007f\u00db3\u001d\u0089\u008br*e\u00cdLk\u009d\u008f\u001d\u0016\u00cd\u00006\u0083\u008bV\u001c,K\u00f8g:n$KE\u00ba\u0083.|\u00ccN\u0016\u00bc\u00cd>Xrf\u00d3\u0093\u0013T\u00cdN\u0015\u0085\u00d0w\u0001&\u0016QSu\u009d\u009a\u0017\u0095\u00a1DG\u0086\u00ab9T\u008e\u0005 \u00b4inu\u00aa\u0098\u0010L\u00c4\u00bcur\u0094\u00b4\u001dM\u00d3\b \u000eid\u0090\u009d#\f\u0098Wa|DG\u0086\u00ab9T\u008e/\u0016\u00aa\u00ea@\u000f#DG\u0086\u00ab9T\u008e\u0016\nFoq\u00b1\u0098\bK\u00c8\u0019\u00c2Ln\u008e\u009eSS\u00ce\f4\u00cb\u00e9d\u001c,2\u00924g\u00af\u008d\u001dZ\u00caZ\u0014\u00af\u00e0C\u0012\f\u001e\u0087/[\u0089\u00c20r\u00e5'\"\u00b6\u00e1hG\u0004.\u00d1LJ\u00b8\u00bf\u0006k\u00e4\fw\u00aa\u00fclS\u0012\u0010\u00aeF{\u00ae\u00bc\u0011\u0016\u00d6#c\u00ad\u008dS\u00bcDG\u0086\u00ab9T\u008e/\u0016\u0080\u00c1lS\u00d8DG\u0086\u00ab9T\u008e\u0016\u001a\u00c2Lk\u009d\u008f\u001d\u0016\u00d4\u00151\u0088\u008bc\u001d08\u009ein\u0092\u00d6?V\u00cf\u0012-\u0089\u00c1wSw\rNBer\u0088\u0088\u00e6LJ\u00b8\u00bf\u0006k\u00e4\fw\u0080\u00dc>A\b\u00e4IH\u00d5\u00b0\u00e6)M\u00b7\u00bd:C\u00f3$5\u00cb\u00eaK&\u0010\u001e\u00a9;GZ(\u00b0\u0093\u001dO\u00c0N4\u0085\u00cabG\u001cM\u0000ld\u009d\u0097G\u00e6)H";
        Iljqnpri = new int[]{9633802, 4718593, 2490371, 28573697, 15990803, 62390273, 72286210, 8585230, 33357831, 73072672, 38338561, 58064915, 33816577, 61669377, 45875201, 25821186, 48824446, 28639233, 13238274, 33882122, 75169793, 10289197, 28770305, 18350082, 22872109, 26869770, 45940780, 0x1170001, 40370178, 28704769, 9502722, 72417290, 57081871, 65208330, 983041, 40501269, 59310081, 75563023, 60227606, 62980106, 19595290, 75497473, 5701644, 25952269, 39714826, 917505, 28508161, 28835850, 35192833, 63635466, 37552140, 32374799, 34537482, 76873746, 64290830, 6488068, 35258379, 13369373, 6750236, 45285385, 21299224, 36896778, 4784138, 35979278, 0x1990001, 59375629, 29491220, 30801937, 62455816, 79495171, 0x10000A, 76546053, 38404106, 66453581, 65863689, 39059466, 0x11A0011, 31916039, 78053398, 0x1070010, 71499788, 5439489, 1703948, 5505027, 41877556, 4063242, 14, 15269899, 27525135, 61734922, 75235332, 2686997};
        mO.T();
        mO.s();
        mO.b();
        mO.P();
        mO.v();
        mO.m();
    }

    private static /* synthetic */ String I10rmtIOq(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-2, 38, -55, 109, 9, 20, -16, 104, 117, 48, -111, 50, 112, -106, -56, 82};
        byte[] byArray3 = new byte[]{-76, 40, 56, -45, -50, -14, -48, -125, 45, 80, -82, -74, -4, -13, 11, -43};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOnnl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Iljqnpri[n2 ^ 0x44BF2C9A];
        int n9 = n8 >>> 16;
        String string2 = mO.I10rmtIOq(lIlspnnm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x44BF2C9A);
        n8 = Iljqnpri[n3 ^ 0x44BF2C9A];
        int n10 = n8 >>> 16;
        String string3 = mO.I10rmtIOq(lIlspnnm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x44BF2C9A);
        n8 = Iljqnpri[n4 ^ 0x44BF2C9A];
        int n11 = n8 >>> 16;
        String string4 = mO.I10rmtIOq(lIlspnnm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x44BF2C9A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD794745F) + -178;
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

    private static /* synthetic */ void I1ilqnn00(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[92];
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
        lIlspnnm = stringBuilder.toString();
        Iljqnpri = nArray;
    }

    private static /* synthetic */ CallSite IIOtpnm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Iljqnpri[n2 ^ 0x44BF2C9A];
        int n7 = n6 >>> 16;
        String string2 = mO.I10rmtIOq(lIlspnnm.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x44BF2C9A);
        n6 = Iljqnpri[n3 ^ 0x44BF2C9A];
        int n8 = n6 >>> 16;
        String string3 = mO.I10rmtIOq(lIlspnnm.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x44BF2C9A);
        n6 = Iljqnpri[n4 ^ 0x44BF2C9A];
        int n9 = n6 >>> 16;
        String string4 = mO.I10rmtIOq(lIlspnnm.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x44BF2C9A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD794745F) + -178;
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

    private static /* synthetic */ CallSite lOtii0r(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Iljqnpri[n2 ^ 0x44BF2C9A];
        int n8 = n7 >>> 16;
        String string2 = mO.I10rmtIOq(lIlspnnm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x44BF2C9A);
        n7 = Iljqnpri[n3 ^ 0x44BF2C9A];
        int n9 = n7 >>> 16;
        String string3 = mO.I10rmtIOq(lIlspnnm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x44BF2C9A);
        n7 = Iljqnpri[n4 ^ 0x44BF2C9A];
        int n10 = n7 >>> 16;
        String string4 = mO.I10rmtIOq(lIlspnnm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x44BF2C9A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xD794745F) + -178;
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
