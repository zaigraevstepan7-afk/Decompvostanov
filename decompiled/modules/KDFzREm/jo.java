/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNBK
 *  KDFzREm.NNMH
 *  KDFzREm.NNNNEg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NQI
 *  KDFzREm.NQo
 */
package KDFzREm;

import KDFzREm.NNBK;
import KDFzREm.NNMH;
import KDFzREm.NNNNEg;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQI;
import KDFzREm.NQJ;
import KDFzREm.NQo;
import KDFzREm.RA;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.td;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@UZ(L="Cooldowns", y=UR.VISUAL, N=Uz.INTERFACE)
public class jo
extends UM {
    private static short[] u;
    public Object[] L;
    private static int[] i;
    private static short[] R;
    private static float[] M;
    private static float[] B;
    private static boolean[] Z;
    private static byte[] z;
    private static String[] U;
    private static /* synthetic */ String lOstIOm0p;
    private static /* synthetic */ int[] lliptIn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight((-Integer.rotateRight(Integer.rotateLeft(-n, 28), 13) ^ 0x5062FAA8) + 1 ^ 0x482F4B76, 17);
    }

    private void P() {
        if (jo.IIitk("xeehkir", 1126479178, 700069680, 700069681, 700069682, 1126479178, 1126479178, (jo)this) == null) {
            jo.IIitk("xeehkir", 1126479179, 700069680, 700069681, 700069682, 1126479179, 1126479179, (jo)this, (Object[])new Object[jo.IIitk("mwhxnfg", 1126479180, 700069680, 700069683, 700069684, 1126479180, 1126479180)[4]]);
            CallSite callSite = jo.IIitk("ayegircp", 1126479178, 700069680, 700069681, 700069682, 1126479178, 1126479178, (jo)this);
        }
    }

    private static void T() {
        B = new float[]{0.0f, 20.0f};
        M = new float[]{99.0f, 1.0f, 100.0f, 100.0f, 0.33333334f, 1.0f, 1.0f};
    }

    public jo() {
        jo.IIitk("ikpikgxw", 1126479176, 700069680, 700069694, 700069690, 1126479176, 1126479176, (jo)this);
        CallSite callSite = jo.IIitk("wsodzyw", 1126479174, 700069666, 700069689, 700069667, 1126479174, 1126479174, (lY)this, (String)((Object)jo.IIitk("mwhxnfg", 1126479180, 700069680, 700069695, 700069664, 1126479180, 1126479180)[0]), (boolean)jo.IIitk("xeehkir", 1126479180, 700069680, 700069693, 700069665, 1126479180, 1126479180)[0]);
        jo.IIitk("ayegircp", 1126479178, 700069680, 700069681, 700069682, 1126479178, 1126479178, (jo)this)[jo.IIitk("mwhxnfg", 1126479180, 700069680, 700069668, 700069669, 1126479180, 1126479180)[0]] = callSite;
        CallSite callSite2 = jo.IIitk("wlmuivs", 1126479174, 700069666, 700069689, 700069667, 1126479174, 1126479174, (lY)this, (String)((Object)jo.IIitk("xeehkir", 1126479180, 700069680, 700069695, 700069664, 1126479180, 1126479180)[1]), (boolean)jo.IIitk("hxtnwcje", 1126479180, 700069680, 700069693, 700069665, 1126479180, 1126479180)[1]);
        jo.IIitk("bgfrygqf", 1126479178, 700069680, 700069681, 700069682, 1126479178, 1126479178, (jo)this)[jo.IIitk("wsodzyw", 1126479180, 700069680, 700069668, 700069669, 1126479180, 1126479180)[1]] = callSite2;
    }

    static {
        jo.ntfClinit();
    }

    @Override
    public boolean Z() {
        jo.IIitk("wsodzyw", 1126479176, 700069688, 700069689, 700069690, 1126479176, 1126479176, (td)((Object)jo.IIitk("mwhxnfg", 1126479174, 700069685, 700069686, 700069687, 1126479174, 1126479174)));
        return (boolean)jo.IIitk("ynxtvdg", 1126479177, 700069691, 700069693, 700069692, 1126479177, 1126479177, (UM)this);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-n ^ 0xF058630A, 5), 5) ^ 0x663080E9;
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{84, -128, -71, 45, -18, -98, 86, -95, -36, 69, -49, 108, -44, 60, -87, -60};
        int n = 0;
        int n2 = 81;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public boolean i() {
        jo.IIitk("wsodzyw", 1126479176, 700069688, 700069689, 700069690, 1944565669, 1556634807, (td)((Object)jo.IIitk("ikpikgxw", 1126479174, 700069685, 700069686, 700069687, 1944565669, 1556634807)));
        return (boolean)jo.IIitk("istgudaz", 1126479177, 700069691, 700069686, 700069692, 1944565669, 1556634807, (UM)this);
    }

    private static void b() {
        i = new int[]{-16777216};
    }

    private static void s() {
        Z = new boolean[]{true, false, true};
    }

    private static void n() {
        R = new short[]{0, 1, 1};
        u = new short[]{0, 0, 4, 0, 0, 3, 0, 3};
    }

    public boolean m() {
        jo.IIitk("faddh", 1126479176, 700069680, 700069694, 700069690, 1944565669, 1556634807, (jo)this);
        return (boolean)jo.IIitk("ayegircp", 1126479176, 700069673, 700069674, 700069692, 1944565669, 1556634807, (Boolean)((Boolean)((Object)jo.IIitk("aqgftgi", 1126479176, 700069671, 700069686, 700069672, 1944565669, 1556634807, (lT)((lT)((Object)jo.IIitk("bgfrygqf", 1126479178, 700069680, 700069681, 700069682, 412475697, -1218642042, (jo)this)[jo.IIitk("qjuaacgj", 1126479180, 700069680, 700069668, 700069669, 705041397, 1550599818)[2]]))))));
    }

    private static void v() {
        z = new byte[]{8, 9, 2, 3, 2};
    }

    private static void j() {
        U = new String[]{"render-on-items", "inventory-only", "99+"};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-60, 107, 101, -5, -33, -29, 57, 15, -79, 29, -58, -98, -61, -87, -25, 91};
        int n = 0;
        int n2 = 191;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 63;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 17) ^ 0xC99E78DB, 31), 5), 15) ^ 0x7D2A5A66, 30);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n, 18) ^ 0x9AAC8E3D, 10), 11), 8), 30);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-34, 59, 57, 90, 103, -71, 30, -120, -97, -88, 58, 60, -107, -47, -67, 28};
        int n = 0;
        int n2 = 248;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 109;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight((n ^ 0xCE9E74F9) + 1, 17) ^ 0x9442420F, 18), 28);
    }

    @uF
    public void N(RA rA) {
        jo.IIitk("wlmuivs", 1126479176, 700069680, 700069694, 700069690, 1944565669, 1556634807, (jo)this);
        if (jo.IIitk("ynxtvdg", 1126479176, 700069673, 700069674, 700069692, 1944565669, 1556634807, (Boolean)((Boolean)((Object)jo.IIitk("ikpikgxw", 1126479176, 700069671, 700069686, 700069672, 1944565669, 1556634807, (lT)((lT)((Object)jo.IIitk("aqgftgi", 1126479178, 700069680, 700069681, 700069682, 441280018, -438888763, (jo)this)[jo.IIitk("ayegircp", 1126479180, 700069680, 700069670, 700069669, 1446467217, -280464985)[0]])))))) == false) {
            return;
        }
        NNNwS nNNwS = (NNNwS)jo.IIitk("istgudaz", 1126479178, 700069676, 700069677, 700069682, -470394001, 113702983, (NNuU)((NNuU)jo.IIitk("bgfrygqf", 1126479178, 700069680, 700069675, 700069682, -1324928362, 365058833, (jo)this)[jo.IIitk("hxtnwcje", 1126479180, 700069680, 700069670, 700069669, -1246412544, -603849802)[1]]))[jo.IIitk("rghghijj", 1126479180, 700069680, 700069670, 700069669, -1763640601, 938728166)[2]];
        if (nNNwS == null) {
            return;
        }
        CallSite callSite = jo.IIitk("faddh", 1126479176, 700069678, 700069670, 700069679, 1944565669, 1556634807, (RA)rA);
        CallSite callSite2 = jo.IIitk("faddh", 1126479176, 700069648, 700069649, 700069650, 1944565669, 1556634807, (NNNwS)nNNwS);
        CallSite callSite3 = jo.IIitk("faddh", 1126479176, 700069651, 700069675, 700069652, 1944565669, 1556634807, (NQI)callSite2, (NQo)callSite);
        if (callSite3 == null) {
            return;
        }
        NQJ nQJ = (NQJ)((Object)jo.IIitk("ayegircp", 1126479175, 700069654, 700069655, 700069656, 1944565669, 1556634807, (Map)((Object)jo.IIitk("mwhxnfg", 1126479178, 700069651, 700069689, 700069653, 94948706, -1332756648, (NQI)callSite2)), (Object)callSite3));
        if (nQJ == null) {
            return;
        }
        CallSite callSite4 = jo.IIitk("ikpikgxw", 1126479175, 700069659, 700069689, 700069660, 1944565669, 1556634807, (NNNNEg)jo.IIitk("hxtnwcje", 1126479176, 700069676, 700069657, 700069658, 1944565669, 1556634807, (NNuU)((NNuU)jo.IIitk("xeehkir", 1126479178, 700069680, 700069675, 700069682, -400727232, 573958471, (jo)this)[jo.IIitk("ynxtvdg", 1126479180, 700069680, 700069670, 700069669, -805150118, 928508052)[3]])), (boolean)jo.IIitk("wsodzyw", 1126479180, 700069680, 700069693, 700069665, 993605425, -1932228974)[2]);
        float f = (float)jo.IIitk("wlmuivs", 1126479178, 700069661, 700069675, 700069662, 1690451104, 1477178481, (NQJ)nQJ) - ((float)jo.IIitk("ikpikgxw", 1126479178, 700069651, 700069675, 700069662, -1296561936, 298546291, (NQI)callSite2) + callSite4);
        if (f <= jo.IIitk("hxtnwcje", 1126479180, 700069680, 700069663, 700069632, -198111487, -1784831276)[0]) {
            return;
        }
        float f2 = f / jo.IIitk("hxtnwcje", 1126479180, 700069680, 700069663, 700069632, -450064910, -2072469785)[1];
        CallSite callSite5 = f2 > jo.IIitk("ikpikgxw", 1126479180, 700069680, 700069633, 700069632, 53697397, -778974041)[0] ? jo.IIitk("rghghijj", 1126479180, 700069680, 700069695, 700069664, 1466495843, 1436676771)[2] : jo.IIitk("xeehkir", 1126479174, 700069637, 700069638, 700069639, 1944565669, 1556634807, (int)jo.IIitk("hxtnwcje", 1126479174, 700069634, 700069635, 700069636, 1944565669, 1556634807, (float)f2));
        CallSite callSite6 = jo.IIitk("ayegircp", 1126479176, 700069651, 700069689, 700069640, 1944565669, 1556634807, (NQI)callSite2, (NQo)callSite, (float)callSite4);
        reference var12_12 = (jo.IIitk("bgfrygqf", 1126479180, 700069680, 700069633, 700069632, 937727299, 885185428)[1] - callSite6) * jo.IIitk("ayegircp", 1126479180, 700069680, 700069633, 700069632, -1231085243, 1231854768)[2];
        int n = jo.IIitk("ayegircp", 1126479174, 700069641, 700069633, 700069642, 1944565669, 1556634807, (float)(var12_12 / jo.IIitk("luvsny", 1126479180, 700069680, 700069633, 700069632, -1782589500, 925681911)[3] * jo.IIitk("mwhxnfg", 1126479180, 700069680, 700069633, 700069632, -1092824381, 1549128200)[4]), (float)jo.IIitk("wlmuivs", 1126479180, 700069680, 700069633, 700069632, -247102381, -1875682057)[5], (float)jo.IIitk("mwhxnfg", 1126479180, 700069680, 700069633, 700069632, -2086964903, -715949624)[6]) | jo.IIitk("qjuaacgj", 1126479180, 700069680, 700069686, 700069643, -455487890, 1263107937)[0];
        CallSite callSite7 = jo.IIitk("ayegircp", 1126479176, 700069678, 700069689, 700069644, 1944565669, 1556634807, (RA)rA);
        CallSite callSite8 = jo.IIitk("qjuaacgj", 1126479176, 700069678, 700069681, 700069645, 1944565669, 1556634807, (RA)rA);
        reference v0 = jo.IIitk("bgfrygqf", 1126479176, 700069678, 700069675, 700069645, 1944565669, 1556634807, (RA)rA) + jo.IIitk("luvsny", 1126479180, 700069680, 700069683, 700069684, 565867384, -1361571666)[0];
        jo.IIitk("wsodzyw", 1126479174, 700069646, 700069647, 700069656, 1944565669, 1556634807, (Object)((NNMH)jo.IIitk("wlmuivs", 1126479178, 700069676, 700069686, 700069682, 627388925, -449551296, (NNuU)((NNuU)jo.IIitk("luvsny", 1126479178, 700069680, 700069675, 700069682, -1838070201, -1786520662, (jo)this)[jo.IIitk("wsodzyw", 1126479180, 700069680, 700069670, 700069669, -549095786, 1322487014)[4]]))[jo.IIitk("xeehkir", 1126479180, 700069680, 700069670, 700069669, -145135213, 433076628)[5]]));
        reference var16_16 = v0 - jo.IIitk("faddh", 1126479180, 700069680, 700069683, 700069684, 349410732, -922910306)[1] / jo.IIitk("hxtnwcje", 1126479180, 700069680, 700069683, 700069684, -602600257, -1349534782)[2] - jo.IIitk("xeehkir", 1126479180, 700069680, 700069683, 700069684, -126361993, 97842846)[3];
        jo.IIitk("rghghijj", 1126479176, 700069744, 700069675, 700069745, 1944565669, 1556634807, (NNBK)callSite7, (NNMH)((NNMH)jo.IIitk("luvsny", 1126479178, 700069676, 700069686, 700069682, 1434368162, -883251091, (NNuU)((NNuU)jo.IIitk("ikpikgxw", 1126479178, 700069680, 700069675, 700069682, 980492962, -945426575, (jo)this)[jo.IIitk("hxtnwcje", 1126479180, 700069680, 700069670, 700069669, 1233748796, 1012570016)[6]]))[jo.IIitk("bgfrygqf", 1126479180, 700069680, 700069670, 700069669, -1122895056, -1923002389)[7]]), (String)((Object)callSite5), (int)callSite8, (int)var16_16, (int)n);
    }

    private static /* synthetic */ int R(int n) {
        return Integer.rotateRight((Integer.rotateRight(n, 5) ^ 0x3995FF2D) + 1 ^ 0x1A0846C1, 22);
    }

    private static /* synthetic */ void ntfClinit() {
        lOstIOm0p = "\u0005\u00d2\u00fc\u00d0\u00d7#sq+\u00ad\u00856/g\u00d1\u00bd\u00dd\u0012er<\u00d0\u008e\u0015Wls\u00b2\u00f4\u00f9\u00b2\u00d0\u00d7#sq+\u00ad\u00bf\u001c\u00cd\u00b6\u00fe\u00f0/@\u001b3\u00f6\u00a2\u0014WoC\u008b\u00f4\u00fe\u00f5\u00e78\u000eA2\u00eb\u00a7W7@H\u009e\u00acR\u00e7\u0090\u00f5\u00e78\u000eX'\u00ec\u00acW+VP\u0092\u00a1A\u0093\u00f5\u00e78\u000eX'\u00ec\u00acW5CV\u0093\u00b7\u00f5\u00e78\u000eA2\u00eb\u00a7W5CR~\u00d0\u00d7#sq+\u00ad\u00856\rw\u0088\u00bd\u00dd\u0012er<\u00d0\u008e\u0015Wls\u0094\u00f4\u00c48\u00d0\u00d7#sq+\u00ad\u0085)2\u00d1\u00bd\u00dd3@B'\u00ad\u00a7\u0019\u0016E\r\u00b4\u00adL\u009c\u00f7\u00e5b[\u00bd\u00d8\u00a1\u00c7\u00d1\u00d8\u00da\u001dgN\u0014\u00c7\u00a6W6sM\u00c0\u0089\u000f\u00bf\u000e\u00d2\u00b8\u0010(\u00d2\u00d7\u001f\b}yT\u00d8\u00da\u001dgN\u0014\u00c7\u00a6W\u0014{\u0019\u00b7\u00a5G\n\u00f5\u00be5@Z!\u00ad\u0098\f\nKL\u009c\u00f4|U\u00d8\u00da\u001dgN\u0014\u00c7\u00a6W\u0014v\u0019\u001d\u00ce\u00b8\u001f\u00e2\u00a2\u00d8\u00fb8WUi\u00ee\u00aa\u0016\u001f\rm\u0099\u00a5C\u009a\u00e0\u00aa\u00df\u00d0\u00d7#sq+\u00ad\u00999(\u00bd\u00dd\u0012er<\u00d0\u008e\u0015Wll\u00b5\u0081cg\u00af\u00d2\u00f1\u00e0,HF#\u00cc\u00a4\u00166WN\u0097\u00c9\u00d0\u00d7#sq+\u00ad\u00a7,\u00f9\u00df\u001d\u00bd\u00dd\u0012er<\u00d0\u008e\u0015Wll\u00b9\u0084\u001d\u00b2\u00d0\u00d7#sq+\u00ad\u00a7\u0013\u0015\u00d0\u00d7#sq+\u00ad\u008566Uq\u00ab\u00f5\u00fd,D{ K\u00d0\u00d7#sq+\u00ad\u009e5\u0015\u00d0\u00d7#sq+\u00ad\u00856:i\u00f5\u000e\u00d8\u00da\u001dgN\u0014\u00c7\u00a6W6sM\u00c0\u00e6jm\u00d0\u00d7#sq+\u00ad\u008566e\u0019\u00aa\u00dd\u00b8\u0015KU0\u00e3\u00e4\u0014\u0019LE\u00d4\u009cR\u00f0\u00fd\u00ff>\u001a\u000e\u00fb\u00e47E\u00ec\u00f1\u00e51NP\u0019\u00b5\u00f8MO)\u00a8\u001d\u00bd\u00cb\u00a9\u00d8\u00da\u001dgN\u0014\u00c7\u00a6W6lo\u00b3\u00f4j\u00eb\u00f5\u00e78\u000eX'\u00ec\u00acW+VP\u0092\u00a1A\u00ba\u00dd\u00d8\u0010\bbt\u00da\u00ce\u00b1\u00d0\u00d7#sq+\u00ad\u00b2\u00aa\u00bd\u00dd\u0012er<\u00d0\u008e\u0015WVF\u00c0\u00b4\u00dd\u00e5\u00f1\u00e5b\u00fb\u00fe5DU(\u00d4\u00aa\u0014\rG7\u00d0\u00d7#sq+\u00ad\u0085)1\u00cc\u0006(\u00bd\u00c7\u0005\u00d8\u00fb8WUi\u00ee\u00aa\u0016\u001f\rq\u008f\u00bdO0\u00f3\u00aa\u00d1\u00d8\u00fb8WUi\u00ee\u00aa\u0016\u001f\rm\u0099\u00a5C\u009a\u00e0\u00aapm^'\u00f4\u00aaW\u0014CL\u009c\u00e0i\u009b\u00fe\u00f4:U\u000f\u00dd\u00f5\u00e78\u000eX'\u00ec\u00acW:MM\u0097\u00aaG\u00d9\u0015\u00d0\u00d7#sq+\u00ad\u00a1\u0017[\u00dd'}\u00d6K\u00d0\u00d7#sq+\u00ad\u008566lg\u009c";
        lliptIn = new int[]{42074122, 2621441, 16908307, 36962305, 42926082, 0x2000009, 35061761, 34144270, 1966090, 0x1D0001, 37027843, 24707082, 30670851, 30539777, 9371649, 26148865, 37224467, 33423362, 22741002, 0xD0002D, 33357825, 0xB20002, 30605313, 20905994, 10158100, 40960017, 35389452, 13565953, 7602188, 42860545, 18153482, 0x80000F, 23396365, 29818891, 917519, 36175883, 26214429, 2686991, 6750221, 35192835, 38469670, 21561346, 18808850, 43057166, 16580612, 0x90000B, 35127297, 0x1010001, 2, 36896769, 5832718, 29491205, 12910596, 4784144, 24248327, 28114965, 11796497, 131084, 13172742, 42729474, 21692432, 11468803, 3670033, 19988494, 25362444, 30867494};
        jo.n();
        jo.v();
        jo.b();
        jo.s();
        jo.T();
        jo.j();
    }

    private static /* synthetic */ void oolpjm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[66];
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
        lOstIOm0p = stringBuilder.toString();
        lliptIn = nArray;
    }

    private static /* synthetic */ String IlsqOI0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{119, 119, -64, -114, -41, -29, 4, 66, 11, -114, -10, 41, -11, -86, -115, 81};
        byte[] byArray3 = new byte[]{-69, -112, 117, -103, 66, -121, -13, -65, 98, 5, -61, 77, 112, 90, 121, 49};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite ooIOptriO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lliptIn[n2 ^ 0x29BA3730];
        int n7 = n6 >>> 16;
        String string2 = jo.IlsqOI0(lOstIOm0p.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x29BA3730);
        n6 = lliptIn[n3 ^ 0x29BA3730];
        int n8 = n6 >>> 16;
        String string3 = jo.IlsqOI0(lOstIOm0p.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x29BA3730);
        n6 = lliptIn[n4 ^ 0x29BA3730];
        int n9 = n6 >>> 16;
        String string4 = jo.IlsqOI0(lOstIOm0p.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x29BA3730);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4324B5FE) + -178;
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

    private static /* synthetic */ CallSite I1IspOq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lliptIn[n2 ^ 0x29BA3730];
        int n9 = n8 >>> 16;
        String string2 = jo.IlsqOI0(lOstIOm0p.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x29BA3730);
        n8 = lliptIn[n3 ^ 0x29BA3730];
        int n10 = n8 >>> 16;
        String string3 = jo.IlsqOI0(lOstIOm0p.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x29BA3730);
        n8 = lliptIn[n4 ^ 0x29BA3730];
        int n11 = n8 >>> 16;
        String string4 = jo.IlsqOI0(lOstIOm0p.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x29BA3730);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4324B5FE) + -178;
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

    private static /* synthetic */ CallSite IIitk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lliptIn[n2 ^ 0x29BA3730];
        int n8 = n7 >>> 16;
        String string2 = jo.IlsqOI0(lOstIOm0p.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x29BA3730);
        n7 = lliptIn[n3 ^ 0x29BA3730];
        int n9 = n7 >>> 16;
        String string3 = jo.IlsqOI0(lOstIOm0p.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x29BA3730);
        n7 = lliptIn[n4 ^ 0x29BA3730];
        int n10 = n7 >>> 16;
        String string4 = jo.IlsqOI0(lOstIOm0p.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x29BA3730);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x4324B5FE) + -178;
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
