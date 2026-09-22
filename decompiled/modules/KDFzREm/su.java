/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.Ru;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ih;
import KDFzREm.km;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.sB;
import KDFzREm.sR;
import KDFzREm.sZ;
import KDFzREm.si;
import KDFzREm.uF;
import KDFzREm.uY;
import KDFzREm.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="AntiAFK", y=UR.PLAYER, N=Uz.BASE)
public class su
extends UM {
    private static short[] u;
    private static short[] i;
    private static String[] R;
    private static byte[] M;
    public Object[] L;
    private static short[] B;
    private static short[] Z;
    private static short[] z;
    private static boolean[] U;
    private static boolean[] W;
    private static /* synthetic */ String OOIOl0kl;
    private static /* synthetic */ int[] l1I0k;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(n, 12) ^ 0xC395EF00, 27) ^ 0x7B61BBF8, 7), 14), 14);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{118, -58, 80, 124, 30, 38, 104, 7, -45, -43, -59, 102, 70, -84, 84, 64};
        int n = 0;
        int n2 = 253;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 221;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void P() {
        z = new short[]{0, 1, 2, 2, 1, 3};
        Z = new short[]{2, 1};
        B = new short[]{4, 3, 4};
        i = new short[]{5, 5, 6, 0, 0, 4, 0};
        u = new short[]{0, 6, 0, 6, 5, 6, 5};
    }

    private static void T() {
        R = new String[]{"camera-shake", "click", "custom", "ft", "mode"};
    }

    public su() {
        su.Olknj("mvdw", -1631068026, -1926882688, -1926882681, -1926882682, -1631068026, -1631068026, -1631068026, (su)this);
        km km2 = new km();
        su.Olknj("fbfumldu", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("ugauvuql", -1631068030, -1926882688, -1926882655, -1926882675, -1631068030, -1631068030, -1631068030)[0]] = km2;
        si si2 = new si((String)((Object)su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882656, -1926882649, -1631068030, -1631068030, -1631068030)[0]), (boolean)su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882650, -1926882684, -1631068030, -1631068030, -1631068030)[0]);
        su.Olknj("fbfumldu", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("mvdw", -1631068030, -1926882688, -1926882655, -1926882675, -1631068030, -1631068030, -1631068030)[1]] = si2;
        sR sR2 = new sR((String)((Object)su.Olknj("ugauvuql", -1631068030, -1926882688, -1926882656, -1926882649, -1631068030, -1631068030, -1631068030)[1]), (boolean)su.Olknj("trdmyi", -1631068030, -1926882688, -1926882650, -1926882684, -1631068030, -1631068030, -1631068030)[1]);
        su.Olknj("jhjymgec", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("pvejir", -1631068030, -1926882688, -1926882655, -1926882675, -1631068030, -1631068030, -1631068030)[2]] = sR2;
        sB sB2 = new sB(this, (sR)((Object)su.Olknj("fbfumldu", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("ugauvuql", -1631068030, -1926882688, -1926882655, -1926882675, -1631068030, -1631068030, -1631068030)[3]]), (si)((Object)su.Olknj("pvejir", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("mvdw", -1631068030, -1926882688, -1926882655, -1926882675, -1631068030, -1631068030, -1631068030)[4]]), (String)((Object)su.Olknj("mvdw", -1631068030, -1926882688, -1926882656, -1926882649, -1631068030, -1631068030, -1631068030)[2]), (boolean)su.Olknj("oylztyyo", -1631068030, -1926882688, -1926882650, -1926882684, -1631068030, -1631068030, -1631068030)[2]);
        su.Olknj("brdyznkx", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("esozvb", -1631068030, -1926882688, -1926882655, -1926882675, -1631068030, -1631068030, -1631068030)[5]] = sB2;
        sZ sZ2 = new sZ(this, (sR)((Object)su.Olknj("pielugs", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("oylztyyo", -1631068030, -1926882688, -1926882651, -1926882675, -1631068030, -1631068030, -1631068030)[0]]), (si)((Object)su.Olknj("brdyznkx", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("jhjymgec", -1631068030, -1926882688, -1926882651, -1926882675, -1631068030, -1631068030, -1631068030)[1]]), (String)((Object)su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882656, -1926882649, -1631068030, -1631068030, -1631068030)[3]), (boolean)su.Olknj("ebornvw", -1631068030, -1926882688, -1926882650, -1926882684, -1631068030, -1631068030, -1631068030)[3]);
        su.Olknj("ebornvw", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("zebc", -1631068030, -1926882688, -1926882652, -1926882675, -1631068030, -1631068030, -1631068030)[0]] = sZ2;
        lv[] lvArray = new ue[su.Olknj("brdyznkx", -1631068030, -1926882688, -1926882662, -1926882663, -1631068030, -1631068030, -1631068030)[0]];
        lvArray[su.Olknj("zebc", -1631068030, -1926882688, -1926882650, -1926882684, -1631068030, -1631068030, -1631068030)[4]] = (ue)((Object)su.Olknj("yhamciir", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("trdmyi", -1631068030, -1926882688, -1926882652, -1926882675, -1631068030, -1631068030, -1631068030)[1]]);
        lvArray[su.Olknj("yhamciir", -1631068030, -1926882688, -1926882683, -1926882684, -1631068030, -1631068030, -1631068030)[0]] = (ue)((Object)su.Olknj("frtcrym", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("pielugs", -1631068030, -1926882688, -1926882652, -1926882675, -1631068030, -1631068030, -1631068030)[2]]);
        CallSite callSite = su.Olknj("fbfumldu", -1631068024, -1926882645, -1926882686, -1926882646, -1631068024, -1631068024, -1631068024, (lY)this, (String)((Object)su.Olknj("trdmyi", -1631068030, -1926882688, -1926882656, -1926882649, -1631068030, -1631068030, -1631068030)[4]), (lv[])lvArray);
        su.Olknj("ywtagx", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882674, -1926882675, -1631068030, -1631068030, -1631068030)[0]] = callSite;
        su.Olknj("yhamciir", -1631068023, -1926882648, -1926882641, -1926882642, -1631068023, -1631068023, -1631068023, (List)((Object)su.Olknj("ywtagx", -1631068026, -1926882660, -1926882680, -1926882647, -1631068026, -1631068026, -1631068026, (ld)((ld)((Object)su.Olknj("oylztyyo", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this)[su.Olknj("oylztyyo", -1631068030, -1926882688, -1926882674, -1926882675, -1631068030, -1631068030, -1631068030)[1]])))), ue2 -> {
            if (ue2 instanceof uY) {
                uY uY2 = (uY)((Object)ue2);
                su.Olknj("jhjymgec", -1631068023, -1926882685, -1926882686, -1926882687, -1631068023, -1631068023, -1631068023, (uY)uY2, (Object)this);
            }
        });
    }

    static {
        su.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-64, 58, -2, -64, 38, -89, 20, 126, -3, -71, 0, -110, -11, -111, -7, -46};
        int n = 0;
        int n2 = 151;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 225;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (su.Olknj("zebc", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this) == null) {
            su.Olknj("mvdw", -1631068027, -1926882688, -1926882680, -1926882673, -1631068027, -1631068027, -1631068027, (su)this, (Object[])new Object[su.Olknj("mvdw", -1631068030, -1926882688, -1926882662, -1926882663, -1631068030, -1631068030, -1631068030)[2]]);
            CallSite callSite = su.Olknj("esozvb", -1631068028, -1926882688, -1926882680, -1926882673, -1631068028, -1631068028, -1631068028, (su)this);
            callSite[su.Olknj("mvdw", -1631068030, -1926882688, -1926882662, -1926882663, -1631068030, -1631068030, -1631068030)[3]] = su.Olknj("ugauvuql", -1631068024, -1926882677, -1926882678, -1926882679, -1631068024, -1631068024, -1631068024, (boolean)su.Olknj("esozvb", -1631068030, -1926882688, -1926882683, -1926882684, -1631068030, -1631068030, -1631068030)[3]);
        }
    }

    private static void s() {
        M = new byte[]{2, 30, 7, 6};
    }

    private static void m() {
        U = new boolean[]{true, true, true, false, false};
        W = new boolean[]{true, false, true, false};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-110, 5, 28, -27, -119, 112, -87, 84, -12, -122, -97, -63, 75, -69, -81, -93};
        int n = 0;
        int n2 = 146;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 45;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(n ^ 0x10902AF2, 8), 12), 10);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-49, 35, -26, -13, -110, 3, 121, -74, 92, 120, 64, -113, -56, -30, -48, -80};
        int n = 0;
        int n2 = 21;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 147;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 24), 2), 29) ^ 0x5453AFAD, 21) ^ 0x2FF5D029) + 1 ^ 0x66049498;
    }

    @uF
    public void N(ih ih2) {
        su.Olknj("mvdw", -1631068026, -1926882688, -1926882681, -1926882682, -482966989, -1482173328, -794416377, (su)this);
        if (su.Olknj("pvejir", -1631068026, -1926882677, -1926882659, -1926882671, -482966989, -1482173328, -794416377, (Boolean)((Boolean)((Object)su.Olknj("yhamciir", -1631068028, -1926882688, -1926882680, -1926882673, 954022805, -545515638, -1450441189, (su)this)[su.Olknj("mvdw", -1631068030, -1926882688, -1926882668, -1926882675, 855726919, 566221127, 516734354)[5]]))) != false) {
            su.Olknj("pielugs", -1631068026, -1926882654, -1926882676, -1926882687, -482966989, -1482173328, -794416377, (ue)((ue)((Object)su.Olknj("mvdw", -1631068026, -1926882660, -1926882674, -1926882653, -482966989, -1482173328, -794416377, (ld)((ld)((Object)su.Olknj("ugauvuql", -1631068028, -1926882688, -1926882680, -1926882673, 369334268, -1825447764, 248120748, (su)this)[su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882668, -1926882675, -1934178784, -960539017, 300810527)[6]]))))), (Object)ih2);
        }
    }

    @uF
    public void N(Ru ru) {
        block7: {
            block6: {
                su.Olknj("uhevzkm", -1631068026, -1926882688, -1926882681, -1926882682, -482966989, -1482173328, -794416377, (su)this);
                CallSite callSite = su.Olknj("esozvb", -1631068024, -1926882677, -1926882678, -1926882679, -482966989, -1482173328, -794416377, (boolean)su.Olknj("yhamciir", -1631068030, -1926882688, -1926882683, -1926882684, -159781098, -916907112, 1740883833)[1]);
                su.Olknj("esozvb", -1631068028, -1926882688, -1926882680, -1926882673, 1261647692, -820444686, -1556970219, (su)this)[su.Olknj("brdyznkx", -1631068030, -1926882688, -1926882674, -1926882675, -1369222909, 2055151876, 231931020)[2]] = callSite;
                if (su.Olknj("ugauvuql", -1631068026, -1926882669, -1926882670, -1926882671, -482966989, -1482173328, -794416377, (NNuU)((NNuU)su.Olknj("jhjymgec", -1631068028, -1926882688, -1926882676, -1926882673, 914346369, -1133705482, 935485698, (su)this)[su.Olknj("yhamciir", -1631068030, -1926882688, -1926882674, -1926882675, 1304897669, 644840877, 844198963)[3]])) != false) {
                    return;
                }
                if (su.Olknj("ebornvw", -1631068026, -1926882665, -1926882666, -1926882671, -482966989, -1482173328, -794416377, (NNNwS)((NNNwS)su.Olknj("uhevzkm", -1631068028, -1926882669, -1926882672, -1926882673, 1246543539, 2062218971, -590035142, (NNuU)((NNuU)su.Olknj("uhevzkm", -1631068028, -1926882688, -1926882676, -1926882673, -1463342986, -1902143218, 294489007, (su)this)[su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882674, -1926882675, -229814781, 1932816228, 51365005)[4]]))[su.Olknj("fbfumldu", -1631068030, -1926882688, -1926882674, -1926882675, -1257481450, 846687528, -1017787974)[5]])) != false) break block6;
                if (su.Olknj("jhjymgec", -1631068024, -1926882667, -1926882668, -1926882671, -482966989, -1482173328, -794416377) == false) break block7;
            }
            su.Olknj("zebc", -1631068026, -1926882661, -1926882676, -1926882682, -482966989, -1482173328, -794416377, (km)((km)((Object)su.Olknj("yhamciir", -1631068028, -1926882688, -1926882680, -1926882673, -699827520, -1718940405, 1079300859, (su)this)[su.Olknj("yhamciir", -1631068030, -1926882688, -1926882674, -1926882675, 838284883, -1552340941, 125718194)[6]])));
            return;
        }
        if (su.Olknj("pvejir", -1631068026, -1926882661, -1926882686, -1926882658, -482966989, -1482173328, -794416377, (km)((km)((Object)su.Olknj("oylztyyo", -1631068028, -1926882688, -1926882680, -1926882673, 2095554750, -681482932, 846959770, (su)this)[su.Olknj("esozvb", -1631068030, -1926882688, -1926882668, -1926882675, 558303218, -1875793210, 1507123668)[0]])), (int)su.Olknj("ugauvuql", -1631068024, -1926882664, -1926882668, -1926882657, -482966989, -1482173328, -794416377, (int)su.Olknj("yhamciir", -1631068030, -1926882688, -1926882662, -1926882663, 1458580886, 332689317, -1866654750)[1])) != false) {
            CallSite callSite = su.Olknj("ugauvuql", -1631068024, -1926882677, -1926882678, -1926882679, -482966989, -1482173328, -794416377, (boolean)su.Olknj("oylztyyo", -1631068030, -1926882688, -1926882683, -1926882684, -393406089, 942203112, 872939011)[2]);
            su.Olknj("oylztyyo", -1631068028, -1926882688, -1926882680, -1926882673, 1139042801, -952719212, 2110140195, (su)this)[su.Olknj("uhevzkm", -1631068030, -1926882688, -1926882668, -1926882675, 896077054, -1392222964, -1458682886)[1]] = callSite;
            su.Olknj("oylztyyo", -1631068026, -1926882661, -1926882676, -1926882682, -482966989, -1482173328, -794416377, (km)((km)((Object)su.Olknj("mvdw", -1631068028, -1926882688, -1926882680, -1926882673, 1551723957, -959408350, 1966712023, (su)this)[su.Olknj("jhjymgec", -1631068030, -1926882688, -1926882668, -1926882675, 1444532245, 1160549578, 2051645380)[2]])));
        }
        if (su.Olknj("ebornvw", -1631068026, -1926882677, -1926882659, -1926882671, -482966989, -1482173328, -794416377, (Boolean)((Boolean)((Object)su.Olknj("jhjymgec", -1631068028, -1926882688, -1926882680, -1926882673, -794707838, -982189456, -876657582, (su)this)[su.Olknj("pvejir", -1631068030, -1926882688, -1926882668, -1926882675, -808764182, -1377804237, 961270486)[3]]))) != false) {
            su.Olknj("brdyznkx", -1631068026, -1926882654, -1926882676, -1926882687, -482966989, -1482173328, -794416377, (ue)((ue)((Object)su.Olknj("zebc", -1631068026, -1926882660, -1926882674, -1926882653, -482966989, -1482173328, -794416377, (ld)((ld)((Object)su.Olknj("mvdw", -1631068028, -1926882688, -1926882680, -1926882673, 711011407, 1332176406, 1629299880, (su)this)[su.Olknj("pvejir", -1631068030, -1926882688, -1926882668, -1926882675, 741086328, -558345192, -405571371)[4]]))))), (Object)ru);
        }
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(Integer.rotateRight(n, 25), 28) ^ 0x40E79175) + 1, 27), 10);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{89, 98, -94, -10, -113, -70, 51, -5, 57, -9, -51, -108, -3, -12, 127, -51};
        int n = 0;
        int n2 = 230;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 183;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        OOIOl0kl = "B'OOC\u009e8/ /\u00f4p\u008b\u00af\u00cd)\u001e5n\u00a3Q\u009a\u00c4\u00e6KJE_p\u00ad4/&.:alIG\u00897V47\u00e8y\u0012G*l\u00cf\u00aaBHad\u0092\u000bE8t\u00f1E\u009f\u00af\u00ceu\u00f4o,IC\u0086>/\u0006/\u00efu\u00ca\u0084\u009fO\u00ceEGcX\u00ba\u001cmz7\u00eb'\u008d\u00af\u00efP\u00c4tQ`O\u00c75dn\u00caJE_p\u00ad4/\"\u0002\u00a7BiDT\u0089vu!2\u00f13\u00c2\u0096\u00ca\u00e3\u00fbglK\r\u00ab6n&.\u00f0y\u00d6\u00d8\u008d\u00d6\u00e9ouD\r\u00848n2t\u00dfs\u00cb\u008f\u00c1u\u00ed\u00bf'OOC\u009e8/9:\u00f3{\u008b\u00ac\u00c6j\u00f2mw\u001er\\aq`C\u008b1\u0087'UBT*iH\u0089/az7\u00fcr\u00c3\u00cc\u00e65\u0005bfDL\u00d3XBiDT\u0089vl45\u00fa3\u00f7\u0097\u00d6\u00d0mi8\u00dcJE_p\u00ad4/\u001b\u0015\u00e8IT1L\u00a7G*\u007f\\\u00dbTJE_p\u00ad4/ >RaaBiDT\u0089vl45\u00fa3\u00eb\u0081\u00ce\u00e5Yz8\u00dcJE_p\u00ad4/ \u0002\u00c8JE_p\u00ad4/90HJE_p\u00ad4/\u001b\u0015\u00d3k\u00f7\u00c8JE_p\u00ad4/>6\u00bcouD\r\u009d-i9t\u00d1u\u00d7\u0097\u00f1'Y@JE_p\u00ad4/9?k\u0003]\u00farT\u00f4ooPG\u00a7?\u00d6\u009dJE_p\u00ad4/>\u000b\u00f1BiDT\u0089vl45\u00fa3\u00eb\u0081\u00ce\u008c\u00baz8\ft";
        l1I0k = new int[]{19070986, 0x140001, 25231381, 1572874, 0x10F0001, 0xC30003, 24510465, 23920642, 9830417, 24051719, 12976150, 0x150001, 0x1100013, 0x170001, 23724034, 0xBB0001, 15663116, 0x120001, 22806531, 16449537, 20381709, 0x160001, 7077898, 0x1020001, 21233674, 3276801, 16515074, 24576010, 3014660, 16646148, 0x22000C, 23003146, 10944532, 17039370, 0x130001, 0x10E0001, 14417939, 23855105, 0x1030001, 23658497, 19726346, 0x330039, 18, 21889038, 12320775, 7733280};
        su.P();
        su.s();
        su.m();
        su.T();
    }

    private static /* synthetic */ CallSite Olknj(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1I0k[n2 ^ 0x8D261A83];
        int n9 = n8 >>> 16;
        String string2 = su.lIqIksIi(OOIOl0kl.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x8D261A83);
        n8 = l1I0k[n3 ^ 0x8D261A83];
        int n10 = n8 >>> 16;
        String string3 = su.lIqIksIi(OOIOl0kl.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x8D261A83);
        n8 = l1I0k[n4 ^ 0x8D261A83];
        int n11 = n8 >>> 16;
        String string4 = su.lIqIksIi(OOIOl0kl.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x8D261A83);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9EC7E030) + -178;
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

    private static /* synthetic */ void Olirkt(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[46];
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
        OOIOl0kl = stringBuilder.toString();
        l1I0k = nArray;
    }

    private static /* synthetic */ CallSite oopOrlOpq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = l1I0k[n2 ^ 0x8D261A83];
        int n9 = n8 >>> 16;
        String string2 = su.lIqIksIi(OOIOl0kl.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x8D261A83);
        n8 = l1I0k[n3 ^ 0x8D261A83];
        int n10 = n8 >>> 16;
        String string3 = su.lIqIksIi(OOIOl0kl.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x8D261A83);
        n8 = l1I0k[n4 ^ 0x8D261A83];
        int n11 = n8 >>> 16;
        String string4 = su.lIqIksIi(OOIOl0kl.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x8D261A83);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x9EC7E030) + -178;
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

    private static /* synthetic */ String lIqIksIi(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{8, -119, -118, 50, 33, 98, -121, -97, -34, 80, 23, 11, 3, -47, -89, -117};
        byte[] byArray3 = new byte[]{51, 109, -123, -41, -72, -79, 114, -56, 57, -34, 44, 51, 50, 72, 70, 102};
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
