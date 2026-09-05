/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAJ
 *  KDFzREm.NAN
 *  KDFzREm.NNNZZ
 *  KDFzREm.NNNwS
 *  KDFzREm.NNYH
 *  KDFzREm.NNqv
 *  KDFzREm.NNuU
 *  KDFzREm.NTS
 *  KDFzREm.NYj
 *  KDFzREm.NkQ
 *  KDFzREm.Nkq
 *  KDFzREm.Nwn
 *  org.apache.commons.lang3.RandomUtils
 */
package KDFzREm;

import KDFzREm.Mn;
import KDFzREm.NAJ;
import KDFzREm.NAN;
import KDFzREm.NNNZZ;
import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNqv;
import KDFzREm.NNuU;
import KDFzREm.NTS;
import KDFzREm.NYj;
import KDFzREm.NkQ;
import KDFzREm.Nkq;
import KDFzREm.Nwn;
import KDFzREm.RV;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.kT;
import KDFzREm.lG;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.ll;
import KDFzREm.lv;
import KDFzREm.sA;
import KDFzREm.sC;
import KDFzREm.sF;
import KDFzREm.sf;
import KDFzREm.uA;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;
import org.apache.commons.lang3.RandomUtils;

@UZ(L="ChestStealer", y=UR.PLAYER, N=Uz.BASE)
public class sp
extends UM {
    private static String[] i;
    private static byte[] R;
    private static boolean[] M;
    private static short[] B;
    private static boolean[] Z;
    private static short[] z;
    private static float[] U;
    private static boolean[] W;
    private static boolean[] m;
    private static short[] P;
    public Object[] L;
    private static short[] s;
    private static short[] T;
    private static short[] b;
    private static short[] j;
    private static long[] v;
    private static short[] n;
    public Object[] u;
    private static /* synthetic */ String Oltpm;
    private static /* synthetic */ int[] l1njr0jtk;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 3), 26), 14), 9), 27), 28);
    }

    private static /* synthetic */ int M(int n) {
        return (Integer.rotateRight(Integer.rotateLeft(n, 1), 4) ^ 0xAF8D4007) + 1;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{65, -56, -91, -88, -22, 2, 53, 55, 51, 62, -21, -69, 40, -102, -94, 74};
        int n = 0;
        int n2 = 230;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 17;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void P() {
        sp.IIOpi("ctpv", -870263458, 498866046, 498866047, 498866044, 1849596998, -1788723587, (sp)this);
        CallSite callSite = sp.IIOpi("uxijg", -870263472, 498866032, 498866011, 498866008, 1849596998, -1788723587, (int)sp.IIOpi("qnui", -870263458, 498866023, 498866013, 498866010, 1849596998, -1788723587, (RandomUtils)sp.IIOpi("qnui", -870263472, 498866023, 498866020, 498866021, 1849596998, -1788723587), (int)sp.IIOpi("yvmv", -870263458, 498866015, 498866025, 498866012, 1849596998, -1788723587, (lG)((lG)((Object)sp.IIOpi("yvmv", -870263458, 498866016, 498866017, 498866014, 1849596998, -1788723587, (ll)((ll)((Object)sp.IIOpi("sagf", -870263460, 498866046, 498866018, 498866037, -1797211267, -255932815, (sp)this)[sp.IIOpi("yvmv", -870263462, 498866046, 498866019, 498866035, 730370957, -84849983)[2]])))))), (int)((int)sp.IIOpi("uxijg", -870263458, 498866015, 498866018, 498866012, 1849596998, -1788723587, (lG)((lG)((Object)sp.IIOpi("nxbkzsc", -870263458, 498866016, 498866017, 498866014, 1849596998, -1788723587, (ll)((ll)((Object)sp.IIOpi("uxijg", -870263460, 498866046, 498866018, 498866037, 534201149, 2123840542, (sp)this)[sp.IIOpi("uxijg", -870263462, 498866046, 498866019, 498866035, 1406948857, 1049451195)[3]])))))))));
        sp.IIOpi("uuylb", -870263460, 498866046, 498866036, 498866037, 1722529437, 704135968, (sp)this)[sp.IIOpi("qnui", -870263462, 498866046, 498866019, 498866035, -832273199, 1290114066)[4]] = callSite;
    }

    private static void T() {
        W = new boolean[]{true, false};
        M = new boolean[]{true, true, false, false, true, false};
        m = new boolean[]{true, false};
        Z = new boolean[]{false, true, false, true, false, false, false};
    }

    public sp() {
        sp.IIOpi("dnmgs", -870263458, 498866046, 498866047, 498866044, -870263458, -870263458, (sp)this);
        sA sA2 = new sA((String)((Object)sp.IIOpi("pwwifiox", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[0]), (boolean)sp.IIOpi("sagf", -870263462, 498866046, 498865982, 498866042, -870263462, -870263462)[0]);
        sp.IIOpi("uxijg", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("uuylb", -870263462, 498866046, 498865983, 498866035, -870263462, -870263462)[0]] = sA2;
        sf sf2 = new sf((String)((Object)sp.IIOpi("qafhunz", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[1]));
        sp.IIOpi("sagf", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("dnmgs", -870263462, 498866046, 498865983, 498866035, -870263462, -870263462)[1]] = sf2;
        sC sC2 = new sC((String)((Object)sp.IIOpi("ctpv", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[2]));
        sp.IIOpi("uxijg", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("pwwifiox", -870263462, 498866046, 498865983, 498866035, -870263462, -870263462)[2]] = sC2;
        lv[] lvArray = new sF[sp.IIOpi("sagf", -870263462, 498866046, 498866031, 498866028, -870263462, -870263462)[0]];
        lvArray[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498865982, 498866042, -870263462, -870263462)[1]] = (sA)((Object)sp.IIOpi("yvmv", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("fwhmo", -870263462, 498866046, 498865983, 498866035, -870263462, -870263462)[3]]);
        lvArray[sp.IIOpi("neeo", -870263462, 498866046, 498865986, 498866042, -870263462, -870263462)[0]] = (sf)((Object)sp.IIOpi("qnui", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498865983, 498866035, -870263462, -870263462)[4]]);
        lvArray[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498866031, 498866028, -870263462, -870263462)[1]] = (sC)((Object)sp.IIOpi("eeys", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("eeys", -870263462, 498866046, 498865980, 498866035, -870263462, -870263462)[0]]);
        CallSite callSite = sp.IIOpi("nxbkzsc", -870263472, 498865981, 498866025, 498865978, -870263472, -870263472, (lY)this, (String)((Object)sp.IIOpi("qnui", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[3]), (lv[])lvArray);
        sp.IIOpi("sagf", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("dnmgs", -870263462, 498866046, 498865980, 498866035, -870263462, -870263462)[1]] = callSite;
        CallSite callSite2 = sp.IIOpi("eeys", -870263472, 498865981, 498866025, 498865979, -870263472, -870263472, (lY)this, (String)((Object)sp.IIOpi("qafhunz", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[4]), (boolean)sp.IIOpi("pwwifiox", -870263462, 498866046, 498865986, 498866042, -870263462, -870263462)[1]);
        sp.IIOpi("nxbkzsc", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("eeys", -870263462, 498866046, 498865980, 498866035, -870263462, -870263462)[2]] = callSite2;
        CallSite callSite3 = sp.IIOpi("yvmv", -870263472, 498865981, 498866025, 498865979, -870263472, -870263472, (lY)this, (String)((Object)sp.IIOpi("uuylb", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[5]), (boolean)sp.IIOpi("uxijg", -870263462, 498866046, 498865986, 498866042, -870263462, -870263462)[2]);
        sp.IIOpi("nxbkzsc", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("uxijg", -870263462, 498866046, 498865980, 498866035, -870263462, -870263462)[3]] = callSite3;
        CallSite callSite4 = sp.IIOpi("dnmgs", -870263472, 498865981, 498866025, 498865974, -870263472, -870263472, (lY)this, (String)((Object)sp.IIOpi("dnmgs", -870263462, 498866046, 498866017, 498865985, -870263462, -870263462)[6]), (lG)new lG((float)sp.IIOpi("sagf", -870263462, 498866046, 498865976, 498865977, -870263462, -870263462)[0], (float)sp.IIOpi("pwwifiox", -870263462, 498866046, 498865976, 498865977, -870263462, -870263462)[1]), (lG)new lG((float)sp.IIOpi("qafhunz", -870263462, 498866046, 498865976, 498865977, -870263462, -870263462)[2], (float)sp.IIOpi("nxbkzsc", -870263462, 498866046, 498865976, 498865977, -870263462, -870263462)[3]), (float)sp.IIOpi("pwwifiox", -870263462, 498866046, 498865976, 498865977, -870263462, -870263462)[4]);
        sp.IIOpi("uxijg", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("ctpv", -870263462, 498866046, 498865980, 498866035, -870263462, -870263462)[4]] = callSite4;
        kT kT2 = new kT();
        sp.IIOpi("eeys", -870263460, 498866046, 498866036, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("qafhunz", -870263462, 498866046, 498866047, 498866035, -870263462, -870263462)[0]] = kT2;
    }

    static {
        sp.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{26, 65, -30, -82, 97, 117, -41, 24, -7, -76, 123, 19, -79, 69, 71, 88};
        int n = 0;
        int n2 = 64;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 145;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-45, -6, -28, -90, 62, 91, -80, 109, 0, 30, 12, -34, -8, -70, -8, 106};
        int n = 0;
        int n2 = 123;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 141;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateRight(n ^ 0xDC53CB3, 16) ^ 0x499C11D8) + 1;
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{118, -125, -41, 44, -44, 81, 123, 121, 119, 63, 120, -65, 108, 113, -58, 2};
        int n = 0;
        int n2 = 113;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 157;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        v = new long[]{100L};
    }

    private void s() {
        sp.IIOpi("qnui", -870263458, 498866046, 498866047, 498866044, -870263458, -870263458, (sp)this);
        Object var5_1 = null;
        sp.IIOpi("eeys", -870263460, 498866046, 498866036, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("ctpv", -870263462, 498866046, 498866019, 498866035, -870263462, -870263462)[5]] = var5_1;
        CallSite callSite = sp.IIOpi("nxbkzsc", -870263462, 498866046, 498866045, 498866042, -870263462, -870263462)[4];
        CallSite callSite2 = sp.IIOpi("uuylb", -870263472, 498866032, 498866011, 498866008, -870263472, -870263472, (int)callSite);
        sp.IIOpi("yvmv", -870263460, 498866046, 498866036, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("ctpv", -870263462, 498866046, 498866019, 498866035, -870263462, -870263462)[6]] = callSite2;
        CallSite callSite3 = sp.IIOpi("yvmv", -870263472, 498866032, 498866011, 498866008, -870263472, -870263472, (int)callSite);
        sp.IIOpi("qafhunz", -870263460, 498866046, 498866036, 498866037, -870263460, -870263460, (sp)this)[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498866019, 498866035, -870263462, -870263462)[7]] = callSite3;
    }

    private void n() {
        CallSite callSite;
        if (sp.IIOpi("yvmv", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this) == null) {
            sp.IIOpi("neeo", -870263459, 498866046, 498866018, 498866037, -870263459, -870263459, (sp)this, (Object[])new Object[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498866031, 498866028, -870263462, -870263462)[3]]);
            callSite = sp.IIOpi("fwhmo", -870263460, 498866046, 498866018, 498866037, -870263460, -870263460, (sp)this);
        }
        if (sp.IIOpi("ctpv", -870263460, 498866046, 498866036, 498866037, -870263460, -870263460, (sp)this) == null) {
            sp.IIOpi("qnui", -870263459, 498866046, 498866036, 498866037, -870263459, -870263459, (sp)this, (Object[])new Object[sp.IIOpi("qnui", -870263462, 498866046, 498866031, 498866028, -870263462, -870263462)[4]]);
            callSite = sp.IIOpi("nxbkzsc", -870263460, 498866046, 498866036, 498866037, -870263460, -870263460, (sp)this);
            callSite[sp.IIOpi("yvmv", -870263462, 498866046, 498866031, 498866028, -870263462, -870263462)[5]] = sp.IIOpi("qnui", -870263472, 498866032, 498866011, 498866008, -870263472, -870263472, (int)sp.IIOpi("uxijg", -870263462, 498866046, 498866045, 498866042, -870263462, -870263462)[5]);
            callSite[sp.IIOpi("fwhmo", -870263462, 498866046, 498866031, 498866028, -870263462, -870263462)[6]] = sp.IIOpi("sagf", -870263472, 498866032, 498866011, 498866008, -870263472, -870263472, (int)sp.IIOpi("qafhunz", -870263462, 498866046, 498866045, 498866042, -870263462, -870263462)[6]);
        }
    }

    private static void m() {
        R = new byte[]{3, 2, 40, 7, 4, 2, 3};
    }

    private static void t() {
        i = new String[]{"normal", "reverse", "shuffle", "loot-type", "auto-close", "ignore-server-menus", "delay", "container."};
    }

    private static void v() {
        U = new float[]{0.0f, 600.0f, 100.0f, 300.0f, 10.0f};
    }

    private static void j() {
        B = new short[]{0, 1, 2, 0, 1};
        z = new short[]{2, 3, 4, 5, 6};
        n = new short[]{0, 3};
        s = new short[]{0, 3, 1, 5, 1};
        P = new short[]{4, 0, 4, 3, 3, 1, 1, 1};
        T = new short[]{0, 2, 0, 3};
        b = new short[]{0, 0, 2, 0, 4};
        j = new short[]{3, 1, 6, 6, 2, 1, 2, 3};
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{126, 84, 60, 110, -44, -54, 32, -57, -67, 127, -93, -41, -69, 5, 6, -71};
        int n = 0;
        int n2 = 198;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 81;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{0, 5, 66, 111, -67, 94, 10, 85, -20, 103, 118, -61, -16, 34, -82, 48};
        int n = 0;
        int n2 = 38;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 175;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n, 26), 8) ^ 0xEA50A6E9, 1) ^ 0xBE5504BD;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-120, -84, -49, -62, -125, -116, -32, 91, -117, 28, -70, 58, -41, 114, -52, 81};
        int n = 0;
        int n2 = 34;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 237;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @Override
    public void y() {
        sp.IIOpi("uxijg", -870263458, 498866046, 498866006, 498866044, -870263458, -870263458, (sp)this);
        sp.IIOpi("ctpv", -870263457, 498865975, 498866009, 498866044, -870263457, -870263457, (UM)this);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(-Integer.rotateLeft(-n ^ 0xE3CFE6D3, 12), 20) ^ 0x5B69B1A4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean N(NNqv nNqv) {
        CallSite callSite;
        CallSite callSite2 = sp.IIOpi("uuylb", -870263471, 498865963, 498865960, 498865961, 1849596998, -1788723587, (NAN)sp.IIOpi("sagf", -870263458, 498866001, 498865965, 498865962, 1849596998, -1788723587, (NNqv)nNqv));
        if (callSite2 instanceof NAJ) {
            NAJ nAJ = (NAJ)callSite2;
            if (sp.IIOpi("qnui", -870263458, 498865956, 498865957, 498865954, 1849596998, -1788723587, (String)((Object)sp.IIOpi("uuylb", -870263458, 498865958, 498866009, 498865959, 1849596998, -1788723587, (NAJ)nAJ)), (String)((Object)sp.IIOpi("dnmgs", -870263462, 498866046, 498866017, 498865985, -763622874, 1926402961)[7])) != false) {
                callSite = sp.IIOpi("dnmgs", -870263462, 498866046, 498865955, 498866042, 1563740540, 2049804997)[1];
                return (boolean)callSite;
            }
        }
        callSite = sp.IIOpi("uxijg", -870263462, 498866046, 498865955, 498866042, -666214812, -221298025)[0];
        return (boolean)callSite;
    }

    /*
     * WARNING - void declaration
     */
    private void N(NkQ nkQ) {
        void var5_6;
        CallSite callSite;
        block7: {
            block6: {
                sp.IIOpi("ctpv", -870263458, 498866046, 498866047, 498866044, 1849596998, -1788723587, (sp)this);
                callSite = sp.IIOpi("uxijg", -870263471, 498865993, 498865990, 498866030, 1849596998, -1788723587, (NTS)sp.IIOpi("pwwifiox", -870263458, 498865995, 498865998, 498865992, 1849596998, -1788723587, (NkQ)nkQ));
                if ((int[])sp.IIOpi("uxijg", -870263460, 498866046, 498866036, 498866037, 1194221875, 1058874319, (sp)this)[sp.IIOpi("qafhunz", -870263462, 498866046, 498865997, 498866035, -1688700394, -1264429521)[5]] == null) break block6;
                if (((int[])sp.IIOpi("uuylb", -870263460, 498866046, 498866036, 498866037, -1282235197, 861789951, (sp)this)[sp.IIOpi("pwwifiox", -870263462, 498866046, 498865997, 498866035, -899655140, -773627838)[6]]).length == callSite) break block7;
            }
            sp.IIOpi("qnui", -870263458, 498866046, 498866031, 498865952, 1849596998, -1788723587, (sp)this, (int)callSite);
        }
        int[] nArray = (int[])sp.IIOpi("eeys", -870263460, 498866046, 498866036, 498866037, 253902569, 83124773, (sp)this)[sp.IIOpi("dnmgs", -870263462, 498866046, 498865997, 498866035, -2125302244, -380924777)[7]];
        int n = nArray.length;
        CallSite callSite2 = sp.IIOpi("nxbkzsc", -870263462, 498866046, 498865986, 498866042, -1790912682, -1166935391)[5];
        while (var5_6 < n) {
            int n2 = nArray[var5_6];
            CallSite callSite3 = sp.IIOpi("yvmv", -870263458, 498865995, 498866018, 498865987, 1849596998, -1788723587, (NkQ)nkQ, n2);
            if (sp.IIOpi("ctpv", -870263458, 498865984, 498866031, 498866003, 1849596998, -1788723587, (NYj)callSite3) != false) {
                if (sp.IIOpi("neeo", -870263458, 498866024, 498866025, 498866022, 1849596998, -1788723587, (kT)((kT)((Object)sp.IIOpi("fwhmo", -870263460, 498866046, 498866036, 498866037, -206757, 1347188010, (sp)this)[sp.IIOpi("ctpv", -870263462, 498866046, 498866034, 498866035, -56994496, -1695694050)[0]])), (long)((long)sp.IIOpi("neeo", -870263458, 498866032, 498866033, 498866030, 1849596998, -1788723587, (Integer)((Object)sp.IIOpi("nxbkzsc", -870263460, 498866046, 498866036, 498866037, -1713828961, 274102842, (sp)this)[sp.IIOpi("dnmgs", -870263462, 498866046, 498866034, 498866035, 1339864068, 998076731)[1]])))) != false) {
                    sp.IIOpi("nxbkzsc", -870263458, 498866046, 498866025, 498865953, 1849596998, -1788723587, (sp)this, (NkQ)nkQ, (NYj)callSite3);
                    sp.IIOpi("eeys", -870263458, 498866046, 498865997, 498866044, 1849596998, -1788723587, (sp)this);
                    sp.IIOpi("fwhmo", -870263458, 498866046, 498866031, 498865952, 1849596998, -1788723587, (sp)this, (int)callSite);
                    sp.IIOpi("sagf", -870263458, 498866024, 498866025, 498866044, 1849596998, -1788723587, (kT)((kT)((Object)sp.IIOpi("qafhunz", -870263460, 498866046, 498866036, 498866037, 1037489178, -1439089533, (sp)this)[sp.IIOpi("uxijg", -870263462, 498866046, 498866034, 498866035, -1441047496, 1327119408)[2]])));
                    break;
                }
            }
            ++var5_6;
        }
    }

    @uF
    public void N(Mn mn) {
        sp.IIOpi("ctpv", -870263458, 498866046, 498866047, 498866044, 1849596998, -1788723587, (sp)this);
        CallSite callSite = sp.IIOpi("uuylb", -870263472, 498866032, 498866011, 498866008, 1849596998, -1788723587, (int)sp.IIOpi("qafhunz", -870263462, 498866046, 498865986, 498866042, -38314079, -1347255442)[3]);
        sp.IIOpi("dnmgs", -870263460, 498866046, 498866036, 498866037, -614181867, -1872441840, (sp)this)[sp.IIOpi("neeo", -870263462, 498866046, 498866047, 498866035, -1234914296, 1933313173)[1]] = callSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean N(int n2, NkQ nkQ) {
        CallSite callSite;
        sp.IIOpi("qafhunz", -870263458, 498866046, 498866047, 498866044, 1849596998, -1788723587, (sp)this);
        if (sp.IIOpi("nxbkzsc", -870263471, 498866043, 498866038, 498866039, 1849596998, -1788723587, (IntStream)((Object)sp.IIOpi("qnui", -870263472, 498866043, 498866040, 498866041, 1849596998, -1788723587, (int)sp.IIOpi("qnui", -870263462, 498866046, 498866045, 498866042, -745211612, -1596916356)[0], n2)), n -> (boolean)sp.IIOpi("fwhmo", -870263458, 498865984, 498866031, 498866003, 1849596998, -1788723587, (NYj)sp.IIOpi("sagf", -870263458, 498865995, 498866018, 498865987, 1849596998, -1788723587, (NkQ)nkQ, n))) != false) {
            if (sp.IIOpi("fwhmo", -870263458, 498866032, 498866033, 498866030, 1849596998, -1788723587, (Integer)((Object)sp.IIOpi("uxijg", -870263460, 498866046, 498866036, 498866037, -848010837, -946016111, (sp)this)[sp.IIOpi("qafhunz", -870263462, 498866046, 498866034, 498866035, -1231150520, 1565324068)[3]])) > sp.IIOpi("sagf", -870263462, 498866046, 498866031, 498866028, 408047582, -2045088803)[2]) {
                if (sp.IIOpi("nxbkzsc", -870263458, 498866024, 498866025, 498866022, 1849596998, -1788723587, (kT)((kT)((Object)sp.IIOpi("nxbkzsc", -870263460, 498866046, 498866036, 498866037, 1874665335, -129721492, (sp)this)[sp.IIOpi("fwhmo", -870263462, 498866046, 498866029, 498866035, -1236039872, 1398754445)[0]])), (long)sp.IIOpi("uuylb", -870263462, 498866046, 498866026, 498866027, -1742264562, 544319016)[0]) != false) {
                    callSite = sp.IIOpi("qnui", -870263462, 498866046, 498866045, 498866042, 662801760, 160196316)[1];
                    return (boolean)callSite;
                }
            }
        }
        callSite = sp.IIOpi("ctpv", -870263462, 498866046, 498866045, 498866042, -512907830, 898279537)[2];
        return (boolean)callSite;
    }

    @uF(y=uA.BEFORE_ALL)
    public void N(RV rV) {
        block7: {
            block8: {
                sp.IIOpi("qnui", -870263458, 498866046, 498866047, 498866044, 1849596998, -1788723587, (sp)this);
                NNYH nNYH = (NNYH)sp.IIOpi("neeo", -870263460, 498866007, 498866026, 498866037, 1854930330, -614544904, (NNuU)((NNuU)sp.IIOpi("sagf", -870263460, 498866046, 498866009, 498866037, -539220872, 1109378640, (sp)this)[sp.IIOpi("uxijg", -870263462, 498866046, 498866006, 498866035, 1212008829, 1473877417)[0]]))[sp.IIOpi("uxijg", -870263462, 498866046, 498866006, 498866035, 435101555, -2051819851)[1]];
                if (!(nNYH instanceof NNqv)) {
                    if ((int[])sp.IIOpi("nxbkzsc", -870263460, 498866046, 498866036, 498866037, -1152649505, 1413276957, (sp)this)[sp.IIOpi("yvmv", -870263462, 498866046, 498866006, 498866035, -1579431119, 752472550)[2]] != null) {
                        sp.IIOpi("ctpv", -870263458, 498866046, 498866006, 498866044, 1849596998, -1788723587, (sp)this);
                    }
                    return;
                }
                NNqv nNqv = (NNqv)nNYH;
                if (sp.IIOpi("uxijg", -870263458, 498866005, 498866002, 498866003, 1849596998, -1788723587, (Boolean)((Boolean)((Object)sp.IIOpi("pwwifiox", -870263458, 498866004, 498866017, 498866014, 1849596998, -1788723587, (lT)((lT)((Object)sp.IIOpi("ctpv", -870263460, 498866046, 498866018, 498866037, -1662612112, -351876564, (sp)this)[sp.IIOpi("neeo", -870263462, 498866046, 498866006, 498866035, -1265606789, 205212405)[3]])))))) != false && sp.IIOpi("eeys", -870263458, 498866046, 498866025, 498866000, 1849596998, -1788723587, (sp)this, (NNqv)nNqv) != false) {
                    if ((int[])sp.IIOpi("uxijg", -870263460, 498866046, 498866036, 498866037, 1867439735, -625957082, (sp)this)[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498866006, 498866035, 2058249428, 1070058360)[4]] != null) {
                        sp.IIOpi("ctpv", -870263458, 498866046, 498866006, 498866044, 1849596998, -1788723587, (sp)this);
                    }
                    return;
                }
                nNYH = (NkQ)sp.IIOpi("pwwifiox", -870263458, 498866001, 498865998, 498865999, 1849596998, -1788723587, (NNqv)nNqv);
                sp.IIOpi("uuylb", -870263458, 498866046, 498866025, 498865996, 1849596998, -1788723587, (sp)this, (NkQ)nNYH);
                if (sp.IIOpi("dnmgs", -870263458, 498866005, 498866002, 498866003, 1849596998, -1788723587, (Boolean)((Boolean)((Object)sp.IIOpi("fwhmo", -870263458, 498866004, 498866017, 498866014, 1849596998, -1788723587, (lT)((lT)((Object)sp.IIOpi("uuylb", -870263460, 498866046, 498866018, 498866037, 106832900, -791646589, (sp)this)[sp.IIOpi("yvmv", -870263462, 498866046, 498865997, 498866035, -185911968, 466141320)[0]])))))) == false) break block7;
                if (sp.IIOpi("dnmgs", -870263472, 498865994, 498866025, 498866003, 1849596998, -1788723587) != false) break block8;
                if (sp.IIOpi("neeo", -870263458, 498866046, 498866025, 498865991, 1849596998, -1788723587, (sp)this, (int)sp.IIOpi("uxijg", -870263471, 498865993, 498865990, 498866030, 1849596998, -1788723587, (NTS)sp.IIOpi("eeys", -870263458, 498865995, 498865998, 498865992, 1849596998, -1788723587, (NkQ)nNYH)), (NkQ)nNYH) == false) break block7;
            }
            sp.IIOpi("neeo", -870263458, 498865988, 498865989, 498866044, 1849596998, -1788723587, (NNNwS)((NNNwS)sp.IIOpi("qafhunz", -870263460, 498866007, 498866034, 498866037, 1954308900, 902614635, (NNuU)((NNuU)sp.IIOpi("neeo", -870263460, 498866046, 498866009, 498866037, -1003151954, -2128373047, (sp)this)[sp.IIOpi("uxijg", -870263462, 498866046, 498865997, 498866035, 3366487, -145545835)[1]]))[sp.IIOpi("yvmv", -870263462, 498866046, 498865997, 498866035, 1196002138, -1870997419)[2]]));
            sp.IIOpi("uuylb", -870263458, 498866046, 498866006, 498866044, 1849596998, -1788723587, (sp)this);
            return;
        }
        sp sp2 = this;
        CallSite callSite = sp.IIOpi("nxbkzsc", -870263472, 498866032, 498866011, 498866008, 1849596998, -1788723587, (int)(sp.IIOpi("pwwifiox", -870263458, 498866032, 498866033, 498866030, 1849596998, -1788723587, (Integer)((Object)sp.IIOpi("pwwifiox", -870263460, 498866046, 498866036, 498866037, -1036692523, -1487608933, (sp)sp2)[sp.IIOpi("fwhmo", -870263462, 498866046, 498865997, 498866035, -1412679790, 2122646593)[3]])) + sp.IIOpi("eeys", -870263462, 498866046, 498865986, 498866042, 1568862199, -1724356632)[4]));
        sp.IIOpi("uuylb", -870263460, 498866046, 498866036, 498866037, 1755622405, 2042047443, (sp)sp2)[sp.IIOpi("nxbkzsc", -870263462, 498866046, 498865997, 498866035, -1794812124, 1463618934)[4]] = callSite;
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(n, 9), 16), 10) ^ 0xABAE4716;
    }

    private void N(NkQ nkQ, NYj nYj) {
        sp.IIOpi("uxijg", -870263458, 498865967, 498866025, 498865964, 1849596998, -1788723587, (NNNZZ)((NNNZZ)sp.IIOpi("ctpv", -870263460, 498866007, 498866034, 498866037, -107959870, 193512584, (NNuU)((NNuU)sp.IIOpi("uxijg", -870263460, 498866046, 498866009, 498866037, 766034587, 389377750, (sp)this)[sp.IIOpi("ctpv", -870263462, 498866046, 498866029, 498866035, 925017173, -1500630206)[1]]))[sp.IIOpi("yvmv", -870263462, 498866046, 498866029, 498866035, -249100388, 1464164757)[2]]), (int)sp.IIOpi("dnmgs", -870263460, 498865995, 498866029, 498865971, 1909731240, 1409555538, (NkQ)nkQ), (int)sp.IIOpi("qafhunz", -870263460, 498865984, 498866036, 498865971, 382275675, -154471614, (NYj)nYj), (int)sp.IIOpi("fwhmo", -870263462, 498866046, 498866045, 498866042, -1742739912, 1502435740)[3], (Nkq)sp.IIOpi("eeys", -870263462, 498865968, 498865969, 498865966, 669393617, -967156403), (Nwn)((NNNwS)sp.IIOpi("yvmv", -870263460, 498866007, 498866034, 498866037, 1824327236, 1974580373, (NNuU)((NNuU)sp.IIOpi("qnui", -870263460, 498866046, 498866009, 498866037, 1138316498, -892594326, (sp)this)[sp.IIOpi("qnui", -870263462, 498866046, 498866029, 498866035, -1628203660, -1381961188)[3]]))[sp.IIOpi("dnmgs", -870263462, 498866046, 498866029, 498866035, -24519320, -1923962343)[4]]));
    }

    private static /* synthetic */ long N(long l) {
        return Long.rotateLeft(-Long.rotateRight(l, 32), 32) ^ 0x51862D036B03D5C7L;
    }

    private void R(int n) {
        sp.IIOpi("sagf", -870263458, 498866046, 498866047, 498866044, 1849596998, -1788723587, (sp)this);
        CallSite callSite = sp.IIOpi("qnui", -870263458, 498865973, 498866025, 498865970, 1849596998, -1788723587, (sF)((sF)((Object)sp.IIOpi("yvmv", -870263458, 498865972, 498866017, 498866014, 1849596998, -1788723587, (ld)((ld)((Object)sp.IIOpi("eeys", -870263460, 498866046, 498866018, 498866037, -1719196482, -1432721237, (sp)this)[sp.IIOpi("sagf", -870263462, 498866046, 498866019, 498866035, -1957749829, 1653830406)[0]]))))), n);
        sp.IIOpi("uxijg", -870263460, 498866046, 498866036, 498866037, 1120375359, 60538906, (sp)this)[sp.IIOpi("uuylb", -870263462, 498866046, 498866019, 498866035, -579396789, 1612990106)[1]] = callSite;
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{86, -52, 124, -84, -123, -7, 74, 39, -69, 45, 106, -91, -36, -29, -91, 73};
        int n = 0;
        int n2 = 77;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 35;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite IIOpi(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1njr0jtk[n2 ^ 0x1DBC177E];
        int n8 = n7 >>> 16;
        String string2 = sp.IlIskm(Oltpm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x1DBC177E);
        n7 = l1njr0jtk[n3 ^ 0x1DBC177E];
        int n9 = n7 >>> 16;
        String string3 = sp.IlIskm(Oltpm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x1DBC177E);
        n7 = l1njr0jtk[n4 ^ 0x1DBC177E];
        int n10 = n7 >>> 16;
        String string4 = sp.IlIskm(Oltpm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x1DBC177E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC20D5E8) + -178;
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

    private static /* synthetic */ void OOriOill(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[96];
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
        Oltpm = stringBuilder.toString();
        l1njr0jtk = nArray;
    }

    private static /* synthetic */ CallSite I1knpik(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1njr0jtk[n2 ^ 0x1DBC177E];
        int n9 = n8 >>> 16;
        String string2 = sp.IlIskm(Oltpm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x1DBC177E);
        n8 = l1njr0jtk[n3 ^ 0x1DBC177E];
        int n10 = n8 >>> 16;
        String string3 = sp.IlIskm(Oltpm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x1DBC177E);
        n8 = l1njr0jtk[n4 ^ 0x1DBC177E];
        int n11 = n8 >>> 16;
        String string4 = sp.IlIskm(Oltpm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x1DBC177E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC20D5E8) + -178;
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

    private static /* synthetic */ CallSite IIrniqsIk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1njr0jtk[n2 ^ 0x1DBC177E];
        int n9 = n8 >>> 16;
        String string2 = sp.IlIskm(Oltpm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x1DBC177E);
        n8 = l1njr0jtk[n3 ^ 0x1DBC177E];
        int n10 = n8 >>> 16;
        String string3 = sp.IlIskm(Oltpm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x1DBC177E);
        n8 = l1njr0jtk[n4 ^ 0x1DBC177E];
        int n11 = n8 >>> 16;
        String string4 = sp.IlIskm(Oltpm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x1DBC177E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC20D5E8) + -178;
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

    private static /* synthetic */ String IlIskm(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-105, 113, -32, -123, -81, -64, -74, -124, 100, -85, -104, 84, -47, -55, -80, 7};
        byte[] byArray3 = new byte[]{-126, 74, 0, 66, 49, 41, 43, -86, -71, 61, -55, -50, 115, -55, -42, 80};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite OOprjs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = l1njr0jtk[n2 ^ 0x1DBC177E];
        int n8 = n7 >>> 16;
        String string2 = sp.IlIskm(Oltpm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x1DBC177E);
        n7 = l1njr0jtk[n3 ^ 0x1DBC177E];
        int n9 = n7 >>> 16;
        String string3 = sp.IlIskm(Oltpm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x1DBC177E);
        n7 = l1njr0jtk[n4 ^ 0x1DBC177E];
        int n10 = n7 >>> 16;
        String string4 = sp.IlIskm(Oltpm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x1DBC177E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC20D5E8) + -178;
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

    private static /* synthetic */ void ntfClinit() {
        Oltpm = "\u0010l\u007f\u0013:vi\u001d\u0001 \"\u00b0j\u00c02=Yn\u001du\u00cd(Dy)\u00076\u0085\u0000\u00fei#i;6$\u00f6wi\u001d\u0001 \"\u00b0j\u00c02=Tn\u00a4(D:0\u0003\u0017\u0084\u00b8a\u0010?4\u001d\u008f\u0000\u00e3S\u001fw\u0006\u0014\f\u001a/\u0007.\u0083\u0000\u00c1|?gz\u0002k\u00b5UK1~;\f\u001a\u000e\"\u001e\u0098}\u00e8p~N\u001b\u001fh\u0011(vsa\u0010?4\u001d\u008f\u0000\u00e3v \u0013\fv\u009aK% \u0005-\u0090J'i<$\u00109\u00cdC\u00ccs6/\u0006%m\u001faBml<\t\f\u001a/\u0007.\u0083\u0000\u00c1|?gz\u001e}\u00a4DF\"~J@\"-\t<\u00bd\u001a\u0099.h_i\u001d\u0001 \"\u00b0j\u00c02=Yn\u001du\u00cd\u0001Dy)\u00076\u0085\u0000\u00fei#i;6$\u00f7;n\u0012\u0003\u001c\n\u00a7B\u0082q';|\u001dT\u00e81_\u0004\u0000\u000bw\u008eK\u0096aQ77\u0012+\u00b5F\u00d9u\u00b1D8!\t5\u00abA\u00d9\u0088a\u0010?4\u001d\u008f\u0000\u00c1v,\u007f\u0093\u00b4wa\u0010?4\u001d\u008f\u0000\u00f8P\u00dba\u0010?4\u001d\u008f\u0000\u00e3S v\u00b8a\u0010?4\u001d\u008f\u0000\u00c1I=]+@\"-\t<\u00bd\u001e\u009d%d1[g[4D8\"\u0003C\u0099\u0015a\u0010?4\u001d\u008f\u0000\u00e3v\u0000\u0001sa\u0010?4\u001d\u008f\u0000\u00c1q;l\u001fl*2\u0083Y\u00cc2$t<=0 gW3$\u000bw\u00abA\u00d9N%r00rhYa\u0010?4\u001d\u008f\u0000\u00de[\u00f9\u000fi\u001d\u0001 \"\u00b0j\u00c02=Yn\u001du\u00a6QDy)\u00076\u0085\u0000\u00fei#i;6$\u008bla\u0010?4\u001d\u008f\u0000\u00c1ZjL\u001e\u0015Y\u00bdu`;j\n\u001f\u00d9i\u0084Q\u001aD\u0013+M\u0082J\n:)]\u00ce\f\u001a\u000e\"\u001e\u0098}\u00e8p~N>\u0016$RD $I4\u0083A\u00ca2\u0018n!4x\u00e7J\u007f@\"-\t<\u00bd\u0018\u009e)g_l\u001fl/\u007fl\u007f\t-\u001c\u00a4U\u00ffX</\u001b\buM\u00cbi<$\u00109\u00cdC\u00ccs6/\u0006%m\u00eb\u00feBm(l\u001f\f*\u0013\u00a6i\u00d7O\u0014mz\u001ftq;i\u001d\u0001 \"\u00b0j\u00c02\u001fw;j6V\u0014i<$\u00109\u00cdZ\u00d9t=/3$q\u00a4HL9+I\u0011\u008c[\u00fdo4d<2~\u00b3Y\u001e\u007f\u001f\u00ada\u0010?4\u001d\u008f\u0000\u00e3S\u001fZ\u000fmn\u0012\u0003\u001c\n\u00a7B\u0082S:qn\u00a1z\u00b8a\u0010?4\u001d\u008f\u0000\u00c1yIJ8 +9\u0096L\u00c5B\u0010i\u001d\u0001 \"\u00b0j\u00c02\u001fN$'$\u00abbxD $I4\u0083A\u00ca2\u0013o:=z\u00e2|\u0088\u000fo\u007f\u001f\u0099D $I4\u0083A\u00ca2\u0002t'8q\u00e44D $I-\u0096F\u00c12\"t'4~\u00c1ql815,\u0090J\u00ccp_\f\u001a\u000e\"\u001e\u0098}\u00e8p~N\u0014\u001f$nl\u007f\t\f9\u0094N\u0082q0n2~V=2@1 \u0014c(\f\u0000j<a\u0010?4\u001d\u008f\u0000\u00c9^Xa\u0010?4\u001d\u008f\u0000\u00e3I\u0002\u001e\u0015a\u0010?4\u001d\u008f\u0000\u00e3\\\u001fT\u0005oHcla\u0010?4\u001d\u008f\u0000\u00e3\\\u001bja\u0010?4\u001d\u008f\u0000\u00demdSW1j\u0007(\u0083L\u00c5x~c:<r\u00a8RVy)\u00076\u0085\u001c\u0082O0n1>r\u0092HL:6(\f\u0010\u0014l\u001a\u000e\"\u001e\u0098}\u00e8p~N>\u0000$\u00eef\u00b8i\u001d\u0001 \"\u00b0j\u00c02\u001fk\u0004jS\u00c9\u00d4c,\u0017#5\u00cda\u00f4wj)\u0003Ii<$\u00109\u00cdC\u00ccs6/\u001a3u\u00e6qQm\u00f9K\"\u0013\u00074\u0097JmJ9)\u00039\u008cy\u00ccq$e'l\u007f\u001e/\u00ada\u0010?4\u001d\u008f\u0000\u00c1Z(i\u001d\u0001 \"\u00b0j\u00c02\u001fk\u0004j6V\u0086\u00ae@\"-\t<\u00bd\u001d\u0098)e0n\f\u001a\u000e\"\u001e\u0098}\u00e8p~N\u0001\u0002$:\f\u001a*\u0014?\u00cdN\u00dd|2h0~|\u00ec\u007fH9+\u0015w\u008eN\u00c3zb/\u00070q\u00e7}H\u00031\u000f4\u0091\u0014wa\u0010?4\u001d\u008f\u0000\u00e3S$U\ra\u0010?4\u001d\u008f\u0000\u00c6I\u00f6L3)\u0002\u0007\u00d5\u0018\u0094)\u007f\f\f\t\f\u001fsa\u0010?4\u001d\u008f\u0000\u00e3D;";
        l1njr0jtk = new int[]{54591498, 45613057, 0x30C0003, 21495809, 17629186, 46989338, 21102597, 23003168, 42729481, 0x2420024, 65470465, 60882963, 0x1410001, 7929858, 31326225, 62128136, 72220675, 0x1100001, 20905986, 41943041, 22282241, 0x3320002, 70713354, 20054017, 45678596, 55312420, 8060936, 67305512, 21430273, 0x1310001, 22347786, 25755649, 9961492, 63766538, 0x3700003, 16384009, 33161221, 0x330007, 49676310, 51314689, 0x3310001, 69926924, 19333130, 44498961, 62652428, 72024067, 43384849, 18546700, 55246849, 30343183, 64421904, 0x10F0001, 51380234, 21561355, 66322447, 52035595, 11272203, 57868305, 3801101, 32440331, 43319297, 0x1FF0010, 72417291, 34537491, 7077889, 3276801, 42008577, 16973834, 11993145, 327725, 7864321, 53739522, 25821253, 0x111000A, 42074122, 25100298, 63438853, 52756481, 7143435, 71368714, 41091085, 40239117, 0x2220020, 65536012, 48693263, 52822027, 20119564, 5963793, 53870603, 4653076, 45940752, 0xF0000A, 8585237, 262145, 4, 58982429};
        sp.j();
        sp.m();
        sp.T();
        sp.v();
        sp.b();
        sp.t();
    }
}
