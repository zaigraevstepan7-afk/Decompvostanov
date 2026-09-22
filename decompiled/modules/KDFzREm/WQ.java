/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAN
 *  KDFzREm.NNNNi
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNag
 *  KDFzREm.NNuU
 *  KDFzREm.NPh
 *  KDFzREm.NXi
 */
package KDFzREm;

import KDFzREm.NAN;
import KDFzREm.NNNNi;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNag;
import KDFzREm.NNuU;
import KDFzREm.NPh;
import KDFzREm.NXi;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.dI;
import KDFzREm.dJ;
import KDFzREm.kG;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="DeathCoords", y=UR.MISC, N=Uz.BASE)
public class WQ
extends UM {
    private static byte[] u;
    private static String[] i;
    private static boolean[] R;
    public Object[] L;
    private static short[] M;
    private static /* synthetic */ String OllImr;
    private static /* synthetic */ int[] lIsijOprq;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateRight((Integer.rotateRight(Integer.rotateRight(n, 4), 10) ^ 0xD13D52A) + 1, 11), 19);
    }

    private static void P() {
        u = new byte[]{3, 2};
    }

    private static void T() {
        R = new boolean[]{false, false, true, true};
    }

    public WQ() {
        WQ.lO0O0sI0j("umwalpui", 1062672399, 537111601, 537111600, 537111603, 1062672399, 1062672399, 1062672399, (WQ)this);
        CallSite callSite = WQ.lO0O0sI0j("dsizbhzj", 1062672385, 537111558, 537111612, 537111561, 1062672385, 1062672385, 1062672385, (lY)this, (String)((Object)WQ.lO0O0sI0j("remxctio", 1062672395, 537111601, 537111593, 537111592, 1062672395, 1062672395, 1062672395)[0]), (boolean)WQ.lO0O0sI0j("pohcvg", 1062672395, 537111601, 537111594, 537111597, 1062672395, 1062672395, 1062672395)[0]);
        WQ.lO0O0sI0j("hxkom", 1062672397, 537111601, 537111590, 537111606, 1062672397, 1062672397, 1062672397, (WQ)this)[WQ.lO0O0sI0j("dsizbhzj", 1062672395, 537111601, 537111609, 537111608, 1062672395, 1062672395, 1062672395)[0]] = callSite;
    }

    static {
        WQ.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-88, 18, 33, 67, 51, 89, -103, 94, -64, -2, 106, -39, -113, 55, -23, 104};
        int n = 0;
        int n2 = 15;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 75;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (WQ.lO0O0sI0j("hxkom", 1062672397, 537111601, 537111590, 537111606, 1062672397, 1062672397, 1062672397, (WQ)this) == null) {
            WQ.lO0O0sI0j("umwalpui", 1062672396, 537111601, 537111590, 537111606, 1062672396, 1062672396, 1062672396, (WQ)this, (Object[])new Object[WQ.lO0O0sI0j("hxkom", 1062672395, 537111601, 537111594, 537111597, 1062672395, 1062672395, 1062672395)[3]]);
            CallSite callSite = WQ.lO0O0sI0j("dsizbhzj", 1062672397, 537111601, 537111590, 537111606, 1062672397, 1062672397, 1062672397, (WQ)this);
        }
    }

    private static void s() {
        i = new String[]{"save-waypoint", "death-message", "death-waypoint"};
    }

    private static void m() {
        M = new short[]{0, 0, 3, 0, 4, 0, 4, 0};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-67, -38, 19, -48, -115, 69, 28, -84, -47, -84, -22, -70, -79, 13, 51, 100};
        int n = 0;
        int n2 = 109;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 81;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-n, 13), 20) ^ 0xFD4D8405;
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 4), 30), 30), 23);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{107, -95, -69, 17, -24, -14, -37, -69, 62, 125, -55, 127, 74, -96, 89, 52};
        int n = 0;
        int n2 = 176;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 249;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight((n ^ 0x65DA5C08) + 1, 5), 27), 14);
    }

    @uF
    public void N(Rs rs) {
        WQ.lO0O0sI0j("dsizbhzj", 1062672399, 537111601, 537111600, 537111603, -1583819523, 1737538876, -583430661, (WQ)this);
        CallSite callSite = WQ.lO0O0sI0j("remxctio", 1062672399, 537111602, 537111605, 537111604, -1583819523, 1737538876, -583430661, (Rs)rs);
        if (!(callSite instanceof NNNNi)) {
            return;
        }
        NNNNi nNNNi = (NNNNi)callSite;
        if (WQ.lO0O0sI0j("remxctio", 1062672399, 537111614, 537111585, 537111584, -1583819523, 1737538876, -583430661, (NNNZg)((NNNZg)WQ.lO0O0sI0j("pohcvg", 1062672397, 537111611, 537111610, 537111606, 1192597863, 738461518, -733802458, (NNuU)((NNuU)WQ.lO0O0sI0j("remxctio", 1062672397, 537111601, 537111607, 537111606, -1187324000, -823046494, -1436798668, (WQ)this)[WQ.lO0O0sI0j("mwradbb", 1062672395, 537111601, 537111609, 537111608, -961972528, -1443876482, 74420304)[1]]))[WQ.lO0O0sI0j("remxctio", 1062672395, 537111601, 537111609, 537111608, -653058626, -1198725733, 2095097252)[2]]), (int)WQ.lO0O0sI0j("remxctio", 1062672399, 537111613, 537111612, 537111615, -1583819523, 1737538876, -583430661, (NNNNi)nNNNi)) != (NNNwS)WQ.lO0O0sI0j("umwalpui", 1062672397, 537111611, 537111610, 537111606, 664426902, 1710995199, 1324005503, (NNuU)((NNuU)WQ.lO0O0sI0j("remxctio", 1062672397, 537111601, 537111607, 537111606, -1903617680, -1132881958, -366645738, (WQ)this)[WQ.lO0O0sI0j("umwalpui", 1062672395, 537111601, 537111609, 537111608, 1156662299, 2098583292, -434863801)[3]]))[WQ.lO0O0sI0j("yhgok", 1062672395, 537111601, 537111609, 537111608, 1470035940, -554056913, 515016779)[4]]) {
            return;
        }
        callSite = WQ.lO0O0sI0j("remxctio", 1062672399, 537111587, 537111586, 537111589, -1583819523, 1737538876, -583430661, (NNNwS)((NNNwS)WQ.lO0O0sI0j("hxkom", 1062672397, 537111611, 537111610, 537111606, -1837331763, 659416485, 1426893820, (NNuU)((NNuU)WQ.lO0O0sI0j("mwradbb", 1062672397, 537111601, 537111607, 537111606, 95808785, 414481773, -333553486, (WQ)this)[WQ.lO0O0sI0j("pohcvg", 1062672395, 537111601, 537111609, 537111608, -1043928990, -98924201, 1626432390)[5]]))[WQ.lO0O0sI0j("mwradbb", 1062672395, 537111601, 537111609, 537111608, 2046986923, 1553782741, -1588528257)[6]]));
        int n = (int)WQ.lO0O0sI0j("dsizbhzj", 1062672399, 537111588, 537111612, 537111591, -1583819523, 1737538876, -583430661, (NXi)callSite);
        int n2 = (int)WQ.lO0O0sI0j("umwalpui", 1062672399, 537111588, 537111607, 537111591, -1583819523, 1737538876, -583430661, (NXi)callSite);
        int n3 = (int)WQ.lO0O0sI0j("umwalpui", 1062672399, 537111588, 537111590, 537111591, -1583819523, 1737538876, -583430661, (NXi)callSite);
        Object[] objectArray = new Object[WQ.lO0O0sI0j("remxctio", 1062672395, 537111601, 537111605, 537111595, 792114176, 2147037541, 261533683)[0]];
        objectArray[WQ.lO0O0sI0j("mwradbb", 1062672395, 537111601, 537111594, 537111597, -1471603587, 741457556, 333184237)[1]] = WQ.lO0O0sI0j("pohcvg", 1062672385, 537111596, 537111599, 537111598, -1583819523, 1737538876, -583430661, n);
        objectArray[WQ.lO0O0sI0j("dsizbhzj", 1062672395, 537111601, 537111594, 537111597, 2102759266, -1801978466, -346226807)[2]] = WQ.lO0O0sI0j("pohcvg", 1062672385, 537111596, 537111599, 537111598, -1583819523, 1737538876, -583430661, n2);
        objectArray[WQ.lO0O0sI0j("umwalpui", 1062672395, 537111601, 537111605, 537111595, 1689256981, -1008765918, 2105433253)[1]] = WQ.lO0O0sI0j("mwradbb", 1062672385, 537111596, 537111599, 537111598, -1583819523, 1737538876, -583430661, n3);
        CallSite callSite2 = WQ.lO0O0sI0j("cuakxcac", 1062672399, 537111572, 537111612, 537111575, -1583819523, 1737538876, -583430661, (NNag)WQ.lO0O0sI0j("hxkom", 1062672385, 537111569, 537111612, 537111568, -1583819523, 1737538876, -583430661, (String)((Object)WQ.lO0O0sI0j("umwalpui", 1062672395, 537111601, 537111593, 537111592, -1820842998, 1201191729, -1380669935)[1]), (Object[])objectArray), (NPh)WQ.lO0O0sI0j("remxctio", 1062672395, 537111571, 537111570, 537111573, 1709250335, -832668083, -593584030));
        WQ.lO0O0sI0j("remxctio", 1062672385, 537111574, 537111612, 537111577, -1583819523, 1737538876, -583430661, (dI)new dJ(this), (NAN)callSite2);
        if (WQ.lO0O0sI0j("umwalpui", 1062672399, 537111578, 537111581, 537111580, -1583819523, 1737538876, -583430661, (Boolean)((Boolean)((Object)WQ.lO0O0sI0j("pohcvg", 1062672399, 537111576, 537111593, 537111579, -1583819523, 1737538876, -583430661, (lT)((lT)((Object)WQ.lO0O0sI0j("dsizbhzj", 1062672397, 537111601, 537111590, 537111606, -1561453078, -153952575, -1151541936, (WQ)this)[WQ.lO0O0sI0j("dsizbhzj", 1062672395, 537111601, 537111609, 537111608, -2038538752, -2080560907, -1770138769)[7]])))))) == false) {
            return;
        }
        WQ.lO0O0sI0j("cuakxcac", 1062672399, 537111556, 537111612, 537111559, -1583819523, 1737538876, -583430661, (kG)((Object)WQ.lO0O0sI0j("remxctio", 1062672385, 537111583, 537111582, 537111553, -1583819523, 1737538876, -583430661)), (String)((Object)WQ.lO0O0sI0j("mwradbb", 1062672385, 537111552, 537111612, 537111555, -1583819523, 1737538876, -583430661, (String)((Object)WQ.lO0O0sI0j("umwalpui", 1062672395, 537111601, 537111593, 537111592, -1219717088, 1672775405, -1024876158)[2]))), (NXi)new NXi((double)n, (double)n2, (double)n3), (String)((Object)WQ.lO0O0sI0j("umwalpui", 1062672385, 537111554, 537111590, 537111557, -1583819523, 1737538876, -583430661)));
    }

    private static /* synthetic */ void ntfClinit() {
        OllImr = "\u0003\u00a2\u0088!\u00a4\u00b6\u00fdV\u00fb\u00e2\u00adDh\u00e4\u00bd}\u0084\u00ce\u0001\u008a\u0093\u00d5z\u00c8\u00cb\u00b5\u000eAm\u00be\u001d*s(\u00e4\u00a3\u00bc\u00e4\u00ab\u0006\u0085\u0091\u00e9R\u00df\u00e3\u00f7oNL\u00ce:\u0097\u001e\u0089\u00a17\u0093\u0092\u00fe/\u00e0\u00ed8\u0089\u00a17\u0093\u0092\u00fe/\u00ed\u00ec(\u0081\u008d,\u00b7\u00b6\u00bcl\u00fb\u00e0\u00bf\u000e\\{\u0087\u0002n\u00aa\u00dc\u0001\u008a\u0093\u00d5z\u00c8\u00cb\u00b5\u000eAW\u009cPL\u00a7\u0086;\u00a0\u00f8\u00ffa\u00f4\u00e9\u00f7r{}\u009c\u0005g\u00f6\u00ce\u001b}\u0081\u008d,\u00b7\u00b6\u00bcl\u00fb\u00e0\u00bf\u000e\\{\u0087O;\u00aa\u00dc\u0016\u008d\u00bd\u00f2v\u00fb\u00a1\u00b4@ah\u00dai7\u00a7\u0082.\u00b5\u00ec\u00baL\u00d1\u00ca\u009e[]J\u0098\t\u001b\u0083\u0086*\u00fa\u00c6\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00c0\u0096V\\\u000ey*\u00ac\u0091,\u00ee\u00bb\u00f2n\u00fd\u00a1\u0091O{j\u0092V2\u0099\u008fS\u0089\u00a17\u0093\u0092\u00fe/\u00fe\u00d7\u00c7\u0086\u00a3\u000b\u00bb\u0085\u00d6m\u00b5\u00c0\u0088I4\u00df\u0089\u00a17\u0093\u0092\u00fe/\u00f1\u00c9W\u00a3\u00e4\u00ab'\u00a0\u00a1\u00f2/\u00f6\u00ef\u00b6F \\\u0081\u0095\u00e2\u00a3\u0080vT\u00a3\u00e4\u00ab\u0006\u0085\u0091\u00e9R\u00df\u00e3\u00f7oWf\u00ce(\u0081\u00ac\t\u0087\u00ad\u00c1E\u00f7\u00a1\u0096qg4\u00dc'K\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00c0\u00b9F4\u0089\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00c0\u00adt8\u0089\u00a17\u0093\u0092\u00fe/\u00c8\u00fd2\u0081\u00ac\t\u0087\u00ad\u00c1E\u00f7\u00a1\u00bch4C\u00be\u00b5\\\u00b7\u00b5\b\u00ac\u00f8\u00ddA\u00d4\u00b5\u00f1w\u0092\u00ac\u008b8\u00a4\u0098\u00f5\u0015\u00a4\u0082!\u00a5\u0088\u00a20\u00a2\u00be\u00af\u0089\u00a17\u0093\u0092\u00fe/\u00e3\u0013\u0084\u00ce\u0001\u00ab\u00b6\u00e5a\u00b5\u00e2\u00b9Oh \u00bc&O\u00a8\u0080(\u00b3\u00ec,\u0014\u00ac\u0091,\u00ee\u00bb\u00f2n\u00fd\u00a1\u009aN`c\u0090l\u0010\u00cc\u00e4\u00ae+\u00e4\u00ab\u0006\u0085\u0091\u00e9R\u00df\u00e3\u00f7JH4\u00d9\u009e\u00fe2\u0081\u00ac\t\u0087\u00ad\u00c1E\u00f7\u00a1\u00b4x4C\u009f\u0090l\u00ac\u00c8!\u00a0\u00b9\u00f4/\u00c9\u00fa\u00aaHah\u00ce\u00ab3\u0081\u00ac\t\u0087\u00ad\u00c1E\u00f7\u00a1\u00b4u4\u00c6\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00de\u00b0*\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00c0\u0096of\u001e\u00a8\u0093%\u00ae\u00b3\u00cc7\u00a9\u00bf\u00e0\u0018\u00df\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00d6\u00b17\u00a5\u00e4\u00b1H\u0089\u00a17\u0093\u0092\u00fe/\u00ed\u00e3\u00a5\u0081\u008d,\u00b7\u00b6\u00bcl\u00fb\u00e0\u00bf\u000e\\{\u0087i\u00e3\u00aa\u00dcd\u008d\u00bd\u00f2v\u00fb\u00a1\u00b4@ah\u00daS\u00f9\u00bf\u008e#\u00a6\u00ecC\u0081\u008d,\u00b7\u00b6\u00bcl\u00fb\u00e0\u00bf\u000e@m\u009f\u000e{\u00b9\u00dcn\u00a8\u0093%\u00ae\u00b3\u00cc8\u00ae\u00b8\u00e1H\u0089\u00a17\u0093\u0092\u00fe/\u00cd\u00df\u00ea\u00e4\u00ab'\u00a0\u00a1\u00f2/\u00f6\u00ef\u00b6F @\u0097g\u00a7\u00ae\u0093v~\u00c9\u0089\u00a17\u0093\u0092\u00fe/\u00f6\u00da\u00df\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00c0\u00b9F\u00d9\u0081\u008d,\u00b7\u00b6\u00bcl\u00fb\u00e0\u00bf\u000e\\{\u0087\u0098\u00ec\u00aa\u00dcp\u0089\u00a17\u0093\u0092\u00fe/\u00d4\u00c0\u0096{hS\u0089\u00a17\u0093\u0092\u00fe/\u00f6\u00e5";
        lIsijOprq = new int[]{40697866, 35323905, 35389443, 21168138, 29229057, 2359311, 0xC00001, 38731795, 16056321, 29097986, 20381708, 0x1F0001, 32964621, 12517377, 27983875, 45416461, 39976971, 983056, 11665421, 33816588, 17498127, 34603019, 2162691, 0x10A0001, 0x200001, 44171283, 0xD20002, 0x1990001, 0x330002, 0xC10011, 23658503, 25362454, 35586058, 8192053, 32243723, 24117258, 0xDE000D, 43384844, 18481181, 13893642, 21823516, 42729482, 41353236, 26869777, 12, 786435, 24772617, 42663937, 28180494, 3473418, 36241446, 4128778, 16121876, 15400970, 4784180, 46268426, 29294637};
        WQ.m();
        WQ.P();
        WQ.T();
        WQ.s();
    }

    private static /* synthetic */ String IImlI(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{50, 114, 49, 42, -16, 103, -71, 76, -42, -90, 40, 9, -65, -80, 83, 65};
        byte[] byArray3 = new byte[]{-74, 3, -106, 44, 106, -66, 79, 118, 115, -91, -30, -21, 15, -89, 55, 4};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite I1q0jms(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lIsijOprq[n2 ^ 0x2003AC31];
        int n10 = n9 >>> 16;
        String string2 = WQ.IImlI(OllImr.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x2003AC31);
        n9 = lIsijOprq[n3 ^ 0x2003AC31];
        int n11 = n9 >>> 16;
        String string3 = WQ.IImlI(OllImr.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x2003AC31);
        n9 = lIsijOprq[n4 ^ 0x2003AC31];
        int n12 = n9 >>> 16;
        String string4 = WQ.IImlI(OllImr.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x2003AC31);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3F5718B9) + -178;
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

    private static /* synthetic */ CallSite lO0O0sI0j(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIsijOprq[n2 ^ 0x2003AC31];
        int n9 = n8 >>> 16;
        String string2 = WQ.IImlI(OllImr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x2003AC31);
        n8 = lIsijOprq[n3 ^ 0x2003AC31];
        int n10 = n8 >>> 16;
        String string3 = WQ.IImlI(OllImr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x2003AC31);
        n8 = lIsijOprq[n4 ^ 0x2003AC31];
        int n11 = n8 >>> 16;
        String string4 = WQ.IImlI(OllImr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x2003AC31);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x3F5718B9) + -178;
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

    private static /* synthetic */ void llppt(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[57];
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
        OllImr = stringBuilder.toString();
        lIsijOprq = nArray;
    }
}
