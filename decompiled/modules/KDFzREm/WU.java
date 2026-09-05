/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwz
 *  KDFzREm.NNtL
 *  KDFzREm.NNuU
 *  KDFzREm.NbL
 */
package KDFzREm;

import KDFzREm.NNNZg;
import KDFzREm.NNNwK;
import KDFzREm.NNNwz;
import KDFzREm.NNtL;
import KDFzREm.NNuU;
import KDFzREm.NbL;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.WE;
import KDFzREm.WW;
import KDFzREm.Wm;
import KDFzREm.bA;
import KDFzREm.lT;
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
import java.util.function.Predicate;

@UZ(L="ItemRelease", y=UR.COMBAT, N=Uz.BASE)
public class WU
extends UM {
    public Object[] L;
    private static String[] u;
    private static byte[] i;
    private static boolean[] R;
    private static short[] M;
    private static boolean[] B;
    private static short[] Z;
    private static /* synthetic */ String lljplrsl0;
    private static /* synthetic */ int[] l1nrI;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(Integer.rotateRight(-n, 18) ^ 0xA36E517C, 13) ^ 0x25771A37) + 1, 30), 1);
    }

    private static void P() {
        Z = new short[]{0, 1, 0};
        M = new short[]{0, 0, 1, 0, 0, 3, 0, 3};
    }

    private void T() {
        if (WU.OOknq("opbnjs", 113811315, -524992440, -524992444, -524992443, 113811315, (WU)this) == null) {
            WU.OOknq("zadzly", 113811314, -524992440, -524992444, -524992443, 113811314, (WU)this, (Object[])new Object[WU.OOknq("idvta", 113811317, -524992440, -524992435, -524992434, 113811317)[1]]);
            CallSite callSite = WU.OOknq("frym", 113811315, -524992440, -524992444, -524992443, 113811315, (WU)this);
        }
    }

    public WU() {
        WU.OOknq("zadzly", 113811313, -524992440, -524992439, -524992438, 113811313, (WU)this);
        lv[] lvArray = new WW[WU.OOknq("awgqoq", 113811317, -524992440, -524992435, -524992434, 113811317)[0]];
        lvArray[WU.OOknq("ujeox", 113811317, -524992440, -524992433, -524992448, 113811317)[0]] = new Wm(this, (String)((Object)WU.OOknq("yrfnw", 113811317, -524992440, -524992437, -524992436, 113811317)[1]), (boolean)WU.OOknq("idvta", 113811317, -524992440, -524992433, -524992448, 113811317)[1]);
        lvArray[WU.OOknq("ofyuzw", 113811317, -524992440, -524992433, -524992448, 113811317)[2]] = new WE(this, (String)((Object)WU.OOknq("ofyuzw", 113811317, -524992440, -524992437, -524992436, 113811317)[2]), (boolean)WU.OOknq("frym", 113811317, -524992440, -524992433, -524992448, 113811317)[3]);
        CallSite callSite = WU.OOknq("ujeox", 113811327, -524992447, -524992446, -524992445, 113811327, (lY)this, (String)((Object)WU.OOknq("faqr", 113811317, -524992440, -524992437, -524992436, 113811317)[0]), (lv[])lvArray);
        WU.OOknq("idvta", 113811315, -524992440, -524992444, -524992443, 113811315, (WU)this)[WU.OOknq("opbnjs", 113811317, -524992440, -524992442, -524992441, 113811317)[0]] = callSite;
        CallSite callSite2 = WU.OOknq("flssgal", 113811327, -524992447, -524992424, -524992423, 113811327, (lY)this, (String)((Object)WU.OOknq("awgqoq", 113811317, -524992440, -524992437, -524992436, 113811317)[3]), (boolean)WU.OOknq("ujeox", 113811317, -524992440, -524992433, -524992448, 113811317)[4]);
        WU.OOknq("awgqoq", 113811315, -524992440, -524992444, -524992443, 113811315, (WU)this)[WU.OOknq("yrfnw", 113811317, -524992440, -524992442, -524992441, 113811317)[1]] = callSite2;
    }

    static {
        WU.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-36, -100, 87, -59, -87, -56, 25, -94, 101, 22, 122, -3, 113, 8, 80, -106};
        int n = 0;
        int n2 = 14;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        CallSite callSite = WU.OOknq("ujeox", 113811326, -524992420, -524992419, -524992418, -648958814, (List)((Object)WU.OOknq("zadzly", 113811313, -524992413, -524992412, -524992411, -648958814, (NNNZg)((NNNZg)WU.OOknq("faqr", 113811315, -524992414, -524992439, -524992443, -401361923, (NNuU)((NNuU)WU.OOknq("ofyuzw", 113811315, -524992440, -524992446, -524992443, 1810329356, (WU)this)[WU.OOknq("zadzly", 113811317, -524992440, -524992429, -524992441, -1008643345)[4]]))[WU.OOknq("frym", 113811317, -524992440, -524992429, -524992441, -1175602305)[5]]))));
        while (WU.OOknq("faqr", 113811326, -524992417, -524992432, -524992431, -648958814, (Iterator)((Object)callSite)) != false) {
            NNNwz nNNwz = (NNNwz)WU.OOknq("idvta", 113811326, -524992417, -524992430, -524992421, -648958814, (Iterator)((Object)callSite));
            if (!(nNNwz instanceof NNNwK)) continue;
            NNNwK nNNwK = (NNNwK)nNNwz;
            WU.OOknq("faqr", 113811327, -524992410, -524992424, -524992409, -648958814, (NNNwK)nNNwK);
        }
    }

    private void s() {
        CallSite callSite = WU.OOknq("myvpmprc", 113811326, -524992420, -524992419, -524992418, -648958814, (List)((Object)WU.OOknq("frym", 113811313, -524992413, -524992412, -524992411, -648958814, (NNNZg)((NNNZg)WU.OOknq("frym", 113811315, -524992414, -524992439, -524992443, 457486589, (NNuU)((NNuU)WU.OOknq("myvpmprc", 113811315, -524992440, -524992446, -524992443, -650875726, (WU)this)[WU.OOknq("opbnjs", 113811317, -524992440, -524992429, -524992441, 1763913502)[6]]))[WU.OOknq("zadzly", 113811317, -524992440, -524992429, -524992441, -1309030831)[7]]))));
        while (WU.OOknq("frym", 113811326, -524992417, -524992432, -524992431, -648958814, (Iterator)((Object)callSite)) != false) {
            NNNwz nNNwz = (NNNwz)WU.OOknq("faqr", 113811326, -524992417, -524992430, -524992421, -648958814, (Iterator)((Object)callSite));
            if (!(nNNwz instanceof NNNwK)) continue;
            NNNwK nNNwK = (NNNwK)nNNwz;
            WU.OOknq("idvta", 113811327, -524992410, -524992446, -524992409, -648958814, (NNNwK)nNNwK);
        }
    }

    private static void m() {
        i = new byte[]{2, 2};
    }

    private static void v() {
        u = new String[]{"items", "trident", "crossbow", "hit-only"};
    }

    private static void j() {
        R = new boolean[]{false, true, true, true, false, false};
        B = new boolean[]{true, true, false};
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 8), 8), 30) ^ 0x403128E5, 8), 1), 12);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{54, -52, -109, -25, -126, -52, 84, 72, -76, 101, -44, 47, 72, 61, 94, 28};
        int n = 0;
        int n2 = 220;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 157;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(n, 21) ^ 0x148C95F1, 27), 19);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-58, -76, 55, 100, 120, 89, -41, -45, -108, 33, 8, 1, 0, 118, 100, 44};
        int n = 0;
        int n2 = 18;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 189;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 28), 8), 22), 27), 20), 1), 17), 23);
    }

    @uF
    public void N(Ry ry) {
        WU.OOknq("myvpmprc", 113811313, -524992440, -524992439, -524992438, -648958814, (WU)this);
        CallSite callSite = WU.OOknq("faqr", 113811326, -524992420, -524992419, -524992418, -648958814, (List)((List)((Object)WU.OOknq("ujeox", 113811313, -524992422, -524992435, -524992421, -648958814, (lj)((lj)((Object)WU.OOknq("zadzly", 113811315, -524992440, -524992444, -524992443, -644155571, (WU)this)[WU.OOknq("ofyuzw", 113811317, -524992440, -524992442, -524992441, 662409272)[2]]))))));
        while (WU.OOknq("opbnjs", 113811326, -524992417, -524992432, -524992431, -648958814, (Iterator)((Object)callSite)) != false) {
            WW wW = (WW)((Object)WU.OOknq("faqr", 113811326, -524992417, -524992430, -524992421, -648958814, (Iterator)((Object)callSite)));
            NbL[] nbLArray = NbL.values();
            int n = nbLArray.length;
            for (reference var6_6 = WU.OOknq("flssgal", 113811317, -524992440, -524992433, -524992448, 1492866240)[5]; var6_6 < n; ++var6_6) {
                NbL nbL = nbLArray[var6_6];
                if (WU.OOknq("opbnjs", 113811313, -524992428, -524992427, -524992426, -648958814, (WW)wW, (Object)((NNuU)WU.OOknq("faqr", 113811315, -524992440, -524992446, -524992443, 1736455451, (WU)this)[WU.OOknq("opbnjs", 113811317, -524992440, -524992429, -524992441, -109130509)[0]]), (Object)nbL) == false || WU.OOknq("faqr", 113811313, -524992440, -524992424, -524992425, -648958814, (WU)this, (WW)wW, (NbL)nbL) == false) continue;
                WU.OOknq("myvpmprc", 113811313, -524992428, -524992446, -524992408, -648958814, (WW)wW, (NNuU)((NNuU)WU.OOknq("nppcpum", 113811315, -524992440, -524992446, -524992443, -884217485, (WU)this)[WU.OOknq("faqr", 113811317, -524992440, -524992429, -524992441, -951953352)[1]]), (NbL)nbL);
            }
        }
    }

    private boolean N(WW wW, NbL nbL) {
        WU.OOknq("awgqoq", 113811313, -524992440, -524992439, -524992438, -648958814, (WU)this);
        if (WU.OOknq("opbnjs", 113811313, -524992391, -524992390, -524992431, -648958814, (Boolean)((Boolean)((Object)WU.OOknq("frym", 113811313, -524992392, -524992435, -524992421, -648958814, (lT)((lT)((Object)WU.OOknq("awgqoq", 113811315, -524992440, -524992444, -524992443, -1137502765, (WU)this)[WU.OOknq("awgqoq", 113811317, -524992440, -524992429, -524992441, 1566077500)[2]])))))) == false) {
            return (boolean)WU.OOknq("zadzly", 113811317, -524992440, -524992415, -524992448, 1285199737)[0];
        }
        WU.OOknq("ujeox", 113811313, -524992440, -524992389, -524992438, -648958814, (WU)this);
        CallSite callSite = WU.OOknq("idvta", 113811313, -524992428, -524992424, -524992388, -648958814, (WW)wW, (NNuU)((NNuU)WU.OOknq("idvta", 113811315, -524992440, -524992446, -524992443, 877554688, (WU)this)[WU.OOknq("faqr", 113811317, -524992440, -524992429, -524992441, 490851826)[3]]), (NbL)nbL, this::N);
        WU.OOknq("nppcpum", 113811313, -524992440, -524992387, -524992438, -648958814, (WU)this);
        return (boolean)callSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean N(bA bA2) {
        CallSite callSite;
        CallSite callSite2 = WU.OOknq("zadzly", 113811313, -524992407, -524992446, -524992406, -648958814, (bA)bA2);
        if (callSite2 instanceof NNtL) {
            NNtL nNtL = (NNtL)callSite2;
            if (WU.OOknq("ofyuzw", 113811326, -524992401, -524992427, -524992416, -648958814, (Predicate)((Object)WU.OOknq("frym", 113811327, -524992405, -524992437, -524992404, -648958814)), (Object)WU.OOknq("flssgal", 113811313, -524992403, -524992444, -524992402, -648958814, (NNtL)nNtL)) == false) {
                callSite = WU.OOknq("flssgal", 113811317, -524992440, -524992415, -524992448, 1761714724)[1];
                return (boolean)callSite;
            }
        }
        callSite = WU.OOknq("ofyuzw", 113811317, -524992440, -524992415, -524992448, -837802969)[2];
        return (boolean)callSite;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-87, -84, -99, 68, -45, 97, 89, -9, 90, -50, -128, 123, 28, 31, -115, 74};
        int n = 0;
        int n2 = 214;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 229;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        lljplrsl0 = "\f\u00bdq\u00b3/\u00c0)\u00ff=\u001eB\u009b\u00de\u00f6h\n\b:\u00f5K\u00b8a\u00da)\u00be/Ei\u0098\u009e\u00fcx\u0005q\u00a8n\u00bdn\u0083\u0018\u00e3?Ui\u0097\u00d0\u00eehPF\u0098A\u00a8R\u00e9%\u00be\u0014\u007fu\u00a1q2\u0090m\u00b3v\u00cdg\u00fd;_g\u00db\u00fe\u00f8g\u000ey\u00a8<\u009ej\u00cd>\u00f0u]a\u009a\u00d6\u00b5B\tp\u00b9d\u00a6;\u0085\u0012\u00c3\u00bdt\u009ce\u00d4<\u0093\u00bdq\u00b3/\u00d9<\u00f86\u001ef\u0081\u00df\u00f9y\u0002\u0096\u00b2(\u0082r\u00c9,\u00f89Pt\u0091L\u0098A\u00a8R\u00e9%\u00be/~\u0014\u0090L\u0096F\u00d6\u001a\u00d47\u001el\u00ad\u008a\u00d6g\nJ\u00bd(\u00bea\u00c2/\u00be\tEr\u009d\u00df\u00fd60p\u0097C\u0094z\u00fe\r\u00fcu]v\u00cf\u0098\u00d6F/z\u00a6U\u0097m\u0083$\u00fbaI\u0090m\u00b3v\u00cdg\u00fd;_g\u00db\u00e2\u00ee\u007f\u0002|\u00bb<@Y\u00f5K\u00b8a\u00da)\u00be/Ei\u0098\u009e\u00d6d\u0018\u0005\u00e7-\u0098A\u00a8R\u00e9%\u00be8p:\u0090L\u0096F\u00d6\u001a\u00d47\u001eN\u00ba\u00c4\u00cf6'Y\u0098A\u00a8R\u00e9%\u00be\u0014SL\u00cf\u00fd\u00f0l\u001ds\u00f3r\u00a6i\u00c0g\u00f7/_c\u0080\u00d8\u00f5cDT\u00a9i\u00b1t\u00c5'\u00ffa\u0018ZN\u0090L\u0096F\u00d6\u001a\u00d47\u001el\u00ad\u008a\u00d6g\n\u0010\u00bd(\u00bea\u00c2/\u00be\tEr\u009d\u00df\u00fd61O\u0090L\u0096F\u00d6\u001a\u00d47\u001el\u00a0\u008aX\u00b3h\u00bee\u00cd&\u00c7;]u\u0091K\u0090L\u0096F\u00d6\u001a\u00d47\u001eN\u00ba\u00c4\u00cf6'(\u0098A\u00a8R\u00e9%\u00be\u0014SL\u00cf\u0098\u00ccr\u00e6\u00f5K\u0099D\u00ea2\u00c3\u001f\\/\u00ba\u00d3\u00d16\u0093\u00bdq\u00b3/\u00d9<\u00f86\u001eI\u0080\u00d4\u00e8l\u001f\u0096\u00ae\u0083\u0098A\u00a8R\u00e9%\u00be\rf\u00f0\u0086\u00d8\u00c2/\u00f5K\u00b8a\u00da)\u00be6Pn\u0093\u009e\u00d5o\u0001b\u00bfs\u00e9\u0084c\u00b9\u007f\u00a6(\u00f5]Q\u0098A\u00a8R\u00e9%\u00be-hq\u0098A\u00a8R\u00e9%\u00be6[2(\u0098A\u00a8R\u00e9%\u00be\rdF\u0090L\u0096F\u00d6\u001a\u00d47\u001eN\u00ba\u00ff\u00edFPG\u008a\u00a5\u00b9s\u00bao\u00c8\u0017\u00a0b\u00055\u00c2K\u0098A\u00a8R\u00e9%\u00be6Z\u0012\u00f5Qt\u0095\u009ex\u00bdq\u00b3/\u00d9<\u00f86\u001eL\u009d\u00c2\u00ee\u0012\u00f5K\u0099D\u00ea2\u00c3\u001f\\/\u00ba\u00d2\u00d86\u00e6\u00f5K\u00b8a\u00da)\u00be/Ei\u0098\u009e\u00d3y\u000e\u00bc\u00bds\u00bdr\u0097-\u00abw\u0098A\u00a8R\u00e9%\u00be\u0014\u007fN\u00ae\u00d6\u0005\u00b9t\u00a6\u00fa\u0098A\u00a8R\u00e9%\u00be\u0014\u007ft\u00b8e\u00d8\u00a8b\u00a0a\u00d8'\u00e3*\u0090m\u00b3v\u00cdg\u00fd;_g\u00db\u00fe\u00f8g\u000e\u0012\u00a8<F\u0090L\u0096F\u00d6\u001a\u00d47\u001eW\u00a3\u008a\u00d6F/(\u00a6U\u0097m\u0083\u0006\u00f3\u0016\n)\u00ae5\u008f\u0083\u0090m\u00b3v\u00cdg\u00fd;_g\u00db\u00fe\u00f8g\u000e\u00c8\u00a8<\u00fbZB(\u0098A\u00a8R\u00e9%\u00be6e";
        l1nrI = new int[]{32374794, 32309249, 0x2200003, 26017793, 13303827, 0x1BB0001, 0x2240002, 39452673, 28901378, 34996234, 35848193, 9568313, 0x1D10001, 42008595, 14548993, 0x2B00002, 39387137, 20316205, 31653898, 29163540, 36044814, 41484296, 37945366, 27066386, 6619143, 30801923, 30539780, 3997697, 28246026, 40370180, 4063271, 43253788, 24051742, 15794186, 36962319, 0x88000A, 0x110020, 40632332, 26083343, 7077916, 45219861, 46596097, 3211276, 39518221, 34209804, 14614546, 30998538, 33030162, 46661642, 17, 23265292, 41418753, 16449595, 29097985};
        WU.P();
        WU.m();
        WU.j();
        WU.v();
    }

    private static /* synthetic */ CallSite OOknq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1nrI[n2 ^ 0xE0B54048];
        int n7 = n6 >>> 16;
        String string2 = WU.I1sIqiks(lljplrsl0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE0B54048);
        n6 = l1nrI[n3 ^ 0xE0B54048];
        int n8 = n6 >>> 16;
        String string3 = WU.I1sIqiks(lljplrsl0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE0B54048);
        n6 = l1nrI[n4 ^ 0xE0B54048];
        int n9 = n6 >>> 16;
        String string4 = WU.I1sIqiks(lljplrsl0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE0B54048);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x6C89FC7) + -178;
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

    private static /* synthetic */ void lOtOItj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[54];
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
        lljplrsl0 = stringBuilder.toString();
        l1nrI = nArray;
    }

    private static /* synthetic */ String I1sIqiks(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-81, -67, -88, -75, -34, 4, 86, -107, -55, 103, -109, 97, 30, -52, -63, -94};
        byte[] byArray3 = new byte[]{9, 116, 78, -122, -96, 57, 54, 72, -6, 61, 16, 112, -44, 13, -9, 105};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite oos0iOs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1nrI[n2 ^ 0xE0B54048];
        int n8 = n7 >>> 16;
        String string2 = WU.I1sIqiks(lljplrsl0.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xE0B54048);
        n7 = l1nrI[n3 ^ 0xE0B54048];
        int n9 = n7 >>> 16;
        String string3 = WU.I1sIqiks(lljplrsl0.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xE0B54048);
        n7 = l1nrI[n4 ^ 0xE0B54048];
        int n10 = n7 >>> 16;
        String string4 = WU.I1sIqiks(lljplrsl0.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xE0B54048);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x6C89FC7) + -178;
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

    private static /* synthetic */ CallSite lOnqpqO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = l1nrI[n2 ^ 0xE0B54048];
        int n7 = n6 >>> 16;
        String string2 = WU.I1sIqiks(lljplrsl0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xE0B54048);
        n6 = l1nrI[n3 ^ 0xE0B54048];
        int n8 = n6 >>> 16;
        String string3 = WU.I1sIqiks(lljplrsl0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xE0B54048);
        n6 = l1nrI[n4 ^ 0xE0B54048];
        int n9 = n6 >>> 16;
        String string4 = WU.I1sIqiks(lljplrsl0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xE0B54048);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x6C89FC7) + -178;
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
