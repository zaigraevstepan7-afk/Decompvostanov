/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NAN
 *  KDFzREm.NNNNT
 *  KDFzREm.NNNNs
 *  KDFzREm.NNNwd
 *  KDFzREm.NlQ
 */
package KDFzREm;

import KDFzREm.NAN;
import KDFzREm.NNNNT;
import KDFzREm.NNNNs;
import KDFzREm.NNNwd;
import KDFzREm.NlQ;
import KDFzREm.RP;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.kR;
import KDFzREm.kb;
import KDFzREm.lY;
import KDFzREm.le;
import KDFzREm.lt;
import KDFzREm.sP;
import KDFzREm.sW;
import KDFzREm.sb;
import KDFzREm.sj;
import KDFzREm.uF;
import KDFzREm.y;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@UZ(L="AutoAuth", y=UR.PLAYER, N=Uz.AUTO)
public class sT
extends UM {
    private static byte[] i;
    private static byte[] R;
    private static short[] M;
    public Object[] L;
    private static String[] B;
    private static boolean[] Z;
    private static short[] z;
    private static short[] U;
    public static Object[] u;
    private static /* synthetic */ String I1isrIOr;
    private static /* synthetic */ int[] IIk0sn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight((n ^ 0x5B2358DA) + 1, 25), 5), 10), 15);
    }

    private void M(String string) {
        sT.lImlslIm("fbkcntv", -417787270, 2051241278, 2051241258, 2051241259, 1741365004, -556626872, -22744999, (sT)this);
        if (sT.lImlslIm("rirnzu", -417787270, 2051241260, 2051241234, 2051241235, 1741365004, -556626872, -22744999, (Boolean)((Boolean)((Object)sT.lImlslIm("bqlqmhuj", -417787272, 2051241278, 2051241263, 2051241248, -1419021854, 1966586219, 1448014729, (sT)this)[sT.lImlslIm("bqlqmhuj", -417787266, 2051241278, 2051241233, 2051241250, -1821433797, -1255676092, 1256123841)[3]]))) != false) {
            return;
        }
        CallSite callSite = sT.lImlslIm("vqrori", -417787270, 2051241236, 2051241238, 2051241269, 1741365004, -556626872, -22744999, (String)((Object)sT.lImlslIm("xwoebf", -417787270, 2051241236, 2051241237, 2051241269, 1741365004, -556626872, -22744999, (String)string)));
        CallSite callSite2 = sT.lImlslIm("sfuuum", -417787275, 2051241239, 2051241224, 2051241225, 1741365004, -556626872, -22744999, (List)((List)((Object)sT.lImlslIm("cqeiqjvm", -417787272, 2051241278, 2051241263, 2051241248, -73046767, -1885608861, 976806081, (sT)this)[sT.lImlslIm("rirnzu", -417787266, 2051241278, 2051241249, 2051241250, 1193875501, 538315029, -1084884722)[0]])));
        while (sT.lImlslIm("sfuuum", -417787275, 2051241226, 2051241227, 2051241235, 1741365004, -556626872, -22744999, (Iterator)((Object)callSite2)) != false) {
            sP sP2 = (sP)((Object)sT.lImlslIm("fzxm", -417787275, 2051241226, 2051241228, 2051241229, 1741365004, -556626872, -22744999, (Iterator)((Object)callSite2)));
            if (sT.lImlslIm("hnxww", -417787275, 2051241230, 2051241240, 2051241231, 1741365004, -556626872, -22744999, (sP)sP2, (String)((Object)callSite)) == false) continue;
            sT.lImlslIm("xwoebf", -417787270, 2051241278, 2051241273, 2051241216, 1741365004, -556626872, -22744999, (sT)this, (sP)sP2);
            return;
        }
    }

    private static void T() {
        B = new String[]{"password", "^[^\\s]{1,16}$", "open-path", "auth", "AutoAuth.json"};
    }

    public sT() {
        sT.lImlslIm("bqlqmhuj", -417787270, 2051241278, 2051241258, 2051241259, -417787270, -417787270, -417787270, (sT)this);
        sW sW2 = new sW((Path)((Object)sT.lImlslIm("rirnzu", -417787266, 2051241278, 2051241219, 2051241248, -417787266, -417787266, -417787266)[sT.lImlslIm("vqrori", -417787266, 2051241278, 2051241270, 2051241250, -417787266, -417787266, -417787266)[0]]));
        sT.lImlslIm("fzxm", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this)[sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241270, 2051241250, -417787266, -417787266, -417787266)[1]] = sW2;
        CallSite callSite = sT.lImlslIm("fbkcntv", -417787276, 2051241337, 2051241273, 2051241338, -417787276, -417787276, -417787276, (lY)this, (String)((Object)sT.lImlslIm("rirnzu", -417787266, 2051241278, 2051241220, 2051241221, -417787266, -417787266, -417787266)[0]), (String)((String)((Object)sT.lImlslIm("hnxww", -417787266, 2051241278, 2051241219, 2051241248, -417787266, -417787266, -417787266)[sT.lImlslIm("hnxww", -417787266, 2051241278, 2051241270, 2051241250, -417787266, -417787266, -417787266)[2]])), (Pattern)((Object)sT.lImlslIm("sfuuum", -417787276, 2051241222, 2051241223, 2051241336, -417787276, -417787276, -417787276, (String)((Object)sT.lImlslIm("sfuuum", -417787266, 2051241278, 2051241220, 2051241221, -417787266, -417787266, -417787266)[1]))));
        sT.lImlslIm("hnxww", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this)[sT.lImlslIm("rirnzu", -417787266, 2051241278, 2051241270, 2051241250, -417787266, -417787266, -417787266)[3]] = callSite;
        CallSite callSite2 = sT.lImlslIm("rirnzu", -417787276, 2051241337, 2051241273, 2051241339, -417787276, -417787276, -417787276, (lY)this, (String)((Object)sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241220, 2051241221, -417787266, -417787266, -417787266)[2]), () -> {
            sT.lImlslIm("vqrori", -417787270, 2051241278, 2051241258, 2051241259, 1741365004, -556626872, -22744999, (sT)this);
            try {
                sT.lImlslIm("hcsbqlo", -417787270, 2051241247, 2051241273, 2051241232, 1741365004, -556626872, -22744999, (NlQ)sT.lImlslIm("cqeiqjvm", -417787276, 2051241242, 2051241243, 2051241244, 1741365004, -556626872, -22744999), (Path)((Object)sT.lImlslIm("bqlqmhuj", -417787270, 2051241245, 2051241273, 2051241246, 1741365004, -556626872, -22744999, (sW)((sW)((Object)sT.lImlslIm("bqlqmhuj", -417787272, 2051241278, 2051241263, 2051241248, 1695243951, 1739033164, -566064660, (sT)this)[sT.lImlslIm("sfuuum", -417787266, 2051241278, 2051241249, 2051241250, 978088408, 93336302, 618238668)[6]])))));
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
        sT.lImlslIm("fbkcntv", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this)[sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241270, 2051241250, -417787266, -417787266, -417787266)[4]] = callSite2;
        CallSite callSite3 = sT.lImlslIm("fbkcntv", -417787276, 2051241239, 2051241340, 2051241341, -417787276, -417787276, -417787276, (Object)new sb((sW)((Object)sT.lImlslIm("sfuuum", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this)[sT.lImlslIm("hnxww", -417787266, 2051241278, 2051241233, 2051241250, -417787266, -417787266, -417787266)[0]])), (Object)new sj((sW)((Object)sT.lImlslIm("xwoebf", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this)[sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241233, 2051241250, -417787266, -417787266, -417787266)[1]])));
        sT.lImlslIm("bqlqmhuj", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this)[sT.lImlslIm("fzxm", -417787266, 2051241278, 2051241233, 2051241250, -417787266, -417787266, -417787266)[2]] = callSite3;
    }

    static {
        sT.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, 13, -75, -38, -32, -56, -37, -50, -23, 51, -24, 26, 2, 66, -102, 127};
        int n = 0;
        int n2 = 153;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 31;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(-n, 28), 7) ^ 0x2625E8C5, 11);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-77, -50, -42, -21, -64, 40, -87, 53, -125, -111, 87, -12, 1, -89, -24, -89};
        int n = 0;
        int n2 = 100;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 75;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        Z = new boolean[]{false, true, false, false, false, true, false};
    }

    private void s() {
        if (sT.lImlslIm("hnxww", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this) == null) {
            sT.lImlslIm("hnxww", -417787271, 2051241278, 2051241263, 2051241248, -417787271, -417787271, -417787271, (sT)this, (Object[])new Object[sT.lImlslIm("fbkcntv", -417787266, 2051241278, 2051241253, 2051241254, -417787266, -417787266, -417787266)[4]]);
            CallSite callSite = sT.lImlslIm("hcsbqlo", -417787272, 2051241278, 2051241263, 2051241248, -417787272, -417787272, -417787272, (sT)this);
            callSite[sT.lImlslIm("hnxww", -417787266, 2051241278, 2051241253, 2051241254, -417787266, -417787266, -417787266)[5]] = sT.lImlslIm("vqrori", -417787276, 2051241260, 2051241261, 2051241262, -417787276, -417787276, -417787276, (boolean)sT.lImlslIm("sfuuum", -417787266, 2051241278, 2051241279, 2051241264, -417787266, -417787266, -417787266)[6]);
        }
    }

    private static void n() {
        u = new Object[]{null, null, 40};
    }

    private static void m() {
        M = new short[]{1, 0, 0, 1, 2};
        U = new short[]{0, 0, 3, 4};
        z = new short[]{3, 4, 1, 0, 1, 4, 0};
    }

    private static void v() {
        i = new byte[]{40, 40, 2, 2, 5, 4, 3, 2};
        R = new byte[]{40};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-1, 54, -105, -38, -50, -95, -71, -44, -10, 3, -103, -59, 40, 105, -24, -55};
        int n = 0;
        int n2 = 103;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 103;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return (Integer.rotateRight(n ^ 0xBE7ACA26, 22) ^ 0x286C943F) + 1 ^ 0x2973A1F3;
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateRight(Integer.rotateRight(-n ^ 0x38AA00FC, 29) ^ 0x1F2D2B05, 21) ^ 0x5EC51D48) + 1;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{115, -21, -10, 113, -33, -84, 2, -108, -58, 61, 27, -16, -70, 109, 99, 30};
        int n = 0;
        int n2 = 211;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 55;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(n ^ 0xB914F07B, 15) ^ 0x71C82B80;
    }

    @uF
    public void N(RP rP) {
        CallSite callSite = sT.lImlslIm("fzxm", -417787270, 2051241272, 2051241273, 2051241274, 1741365004, -556626872, -22744999, (RP)rP);
        sT.lImlslIm("vqrori", -417787276, 2051241275, 2051241276, 2051241277, 1741365004, -556626872, -22744999, (Object)callSite);
        CallSite callSite2 = callSite;
        CallSite callSite3 = sT.lImlslIm("cqeiqjvm", -417787266, 2051241278, 2051241279, 2051241264, 1004184722, 661794046, 1475672516)[0];
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{NNNwd.class, NNNNT.class, NNNNs.class}, (Object)callSite2, (int)callSite3)) {
            case 0: {
                NNNwd nNNwd = (NNNwd)callSite2;
                sT.lImlslIm("rirnzu", -417787270, 2051241278, 2051241270, 2051241271, 1741365004, -556626872, -22744999, (sT)this, (String)((Object)sT.lImlslIm("cqeiqjvm", -417787275, 2051241267, 2051241268, 2051241269, 1741365004, -556626872, -22744999, (NAN)sT.lImlslIm("cqeiqjvm", -417787270, 2051241265, 2051241273, 2051241266, 1741365004, -556626872, -22744999, (NNNwd)nNNwd))));
                break;
            }
            case 1: {
                NNNNT nNNNT = (NNNNT)callSite2;
                sT.lImlslIm("vqrori", -417787270, 2051241278, 2051241270, 2051241271, 1741365004, -556626872, -22744999, (sT)this, (String)((Object)sT.lImlslIm("fbkcntv", -417787275, 2051241267, 2051241268, 2051241269, 1741365004, -556626872, -22744999, (NAN)sT.lImlslIm("rirnzu", -417787270, 2051241256, 2051241273, 2051241266, 1741365004, -556626872, -22744999, (NNNNT)nNNNT))));
                break;
            }
            case 2: {
                NNNNs nNNNs = (NNNNs)callSite2;
                sT.lImlslIm("xwoebf", -417787270, 2051241278, 2051241270, 2051241271, 1741365004, -556626872, -22744999, (sT)this, (String)((Object)sT.lImlslIm("sfuuum", -417787275, 2051241267, 2051241268, 2051241269, 1741365004, -556626872, -22744999, (NAN)sT.lImlslIm("bqlqmhuj", -417787270, 2051241257, 2051241273, 2051241266, 1741365004, -556626872, -22744999, (NNNNs)nNNNs))));
                break;
            }
        }
    }

    private void N(sP sP2) {
        sT.lImlslIm("bqlqmhuj", -417787270, 2051241278, 2051241258, 2051241259, 1741365004, -556626872, -22744999, (sT)this);
        CallSite callSite = sT.lImlslIm("vqrori", -417787276, 2051241260, 2051241261, 2051241262, 1741365004, -556626872, -22744999, (boolean)sT.lImlslIm("bqlqmhuj", -417787266, 2051241278, 2051241279, 2051241264, 537886669, 172753156, 231883733)[1]);
        sT.lImlslIm("xwoebf", -417787272, 2051241278, 2051241263, 2051241248, -1341289035, -847130211, 143864903, (sT)this)[sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241249, 2051241250, -1471436359, 2085528227, -1618148377)[1]] = callSite;
        sT.lImlslIm("sfuuum", -417787270, 2051241255, 2051241240, 2051241241, 1741365004, -556626872, -22744999, (kR)((Object)sT.lImlslIm("fzxm", -417787276, 2051241251, 2051241279, 2051241252, 1741365004, -556626872, -22744999)), (int)sT.lImlslIm("hnxww", -417787266, 2051241278, 2051241253, 2051241254, -101670039, 111141562, 262056414)[0], () -> {
            sT.lImlslIm("vqrori", -417787270, 2051241278, 2051241258, 2051241259, 1741365004, -556626872, -22744999, (sT)this);
            String string = sT.lImlslIm("sfuuum", -417787270, 2051241236, 2051241218, 2051241235, 1741365004, -556626872, -22744999, (String)((Object)sT.lImlslIm("fzxm", -417787270, 2051241217, 2051241270, 2051241269, 1741365004, -556626872, -22744999, (lt)((lt)((Object)sT.lImlslIm("vqrori", -417787272, 2051241278, 2051241263, 2051241248, -1682934386, 1581901833, 2018443275, (sT)this)[sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241249, 2051241250, -1761424278, 1413054950, -773070908)[2]]))))) != false ? (String)((Object)sT.lImlslIm("hcsbqlo", -417787266, 2051241278, 2051241219, 2051241248, -1837962024, 1071832835, 1433750546)[sT.lImlslIm("vqrori", -417787266, 2051241278, 2051241249, 2051241250, 637017153, 1396237263, -1869126191)[3]]) : sT.lImlslIm("cqeiqjvm", -417787270, 2051241217, 2051241270, 2051241269, 1741365004, -556626872, -22744999, (lt)((lt)((Object)sT.lImlslIm("cqeiqjvm", -417787272, 2051241278, 2051241263, 2051241248, -1453339901, 835006245, 336647019, (sT)this)[sT.lImlslIm("xwoebf", -417787266, 2051241278, 2051241249, 2051241250, -1579365708, -1396374971, -1228217764)[4]])));
            sT.lImlslIm("bqlqmhuj", -417787275, 2051241230, 2051241273, 2051241271, 1741365004, -556626872, -22744999, (sP)sP2, (String)string);
            sT.lImlslIm("cqeiqjvm", -417787270, 2051241255, 2051241240, 2051241241, 1741365004, -556626872, -22744999, (kR)((Object)sT.lImlslIm("rirnzu", -417787276, 2051241251, 2051241279, 2051241252, 1741365004, -556626872, -22744999)), (int)sT.lImlslIm("hnxww", -417787266, 2051241278, 2051241253, 2051241254, 931831955, 671545060, -1304358024)[1], () -> {
                sT.lImlslIm("vqrori", -417787270, 2051241278, 2051241258, 2051241259, 1741365004, -556626872, -22744999, (sT)this);
                CallSite callSite = sT.lImlslIm("hcsbqlo", -417787276, 2051241260, 2051241261, 2051241262, 1741365004, -556626872, -22744999, (boolean)sT.lImlslIm("sfuuum", -417787266, 2051241278, 2051241279, 2051241264, 1672146550, -475807956, 583970343)[2]);
                sT.lImlslIm("hcsbqlo", -417787272, 2051241278, 2051241263, 2051241248, 1509615886, -1493647151, -1019363007, (sT)this)[sT.lImlslIm("rirnzu", -417787266, 2051241278, 2051241249, 2051241250, 1142348110, -1163136405, -1294315515)[5]] = callSite;
            });
        });
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{88, 91, -52, -75, -105, 32, -30, -32, -4, -12, 16, 92, 30, 78, -115, -6};
        int n = 0;
        int n2 = 41;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 139;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        sT.OOtps(new String[]{"\u0000;\u0000\u0001\u00f2\u0000(\u0000\u0017\u0099\u0095j\u00c6\u008f\u00e4\u008b\noz)\u00bfZ\u00ec2/\u00e1\u00b8t\u00cf\u00c2\u00ac\u00f2\u0000A\u0000\nk\u009dF\u00dd\u00ab\u00c0\u00c9Kj~\u0000)\u0000\u0001`\u0000\b\u0000\u0002\u00ea\u0083\u0000\u0007\u0000\u0001\u008f\u0000-\u0000\u0004\u00f1\u00abi\u00ca\u0000\u0012\u0000\u0001f\u0000\u0011\u0000\rk\u009dF\u00dd\u00ab\u00c0\u00c9KH[H\u0097@\u0000\f\u0000\t\u00a8\u00bct\u00f4\u008d\u00f7\u00cd\na\u0000\u0006\u0000\n\u00b2\u009dF\u00dd\u00ab\u00c0\u00c9KuA\u0000\u0004\u0000\u000ea\u00bcq\u00d2\u0090\u00f7\u00c1*i{H\u00ac_\u00ec\u0000*\u0000\fb\u00b6o\u00cb\u009c\u00e4\u00ca2gys\u00bc\u00006\u0000\n\u00b2\u009dF\u00dd\u00ab\u00c0\u00c9KuE\u0000\u0010\u0000\rB\u009dF\u00dd\u00ab\u00c0\u00c9KH[H\u0097g\u0000\u0015\u0000\u0007\u00c3\u00b8l\u00d2\u009c\u00ca\u00c2\u00005\u0000\u0014\u009d\u00f0L\u00cd\u0098\u00f3\u00c5Kjth\u00be\u001c\u00cf5\u000f\u00d0\u00bat\u009c\u0000 \u0000\u0001p\u0000?\u0000\u0007X\u00b6m\u00d7\u0090\u00e9\u00c1\u0000\t\u0000\r~\u009dF\u00dd\u00ab\u00c0\u00c9KH[H\u00aeW\u0000\u001d\u0000\u0001\u00ec\u0000#\u0000\u00013\u0000$\u0000\u000f;\u00f0L\u00ec\u00bd\u00c3\u00de6Cx)\u0097_\u00d1l\u0000%\u0000\n\u00fe\u009dF\u00dd\u00ab\u00c0\u00c9KuB\u0000\u0005\u0000&\u009d\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6|\u00e2=\u0000\u00d6\u00ad;\u008e\u00b5\u00ef\u00c5\u0012g:j\u00b8]\u00e7x*\u00d7\u00b3e\u00c4\u008d\u00be\u0000\u001f\u0000\np\u009dF\u00dd\u00ab\u00c0\u00c9KmG\u0000\u0002\u0000\u000f=\u00f0L\u00ec\u00bd\u00c3\u00de6Cx)\u0097r\u00c3l\u0000/\u0000\u000eQ\u00b8v\u00c6\u00d6\u00f0\u00d0\rj:J\u00b0@\u00f4\u0000\u0016\u0000\u0016\u00d1\u0083)\u00eb\u0093\u00e4\u00d2\u0005)yg\u00b7T\u00af\u0015t\u0096\u00b5e\u00c6\u0097\u00be\u0000&\u0000\u0016\u00d1\u00f0L\u00cd\u0098\u00f3\u00c5Kh|i\u00f6U\u00e9;~\u00d6\u0089a\u00d3\u0091\u00be\u0000!\u0000\u0018\b\u0090L\u00cd\u0098\u00f3\u00c5Kjth\u00be\u001c\u00d2\"\u0080N\u00b8b\u00cb\u009c\u00be\u008d2\u00000\u0000\b`\u00ade\u00d5\u0098\u00f1\u00cb\u0016\u0000=\u0000\u0013\u00de\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6`\u00f4%\u00d5\u00eb\u00be;\u00008\u0000\u000f\u0099\u0095K\u00e3\u00bf\u00ff\u00f6!k:u\u0089\b\u00a9\u0001\u0000@\u0000-!\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6`\u00f4%\u0087g\u00be;\u008e\u00b5\u00ef\u00c5\u0012g:s\u00adZ\u00ecx\u009cl\u00bee\u00df\u00d6\u00d5\u00c5\u0010rpt\u00b7\b\u00009\u0000\n~\u009dF\u00dd\u00ab\u00c0\u00c9Kja\u0000\u000e\u0000\u0001k\u0000\"\u0000\u000b^\u009dF\u00dd\u00ab\u00c0\u00c9KHyR\u0000'\u0000\u000b\u009e\u009dF\u00dd\u00ab\u00c0\u00c9KHyW\u0000:\u0000\u0007i\u00aaB\u00cb\u0098\u00eb\u00cf\u0000\u001b\u0000\t\u00cc\u009dF\u00dd\u00ab\u00c0\u00c9K\u007f\u0000\u0013\u0000\u0003v\u00f0V\u0000<\u0000\u0001\u008d\u0000\u000b\u0000\u000b\u00cc\u009dF\u00dd\u00ab\u00c0\u00c9KHTH\u0000,\u0000\u0010\u00a5\u00b8v\u00c6\u00d6\u00e9\u00c5\na:U\u00adA\u00e99\u00db\u0000D\u0000\u0002|\u00bf\u0000\n\u0000\u000f(\u00f0L\u00ec\u00bd\u00c3\u00de6Cx)\u0097r\u00cel\u0000\u0001\u0000\u0001n\u0000\u0014\u0000\u0011y\u00b8v\u00c6\u00d6\u00e9\u00c5\na:D\u00b6\\\u00ec2\u0004}\u0000\u001c\u0000\u000e\u00e7\u00f0L\u00ec\u00bd\u00c3\u00de6Cx)\u00b2a\u00bb\u0000\r\u0000\u0014\u00ad\u00f0L\u00cd\u0098\u00f3\u00c5Kjth\u00be\u001c\u00d3#\u00ce\u00ec\u00b7g\u009c\u00003\u0000\u00076\u00b8s\u00e9\u009c\u00fd\u00d0\u00007\u0000\u0015\u00fd\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6`\u00f4%r\u00bb\u00be;\u008e\u00a3\u0000\u0003\u0000\u00114\u00b8v\u00c6\u00d6\u00f0\u00d0\rj:I\u00bbY\u00e54\u00fa-\u0000B\u0000W=\u0095K\u00e3\u00bf\u00ff\u00f6!k:j\u0080\b\u00cc=\u00efc\u00b8/\u00cb\u0098\u00eb\u00c3KUat\u00b0]\u00e7l\u00c2\u007f\u00b8v\u00c6\u00d6\u00e9\u00c5\na:U\u00adA\u00e99\u00e9.\u0095j\u00c6\u008f\u00e4\u008b\u0011r|j\u00f6A\u00e50\u00ebm\u00f6P\u00c6\u008d\u00f1\u00c1\u0016h./\u0095x\u00c4\u0011\u00f4G\u009cm\u0088\u0095\u00f1\u009f\u00001\u0000\u0016\b\u00f0L\u00cd\u0098\u00f3\u00c5Ksao\u00b5\u001c\u00c9#\u008bR\u00b8t\u00c8\u008b\u00be\u0000+\u0000\u0003\u00af\u00f0Z\u00004\u0000\u0004}\u00bcx\u00d3\u0000\u000f\u0000\u0015\u0013\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6`\u00f4%gU\u00be;\u008e\u00af\u0000\u001e\u0000\u0002}\u009b\u0000\u0019\u0000\u0001O\u0000E\u00006\u009d\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6|\u00e2=\u0000\u00d6\u00ad;\u00eb\u0093\u00e4\u00d2\u0005)yg\u00b7T\u00af\u0018\u0007\u00df\u00bcc\u00d3\u00c2\u00ac\u00e8\u000egcg\u00f6F\u00f4>\t\u009a\u0095i\u00d4\u008d\u00be\u0000C\u0000@v\u0095K\u00e3\u00bf\u00ff\u00f6!k:j\u0080\b\u00cc=\u00ef(\u00b8/\u00cb\u0098\u00eb\u00c3KUat\u00b0]\u00e7l\u00c24\u00b8v\u00c6\u00d6\u00e9\u00c5\na:T\u00ac]\u00ee6\u00ec2\u00bc;\u008e\u00b5\u00ce\u00e0\"|GC\u00b4\u001c\u00ec$\u00b5\u0000\u0017\u0000\u0001\u0099\u0000.\u0000\u000bR\u00b6L\u00c8\u008e\u00e0\u00d6'gfc\u00002\u0000\u0012\u007f\u00b8v\u00c6\u00d6\u00f0\u00d0\rj:O\u00adV\u00f26\u00faz\u00ab\u0000\u0000\u0000\nB\u009dF\u00dd\u00ab\u00c0\u00c9KTE\u0000\u001a\u0000\u0002[\u008a\u0000>\u0000\u0017L\u00b8v\u00c6\u00d6\u00f0\u00d0\rj:t\u00bcT\u00e5/!v\u00b8t\u00d3\u009c\u00f7\u00ca\u0000\u0018\u0000\u0013\u00ea\u0095j\u00c6\u008f\u00e4\u008b\bg{a\u00f6|\u00e2=e\u00d2\u00ad;"});
        sT.m();
        sT.v();
        sT.b();
        sT.T();
        sT.n();
        String string = ((kb)KDFzREm.y.L[2]).Z();
        sT.u[0] = string + ((kb)KDFzREm.y.L[2]).M();
        sT.u[1] = ((Path)le.N[0]).resolve(B[3]).resolve(B[4]);
    }

    private static /* synthetic */ CallSite lImlslIm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IIk0sn[n2 ^ 0x7A437538];
        int n9 = n8 >>> 16;
        String string2 = sT.IIqtqst0(I1isrIOr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x7A437538);
        n8 = IIk0sn[n3 ^ 0x7A437538];
        int n10 = n8 >>> 16;
        String string3 = sT.IIqtqst0(I1isrIOr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x7A437538);
        n8 = IIk0sn[n4 ^ 0x7A437538];
        int n11 = n8 >>> 16;
        String string4 = sT.IIqtqst0(I1isrIOr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x7A437538);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE71912CC) + -178;
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

    private static /* synthetic */ void OOtps(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[70];
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
        I1isrIOr = stringBuilder.toString();
        IIk0sn = nArray;
    }

    private static /* synthetic */ String IIqtqst0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{43, 11, -28, -84, -46, -82, -102, -2, 62, 30, 56, 117, 13, -98, 34, 16};
        byte[] byArray3 = new byte[]{-70, 99, 4, 34, -116, 123, -46, -93, -18, -106, -114, 20, -100, -118, -17, 118};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite IIkri0Ijr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IIk0sn[n2 ^ 0x7A437538];
        int n9 = n8 >>> 16;
        String string2 = sT.IIqtqst0(I1isrIOr.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x7A437538);
        n8 = IIk0sn[n3 ^ 0x7A437538];
        int n10 = n8 >>> 16;
        String string3 = sT.IIqtqst0(I1isrIOr.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x7A437538);
        n8 = IIk0sn[n4 ^ 0x7A437538];
        int n11 = n8 >>> 16;
        String string4 = sT.IIqtqst0(I1isrIOr.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x7A437538);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xE71912CC) + -178;
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
