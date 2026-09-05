/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.Id
 *  KDFzREm.NAC
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NSd
 *  KDFzREm.NSl
 */
package KDFzREm;

import KDFzREm.Id;
import KDFzREm.NAC;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NSd;
import KDFzREm.NSl;
import KDFzREm.RP;
import KDFzREm.Rs;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="NoServerRotation", y=UR.PLAYER, N=Uz.BASE)
public class sy
extends UM {
    private static short[] u;
    private static float[] i;
    private static short[] R;
    private static short[] M;
    private static boolean[] B;
    public Object[] L;
    private static short[] Z;
    private static byte[] z;
    private static /* synthetic */ String Ilppljt;
    private static /* synthetic */ int[] I1stli;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft((Integer.rotateLeft(n ^ 0x76C49FDC, 30) ^ 0xB049A1F) + 1, 30);
    }

    private static void P() {
        z = new byte[]{2};
    }

    private void T() {
        if (sy.Oljsn("rfkol", 56304095, -1373143222, -1373143221, -1373143224, 56304095, 56304095, 56304095, (sy)this) == null) {
            sy.Oljsn("wplwo", 56304094, -1373143222, -1373143221, -1373143224, 56304094, 56304094, 56304094, (sy)this, (Object[])new Object[sy.Oljsn("uwvo", 56304089, -1373143222, -1373143223, -1373143218, 56304089, 56304089, 56304089)[0]]);
            CallSite callSite = sy.Oljsn("rgsnl", 56304095, -1373143222, -1373143221, -1373143224, 56304095, 56304095, 56304095, (sy)this);
            callSite[sy.Oljsn("ykudbcb", 56304089, -1373143222, -1373143217, -1373143220, 56304089, 56304089, 56304089)[2]] = sy.Oljsn("jxzjkfjc", 56304083, -1373143229, -1373143232, -1373143231, 56304083, 56304083, 56304083, (float)sy.Oljsn("rezxjqhj", 56304089, -1373143222, -1373143219, -1373143230, 56304089, 56304089, 56304089)[0]);
            callSite[sy.Oljsn("jxzjkfjc", 56304089, -1373143222, -1373143217, -1373143220, 56304089, 56304089, 56304089)[3]] = sy.Oljsn("uwvo", 56304083, -1373143229, -1373143232, -1373143231, 56304083, 56304083, 56304083, (float)sy.Oljsn("vmqghr", 56304089, -1373143222, -1373143219, -1373143230, 56304089, 56304089, 56304089)[1]);
        }
    }

    public sy() {
        sy.Oljsn("ccracq", 56304093, -1373143222, -1373143226, -1373143225, 56304093, 56304093, 56304093, (sy)this);
    }

    static {
        sy.ntfClinit();
    }

    private static void s() {
        i = new float[]{0.0f, 0.0f};
    }

    private static void m() {
        R = new short[]{0, 4, 0, 1, 0, 0, 4};
        M = new short[]{0, 4, 0};
        u = new short[]{4, 1, 0, 4, 0, 4, 2, 0};
        Z = new short[]{4, 0, 0, 4, 1, 0, 4};
    }

    private static void j() {
        B = new boolean[]{true, false, false, true};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateRight(n ^ 0x4B78FB5F, 26), 31), 25);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(-n ^ 0x230BCFF6, 19), 10), 12) ^ 0xE2E5DC74, 20);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight((Integer.rotateRight(n ^ 0x2AF35D71, 26) ^ 0xE2A92223) + 1, 1);
    }

    @uF
    public void N(Rs rs) {
        sy.Oljsn("ykudbcb", 56304093, -1373143222, -1373143226, -1373143225, -177747731, -39072818, -1997621906, (sy)this);
        NNNwS nNNwS = (NNNwS)sy.Oljsn("ykudbcb", 56304095, -1373143205, -1373143226, -1373143224, -732962193, 1036483541, -1008780262, (NNuU)((NNuU)sy.Oljsn("rerzkxxi", 56304095, -1373143222, -1373143228, -1373143224, -347886037, -594655536, -1268842889, (sy)this)[sy.Oljsn("jxzjkfjc", 56304089, -1373143222, -1373143227, -1373143206, 652898849, -1866835004, 1284472231)[0]]))[sy.Oljsn("rezxjqhj", 56304089, -1373143222, -1373143227, -1373143206, -180373240, 1984470904, -1191544310)[1]];
        if (nNNwS == null || sy.Oljsn("wplwo", 56304093, -1373143222, -1373143189, -1373143191, -177747731, -39072818, -1997621906, (sy)this, (NAC)sy.Oljsn("rgsnl", 56304093, -1373143188, -1373143207, -1373143192, -177747731, -39072818, -1997621906, (Rs)rs)) == false) {
            return;
        }
        CallSite callSite = sy.Oljsn("rfkol", 56304083, -1373143229, -1373143232, -1373143231, -177747731, -39072818, -1997621906, (float)sy.Oljsn("tyrkza", 56304093, -1373143202, -1373143201, -1373143204, -177747731, -39072818, -1997621906, (NNNwS)nNNwS));
        sy.Oljsn("rfkol", 56304095, -1373143222, -1373143221, -1373143224, 2003569846, 1613087021, -2003185413, (sy)this)[sy.Oljsn("ccracq", 56304089, -1373143222, -1373143227, -1373143206, 2068468873, -304293333, -1785690613)[2]] = callSite;
        CallSite callSite2 = sy.Oljsn("uwvo", 56304083, -1373143229, -1373143232, -1373143231, -177747731, -39072818, -1997621906, (float)sy.Oljsn("rezxjqhj", 56304093, -1373143202, -1373143203, -1373143204, -177747731, -39072818, -1997621906, (NNNwS)nNNwS));
        sy.Oljsn("wplwo", 56304095, -1373143222, -1373143221, -1373143224, 750946625, -83226676, 1586903046, (sy)this)[sy.Oljsn("ccracq", 56304089, -1373143222, -1373143227, -1373143206, 1459290633, 1635030561, -919444300)[3]] = callSite2;
    }

    @uF
    public void N(RP rP) {
        if (sy.Oljsn("rgsnl", 56304093, -1373143222, -1373143189, -1373143191, -177747731, -39072818, -1997621906, (sy)this, (NAC)sy.Oljsn("rfkol", 56304093, -1373143190, -1373143189, -1373143192, -177747731, -39072818, -1997621906, (RP)rP)) == false) {
            return;
        }
        sy.Oljsn("wplwo", 56304093, -1373143205, -1373143186, -1373143185, -177747731, -39072818, -1997621906, (NNuU)((NNuU)sy.Oljsn("wplwo", 56304095, -1373143222, -1373143228, -1373143224, 28700382, -677754780, -51319503, (sy)this)[sy.Oljsn("jxzjkfjc", 56304089, -1373143222, -1373143227, -1373143206, 1581138729, 1364436800, -1002549120)[4]]), () -> {
            sy.Oljsn("uwvo", 56304093, -1373143222, -1373143226, -1373143225, -177747731, -39072818, -1997621906, (sy)this);
            if ((NNNwS)sy.Oljsn("uwvo", 56304095, -1373143205, -1373143226, -1373143224, -1568769979, 772859244, 855203735, (NNuU)((NNuU)sy.Oljsn("uwvo", 56304095, -1373143222, -1373143228, -1373143224, -1553553157, 1147790947, -231136626, (sy)this)[sy.Oljsn("wplwo", 56304089, -1373143222, -1373143227, -1373143206, 901753662, -1182473164, 57194431)[5]]))[sy.Oljsn("uwvo", 56304089, -1373143222, -1373143227, -1373143206, -1102286133, 1986953528, 1130059440)[6]] == null) {
                return;
            }
            CallSite callSite = sy.Oljsn("rfkol", 56304083, -1373143229, -1373143232, -1373143231, -177747731, -39072818, -1997621906, (float)sy.Oljsn("jxzjkfjc", 56304093, -1373143202, -1373143201, -1373143204, -177747731, -39072818, -1997621906, (NNNwS)((NNNwS)sy.Oljsn("jxzjkfjc", 56304095, -1373143205, -1373143226, -1373143224, 1647021496, 1989448201, -931160103, (NNuU)((NNuU)sy.Oljsn("ykudbcb", 56304095, -1373143222, -1373143228, -1373143224, 859839532, -666014789, -825766082, (sy)this)[sy.Oljsn("vmqghr", 56304089, -1373143222, -1373143208, -1373143206, -266585780, -707876698, 750111612)[2]]))[sy.Oljsn("rerzkxxi", 56304089, -1373143222, -1373143207, -1373143206, 1639430642, 871729684, 1467532488)[0]])));
            sy.Oljsn("jxzjkfjc", 56304095, -1373143202, -1373143227, -1373143224, -1336135983, 2121751305, -1268066779, (NNNwS)((NNNwS)sy.Oljsn("jxzjkfjc", 56304095, -1373143205, -1373143226, -1373143224, 1186811929, -903913568, 1239510537, (NNuU)((NNuU)sy.Oljsn("rerzkxxi", 56304095, -1373143222, -1373143228, -1373143224, 752347948, -577296183, -142298601, (sy)this)[sy.Oljsn("ykudbcb", 56304089, -1373143222, -1373143208, -1373143206, -1608413604, -1951097546, 998861155)[0]]))[sy.Oljsn("rezxjqhj", 56304089, -1373143222, -1373143208, -1373143206, -1577368476, -183402602, 908616687)[1]]))[sy.Oljsn("rerzkxxi", 56304089, -1373143222, -1373143207, -1373143206, 1027011237, 1471464706, -495925371)[1]] = callSite;
            CallSite callSite2 = sy.Oljsn("rezxjqhj", 56304083, -1373143229, -1373143232, -1373143231, -177747731, -39072818, -1997621906, (float)sy.Oljsn("rfkol", 56304093, -1373143202, -1373143203, -1373143204, -177747731, -39072818, -1997621906, (NNNwS)((NNNwS)sy.Oljsn("rerzkxxi", 56304095, -1373143205, -1373143226, -1373143224, -1965860179, 1483736083, -1658303967, (NNuU)((NNuU)sy.Oljsn("vmqghr", 56304095, -1373143222, -1373143228, -1373143224, -1734334333, -872919056, -1801664767, (sy)this)[sy.Oljsn("rfkol", 56304089, -1373143222, -1373143207, -1373143206, -271485059, -1658427839, 1322621949)[4]]))[sy.Oljsn("wplwo", 56304089, -1373143222, -1373143207, -1373143206, 965908702, 47100374, -575813248)[5]])));
            sy.Oljsn("ykudbcb", 56304095, -1373143202, -1373143227, -1373143224, -526998611, -1083826638, -115160173, (NNNwS)((NNNwS)sy.Oljsn("tyrkza", 56304095, -1373143205, -1373143226, -1373143224, 1800819420, -1626982270, -1838465478, (NNuU)((NNuU)sy.Oljsn("ykudbcb", 56304095, -1373143222, -1373143228, -1373143224, 508597874, -1174258040, -1026667734, (sy)this)[sy.Oljsn("ccracq", 56304089, -1373143222, -1373143207, -1373143206, -1204378504, 416101286, 652153072)[2]]))[sy.Oljsn("uwvo", 56304089, -1373143222, -1373143207, -1373143206, 786977980, 433129186, 1946875686)[3]]))[sy.Oljsn("ykudbcb", 56304089, -1373143222, -1373143207, -1373143206, -1321122707, 1708569684, -1436888367)[6]] = callSite2;
            sy.Oljsn("ccracq", 56304093, -1373143202, -1373143210, -1373143209, -177747731, -39072818, -1997621906, (NNNwS)((NNNwS)sy.Oljsn("wplwo", 56304095, -1373143205, -1373143226, -1373143224, 1677545122, -1394277290, 1378293688, (NNuU)((NNuU)sy.Oljsn("tyrkza", 56304095, -1373143222, -1373143228, -1373143224, -1013440082, 1125115724, -1315281049, (sy)this)[sy.Oljsn("jxzjkfjc", 56304089, -1373143222, -1373143207, -1373143206, 840298168, -1039475823, 903439357)[7]]))[sy.Oljsn("rgsnl", 56304089, -1373143222, -1373143214, -1373143206, 1513404934, 1355852083, -430668524)[0]]), (float)sy.Oljsn("ccracq", 56304083, -1373143216, -1373143227, -1373143215, -177747731, -39072818, -1997621906, (float)sy.Oljsn("vmqghr", 56304093, -1373143229, -1373143213, -1373143204, -177747731, -39072818, -1997621906, (Float)((Float)((Object)sy.Oljsn("jxzjkfjc", 56304095, -1373143222, -1373143221, -1373143224, -1961980937, 1456841221, -134006282, (sy)this)[sy.Oljsn("vmqghr", 56304089, -1373143222, -1373143214, -1373143206, 1565551155, -175674095, 373363969)[1]])))));
            sy.Oljsn("ykudbcb", 56304093, -1373143202, -1373143212, -1373143209, -177747731, -39072818, -1997621906, (NNNwS)((NNNwS)sy.Oljsn("tyrkza", 56304095, -1373143205, -1373143226, -1373143224, 479205990, -764026218, -793312628, (NNuU)((NNuU)sy.Oljsn("vmqghr", 56304095, -1373143222, -1373143228, -1373143224, 1776484427, 85075916, -1176432731, (sy)this)[sy.Oljsn("ykudbcb", 56304089, -1373143222, -1373143214, -1373143206, -1482445583, -1964818607, 2078501521)[2]]))[sy.Oljsn("rezxjqhj", 56304089, -1373143222, -1373143214, -1373143206, 475659320, 1331329403, 882610380)[3]]), (float)sy.Oljsn("ccracq", 56304093, -1373143229, -1373143213, -1373143204, -177747731, -39072818, -1997621906, (Float)((Float)((Object)sy.Oljsn("rfkol", 56304095, -1373143222, -1373143221, -1373143224, 1293281695, 1751155717, 2002567434, (sy)this)[sy.Oljsn("rfkol", 56304089, -1373143222, -1373143214, -1373143206, -1768945732, 1582051665, -567103644)[4]]))));
            sy.Oljsn("uwvo", 56304093, -1373143202, -1373143211, -1373143225, -177747731, -39072818, -1997621906, (NNNwS)((NNNwS)sy.Oljsn("rerzkxxi", 56304095, -1373143205, -1373143226, -1373143224, 2121642243, -839220900, 694311245, (NNuU)((NNuU)sy.Oljsn("rfkol", 56304095, -1373143222, -1373143228, -1373143224, 1368514692, -710383626, -1870916703, (sy)this)[sy.Oljsn("ykudbcb", 56304089, -1373143222, -1373143214, -1373143206, -146794496, 329723165, -713348817)[5]]))[sy.Oljsn("ccracq", 56304089, -1373143222, -1373143214, -1373143206, 103374125, -1302340448, 1788231030)[6]]));
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean N(NAC<?> nAC) {
        CallSite callSite;
        if (!(nAC instanceof NSd || nAC instanceof Id || nAC instanceof NSl)) {
            callSite = sy.Oljsn("rgsnl", 56304089, -1373143222, -1373143217, -1373143220, 425564086, -439371486, 968228210)[1];
            return (boolean)callSite;
        }
        callSite = sy.Oljsn("jxzjkfjc", 56304089, -1373143222, -1373143217, -1373143220, 561834987, -511777739, -1439954213)[0];
        return (boolean)callSite;
    }

    private static /* synthetic */ void ntfClinit() {
        Ilppljt = "\u00cb\u0080FJ\u00d0\u0019\u0006\u00dc\u00fb\u00b5\u0007\u00bb\u0010\u00b1\u0082M\u0088Kt\u00c4&9\u00b6\u00d8\u00d4<\u00af#;\u009c\u0090\u0091\u0080FJ\u00d0\u0019\u0006\u00dc\u00fb\u00b5<\u00993\u00b0\n\u00a5vQ\u00ad0\n\u009d\u00d2\u00d44\u0082\u000fa\u00c1\u0081\u0086\u00e5\u0086\u00a1tX\u00ed84\u00c0\u0083\u00cfG\u00d9\u0087\u00a5lE\u00e7\u0013\r(\u00edV\u00bf\u00bceS\u00f7(\u000e\u00cc\u001fV\u001d\u0088jQ\u00f4=D\u009f\u00d4\u0095\u0015\u00c12u\u00dbnT\u00a6lU\u00b9u=\u00de\u0080FJ\u00d0\u0019\u0006\u00dc\u00c6\u0082\u000f\u0080FJ\u00d0\u0019\u0006\u00dc\u00e7\u0088\u00b0\u0082)v]\u00ce\u0092\u0012\u0006\u00a8oQ\u00f6\n\n\u009f\u00c0\u009e8\u00edL{\u00c6\u001a\u0011\u00a1\u00f0\u0096]\u00a0!C\u008el\u00edF\u00ba\u0080FJ\u00d0\u0019\u0006\u00dc\u00fb\u00b5%\u00abK\u0088jQ\u00f4=D\u009f\u00d4\u0095\u0015\u00c1/b\u00df\u00afs\u00b0;\u00da\u00a1tX\u00ed84\u00c5\u0086\u00cdC\u00da\u00de\u0080FJ\u00d0\u0019\u0006\u00dc\u00e7\u00abX\u00a1tX\u00ed84\u00c0\u0083\u00cfG\u00da\u001f\u009eo\u00a1tX\u00ed84\u00c0\u0083\u00cfG\u00d8\u00ce\u0097\u0016\u00a1tX\u00ed84\u00c0\u0083\u00cfG\u00db\u00b0\u0082)|\u00e8=\u001d\u0092\u009a\u0097\u0013\u0080\u0007/\u00f3G\u00f7\u00a5t\u000bw(\u0082)f";
        I1stli = new int[]{7733258, 6029313, 12189715, 6094849, 3932162, 0x11F0001, 15663106, 0x910001, 851970, 2949135, 4915207, 17498132, 6160385, 5373955, 0x900001, 4063233, 16580610, 12, 9306113, 786433, 2031629, 14876684, 11206659, 0xFF000C, 2883585, 9568266, 11403276, 9043972, 15794188, 18874372, 4128780, 0xCD000C, 14221322, 9371649, 10223631, 983056, 0x550007, 6225943, 0x80000A};
        sy.m();
        sy.P();
        sy.j();
        sy.s();
    }

    private static /* synthetic */ void IIlsj(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[39];
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
        Ilppljt = stringBuilder.toString();
        I1stli = nArray;
    }

    private static /* synthetic */ String OOpppmn(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{118, -121, 19, -100, -10, -99, 13, 116, 67, 102, -18, -29, 22, 50, -63, -84};
        byte[] byArray3 = new byte[]{-99, -57, 68, 26, 107, -23, -55, -58, -12, 122, 71, 67, -12, 32, 81, 40};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite Oljsn(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = I1stli[n2 ^ 0xAE277F4A];
        int n9 = n8 >>> 16;
        String string2 = sy.OOpppmn(Ilppljt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xAE277F4A);
        n8 = I1stli[n3 ^ 0xAE277F4A];
        int n10 = n8 >>> 16;
        String string3 = sy.OOpppmn(Ilppljt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xAE277F4A);
        n8 = I1stli[n4 ^ 0xAE277F4A];
        int n11 = n8 >>> 16;
        String string4 = sy.OOpppmn(Ilppljt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xAE277F4A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x35B216B) + -178;
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

    private static /* synthetic */ CallSite lIn0kiI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = I1stli[n2 ^ 0xAE277F4A];
        int n9 = n8 >>> 16;
        String string2 = sy.OOpppmn(Ilppljt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xAE277F4A);
        n8 = I1stli[n3 ^ 0xAE277F4A];
        int n10 = n8 >>> 16;
        String string3 = sy.OOpppmn(Ilppljt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xAE277F4A);
        n8 = I1stli[n4 ^ 0xAE277F4A];
        int n11 = n8 >>> 16;
        String string4 = sy.OOpppmn(Ilppljt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xAE277F4A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x35B216B) + -178;
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

    private static /* synthetic */ CallSite IIjqq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = I1stli[n2 ^ 0xAE277F4A];
        int n9 = n8 >>> 16;
        String string2 = sy.OOpppmn(Ilppljt.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xAE277F4A);
        n8 = I1stli[n3 ^ 0xAE277F4A];
        int n10 = n8 >>> 16;
        String string3 = sy.OOpppmn(Ilppljt.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xAE277F4A);
        n8 = I1stli[n4 ^ 0xAE277F4A];
        int n11 = n8 >>> 16;
        String string4 = sy.OOpppmn(Ilppljt.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xAE277F4A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x35B216B) + -178;
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

    private static /* synthetic */ CallSite OOkn0iIs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = I1stli[n2 ^ 0xAE277F4A];
        int n8 = n7 >>> 16;
        String string2 = sy.OOpppmn(Ilppljt.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xAE277F4A);
        n7 = I1stli[n3 ^ 0xAE277F4A];
        int n9 = n7 >>> 16;
        String string3 = sy.OOpppmn(Ilppljt.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xAE277F4A);
        n7 = I1stli[n4 ^ 0xAE277F4A];
        int n10 = n7 >>> 16;
        String string4 = sy.OOpppmn(Ilppljt.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xAE277F4A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x35B216B) + -178;
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
