/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNIo
 *  KDFzREm.NNIq
 *  KDFzREm.NNNZg
 *  KDFzREm.NNNwS
 *  KDFzREm.NNde
 *  KDFzREm.NNuU
 *  KDFzREm.NXi
 *  KDFzREm.NbK
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package KDFzREm;

import KDFzREm.MR;
import KDFzREm.NNIo;
import KDFzREm.NNIq;
import KDFzREm.NNNZg;
import KDFzREm.NNNwS;
import KDFzREm.NNde;
import KDFzREm.NNuU;
import KDFzREm.NXi;
import KDFzREm.NbK;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ZH;
import KDFzREm.ZR;
import KDFzREm.jJ;
import KDFzREm.jO;
import KDFzREm.jg;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.uA;
import KDFzREm.uF;
import KDFzREm.uY;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@UZ(L="Tracers", y=UR.VISUAL, N=Uz.SCREEN)
public class jQ
extends UM {
    private static short[] u;
    private static String[] i;
    private static byte[] R;
    private static boolean[] M;
    private static short[] B;
    private static float[] Z;
    private static short[] z;
    public Object[] L;
    private static /* synthetic */ String llslli0;
    private static /* synthetic */ int[] Ili00Or;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(n, 7), 26), 28) ^ 0xD549C0E1, 9);
    }

    private static void P() {
        M = new boolean[]{true, true, false, true, false};
    }

    private static void T() {
        Z = new float[]{0.0f, 0.0f, -1.0f, 0.0f};
    }

    public jQ() {
        jQ.I1lOlr("isfkn", -1497113644, 883645587, 883645586, 883645585, -1497113644, -1497113644, -1497113644, (jQ)this);
        Matrix4f matrix4f = new Matrix4f();
        jQ.I1lOlr("jjbxlbt", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("jjbxlbt", -1497113648, 883645587, 883645614, 883645588, -1497113648, -1497113648, -1497113648)[0]] = matrix4f;
        jJ jJ2 = new jJ(this, (String)((Object)jQ.I1lOlr("xtzqy", -1497113648, 883645587, 883645624, 883645650, -1497113648, -1497113648, -1497113648)[0]), (boolean)jQ.I1lOlr("jjbxlbt", -1497113648, 883645587, 883645580, 883645626, -1497113648, -1497113648, -1497113648)[0]);
        jQ.I1lOlr("oafimaq", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("tclibe", -1497113648, 883645587, 883645614, 883645588, -1497113648, -1497113648, -1497113648)[1]] = jJ2;
        jg jg2 = new jg(this, (String)((Object)jQ.I1lOlr("mvppmp", -1497113648, 883645587, 883645624, 883645650, -1497113648, -1497113648, -1497113648)[1]), (boolean)jQ.I1lOlr("moba", -1497113648, 883645587, 883645580, 883645626, -1497113648, -1497113648, -1497113648)[1]);
        jQ.I1lOlr("isfkn", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("isfkn", -1497113648, 883645587, 883645589, 883645588, -1497113648, -1497113648, -1497113648)[0]] = jg2;
        lv[] lvArray = new jO[jQ.I1lOlr("ykvif", -1497113648, 883645587, 883645594, 883645651, -1497113648, -1497113648, -1497113648)[0]];
        lvArray[jQ.I1lOlr("ykvif", -1497113648, 883645587, 883645580, 883645626, -1497113648, -1497113648, -1497113648)[2]] = (jJ)((Object)jQ.I1lOlr("tclibe", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("wctpgsx", -1497113648, 883645587, 883645589, 883645588, -1497113648, -1497113648, -1497113648)[1]]);
        lvArray[jQ.I1lOlr("tfhz", -1497113648, 883645587, 883645580, 883645626, -1497113648, -1497113648, -1497113648)[3]] = (jg)((Object)jQ.I1lOlr("tfhz", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("ijsjty", -1497113648, 883645587, 883645589, 883645588, -1497113648, -1497113648, -1497113648)[2]]);
        CallSite callSite = jQ.I1lOlr("xtzqy", -1497113638, 883645649, 883645599, 883645648, -1497113638, -1497113638, -1497113638, (lY)this, (String)((Object)jQ.I1lOlr("ibnuh", -1497113648, 883645587, 883645624, 883645650, -1497113648, -1497113648, -1497113648)[2]), (lv[])lvArray);
        jQ.I1lOlr("jjbxlbt", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("xtzqy", -1497113648, 883645587, 883645589, 883645588, -1497113648, -1497113648, -1497113648)[3]] = callSite;
        Matrix4f matrix4f2 = new Matrix4f();
        jQ.I1lOlr("svongphx", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("oafimaq", -1497113648, 883645587, 883645589, 883645588, -1497113648, -1497113648, -1497113648)[4]] = matrix4f2;
        CallSite callSite2 = jQ.I1lOlr("tclibe", -1497113637, 883645631, 883645617, 883645616, -1497113637, -1497113637, -1497113637, (List)((Object)jQ.I1lOlr("oafimaq", -1497113644, 883645625, 883645571, 883645655, -1497113644, -1497113644, -1497113644, (lj)((lj)((Object)jQ.I1lOlr("isfkn", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this)[jQ.I1lOlr("tclibe", -1497113648, 883645587, 883645589, 883645588, -1497113648, -1497113648, -1497113648)[5]])))));
        while (jQ.I1lOlr("mvppmp", -1497113637, 883645623, 883645622, 883645621, -1497113637, -1497113637, -1497113637, (Iterator)((Object)callSite2)) != false) {
            jO jO2 = (jO)((Object)jQ.I1lOlr("xtzqy", -1497113637, 883645623, 883645620, 883645627, -1497113637, -1497113637, -1497113637, (Iterator)((Object)callSite2)));
            if (!(jO2 instanceof uY)) continue;
            jO jO3 = jO2;
            jQ.I1lOlr("wctpgsx", -1497113637, 883645654, 883645591, 883645653, -1497113637, -1497113637, -1497113637, (uY)jO3, (Object)this);
        }
    }

    static {
        jQ.ntfClinit();
    }

    private static /* synthetic */ int i(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n, 30) ^ 0xD39D62B5, 8), 24), 30);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{16, -85, 126, 27, -40, -107, -34, -3, 72, 30, 58, 41, -86, -115, -84, 72};
        int n = 0;
        int n2 = 58;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 37;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        B = new short[]{0, 1};
        z = new short[]{2, 1, 2, 3, 4, 3, 2};
        u = new short[]{4, 0, 0, 3, 0, 4, 3, 3};
    }

    private void s() {
        if (jQ.I1lOlr("rcbobtpb", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this) == null) {
            jQ.I1lOlr("moba", -1497113641, 883645587, 883645571, 883645590, -1497113641, -1497113641, -1497113641, (jQ)this, (Object[])new Object[jQ.I1lOlr("tclibe", -1497113648, 883645587, 883645594, 883645651, -1497113648, -1497113648, -1497113648)[1]]);
            CallSite callSite = jQ.I1lOlr("mvppmp", -1497113642, 883645587, 883645571, 883645590, -1497113642, -1497113642, -1497113642, (jQ)this);
        }
    }

    private static void m() {
        i = new String[]{"players", "friends", "entities"};
    }

    private static void j() {
        R = new byte[]{2, 5};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-99, -49, 57, 114, 43, 122, 51, -29, -55, 38, -54, -86, 110, -125, -123, -45};
        int n = 0;
        int n2 = 152;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 233;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight((Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(-n, 25), 6), 23) ^ 0x385C151F) + 1, 15);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-98, -54, -126, 19, 48, 73, -27, 106, -74, -27, 55, -58, 5, 23, -82, -6};
        int n = 0;
        int n2 = 71;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 145;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateLeft(n, 11) ^ 0x74BAA24C) + 1 ^ 0xF1C10B90;
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(n, 1), 18), 15) ^ 0xD17E44A, 1), 18);
    }

    @uF(y=uA.BEFORE)
    public void N(MR mR) {
        jQ.I1lOlr("jjbxlbt", -1497113644, 883645587, 883645586, 883645585, -580994445, 2123255985, -926022141, (jQ)this);
        CallSite callSite = jQ.I1lOlr("tclibe", -1497113644, 883645595, 883645594, 883645593, -580994445, 2123255985, -926022141, (ZH)((ZH)((Object)jQ.I1lOlr("wctpgsx", -1497113648, 883645584, 883645591, 883645590, 247433743, -1165035444, -987946056)[jQ.I1lOlr("ibnuh", -1497113648, 883645587, 883645589, 883645588, 1001877693, -1642107834, -1323704749)[6]])));
        CallSite callSite2 = jQ.I1lOlr("moba", -1497113644, 883645597, 883645599, 883645596, -580994445, 2123255985, -926022141, (NNde)jQ.I1lOlr("ibnuh", -1497113644, 883645592, 883645599, 883645598, -580994445, 2123255985, -926022141, (MR)mR));
        CallSite callSite3 = jQ.I1lOlr("tfhz", -1497113644, 883645572, 883645579, 883645578, -580994445, 2123255985, -926022141, (Matrix4f)jQ.I1lOlr("mvppmp", -1497113644, 883645575, 883645591, 883645574, -580994445, 2123255985, -926022141, (NNIq)jQ.I1lOlr("jjbxlbt", -1497113644, 883645569, 883645571, 883645568, -580994445, 2123255985, -926022141, (NNIo)jQ.I1lOlr("ijsjty", -1497113644, 883645592, 883645571, 883645570, -580994445, 2123255985, -926022141, (MR)mR))), (Matrix4f)((Matrix4f)jQ.I1lOlr("ykvif", -1497113642, 883645587, 883645571, 883645590, -676016619, 685335359, 1309166775, (jQ)this)[jQ.I1lOlr("oafimaq", -1497113648, 883645587, 883645573, 883645588, -1798653878, -1742858980, 348715674)[0]]));
        CallSite callSite4 = jQ.I1lOlr("tfhz", -1497113644, 883645572, 883645579, 883645578, -580994445, 2123255985, -926022141, (Matrix4f)jQ.I1lOlr("ykvif", -1497113644, 883645592, 883645591, 883645574, -580994445, 2123255985, -926022141, (MR)mR), (Matrix4f)((Matrix4f)jQ.I1lOlr("ykvif", -1497113642, 883645587, 883645571, 883645590, -1537384909, 1891470679, 1227628720, (jQ)this)[jQ.I1lOlr("oafimaq", -1497113648, 883645587, 883645573, 883645588, -1686175946, 920780460, -1401819346)[1]]));
        CallSite callSite5 = jQ.I1lOlr("oafimaq", -1497113644, 883645572, 883645577, 883645576, -580994445, 2123255985, -926022141, (Matrix4f)callSite4, (Matrix4fc)callSite3);
        CallSite callSite6 = jQ.I1lOlr("svongphx", -1497113637, 883645618, 883645617, 883645616, -580994445, 2123255985, -926022141, (Iterable)((Object)jQ.I1lOlr("dbrbs", -1497113644, 883645581, 883645580, 883645619, -580994445, 2123255985, -926022141, (NNNZg)((NNNZg)jQ.I1lOlr("isfkn", -1497113642, 883645583, 883645582, 883645590, -560126059, 1028471251, -931994321, (NNuU)((NNuU)jQ.I1lOlr("mvppmp", -1497113642, 883645587, 883645599, 883645590, -607810729, -471109821, 1630365035, (jQ)this)[jQ.I1lOlr("tfhz", -1497113648, 883645587, 883645573, 883645588, 1814668006, -320025071, -979810656)[2]]))[jQ.I1lOlr("ibnuh", -1497113648, 883645587, 883645573, 883645588, 330975186, 1872951033, -1703209699)[3]]))));
        while (jQ.I1lOlr("moba", -1497113637, 883645623, 883645622, 883645621, -580994445, 2123255985, -926022141, (Iterator)((Object)callSite6)) != false) {
            NbK nbK = (NbK)jQ.I1lOlr("oafimaq", -1497113637, 883645623, 883645620, 883645627, -580994445, 2123255985, -926022141, (Iterator)((Object)callSite6));
            if (nbK == (NNNwS)jQ.I1lOlr("moba", -1497113642, 883645583, 883645582, 883645590, 628842950, -720521061, -367737547, (NNuU)((NNuU)jQ.I1lOlr("jjbxlbt", -1497113642, 883645587, 883645599, 883645590, -95768795, -1055111722, 1256883975, (jQ)this)[jQ.I1lOlr("dbrbs", -1497113648, 883645587, 883645573, 883645588, -172589461, -787774263, -913145570)[4]]))[jQ.I1lOlr("pbtper", -1497113648, 883645587, 883645573, 883645588, 649827185, 671788339, -1962084200)[5]]) continue;
            for (reference var9_9 = jQ.I1lOlr("jjbxlbt", -1497113648, 883645587, 883645580, 883645626, 179987152, -1788605090, -793501741)[4]; var9_9 < jQ.I1lOlr("tclibe", -1497113637, 883645631, 883645630, 883645629, -580994445, 2123255985, -926022141, (List)((List)((Object)jQ.I1lOlr("tfhz", -1497113644, 883645625, 883645624, 883645627, -580994445, 2123255985, -926022141, (lj)((lj)((Object)jQ.I1lOlr("mvppmp", -1497113642, 883645587, 883645571, 883645590, 1576506344, -1907409094, 2085965120, (jQ)this)[jQ.I1lOlr("ijsjty", -1497113648, 883645587, 883645573, 883645588, 492618256, 1791369944, -716823327)[6]])))))); ++var9_9) {
                jO jO2 = (jO)((Object)jQ.I1lOlr("tfhz", -1497113637, 883645631, 883645628, 883645603, -580994445, 2123255985, -926022141, (List)((List)((Object)jQ.I1lOlr("moba", -1497113644, 883645625, 883645624, 883645627, -580994445, 2123255985, -926022141, (lj)((lj)((Object)jQ.I1lOlr("moba", -1497113642, 883645587, 883645571, 883645590, -1899804305, -1362690539, -1368916342, (jQ)this)[jQ.I1lOlr("xtzqy", -1497113648, 883645587, 883645573, 883645588, -478280014, -245482561, -811799040)[7]]))))), (int)var9_9));
                if (jQ.I1lOlr("pbtper", -1497113644, 883645602, 883645601, 883645600, -580994445, 2123255985, -926022141, (jO)jO2, (Object)nbK) == false) continue;
                CallSite callSite7 = jQ.I1lOlr("ykvif", -1497113644, 883645602, 883645591, 883645629, -580994445, 2123255985, -926022141, (jO)jO2);
                jQ.I1lOlr("mvppmp", -1497113644, 883645605, 883645599, 883645629, -580994445, 2123255985, -926022141, (ZR)((Object)jQ.I1lOlr("ijsjty", -1497113644, 883645605, 883645591, 883645612, -580994445, 2123255985, -926022141, (ZR)((Object)jQ.I1lOlr("svongphx", -1497113644, 883645605, 883645599, 883645613, -580994445, 2123255985, -926022141, (ZR)((Object)jQ.I1lOlr("svongphx", -1497113644, 883645605, 883645599, 883645613, -580994445, 2123255985, -926022141, (ZR)((Object)jQ.I1lOlr("mvppmp", -1497113644, 883645605, 883645591, 883645604, -580994445, 2123255985, -926022141, (ZR)((Object)jQ.I1lOlr("tfhz", -1497113644, 883645605, 883645591, 883645604, -580994445, 2123255985, -926022141, (ZR)((Object)callSite), (Matrix4f)callSite5, (float)jQ.I1lOlr("isfkn", -1497113648, 883645587, 883645607, 883645606, -533900689, 1934006232, 925606318)[0], (float)jQ.I1lOlr("isfkn", -1497113648, 883645587, 883645607, 883645606, 1065643053, -43857138, 995636794)[1], (float)jQ.I1lOlr("moba", -1497113648, 883645587, 883645607, 883645606, 1948055186, -440996892, 504658408)[2])), (Matrix4f)jQ.I1lOlr("svongphx", -1497113644, 883645592, 883645594, 883645611, -580994445, 2123255985, -926022141, (MR)mR), (float)((float)(jQ.I1lOlr("ijsjty", -1497113638, 883645610, 883645624, 883645609, -580994445, 2123255985, -926022141, (NbK)nbK) - jQ.I1lOlr("tclibe", -1497113642, 883645608, 883645580, 883645615, 626538725, 1838193003, 1628443017, (NXi)callSite2))), (float)((float)(jQ.I1lOlr("ijsjty", -1497113638, 883645610, 883645573, 883645609, -580994445, 2123255985, -926022141, (NbK)nbK) - jQ.I1lOlr("ykvif", -1497113642, 883645608, 883645614, 883645615, 1237366831, 216107617, -169311997, (NXi)callSite2))), (float)((float)(jQ.I1lOlr("ibnuh", -1497113638, 883645610, 883645571, 883645609, -580994445, 2123255985, -926022141, (NbK)nbK) - jQ.I1lOlr("dbrbs", -1497113642, 883645608, 883645607, 883645615, 1929675826, 807787541, 1494414306, (NXi)callSite2))))), (int)callSite7)), (int)callSite7)), (float)jQ.I1lOlr("rcbobtpb", -1497113648, 883645587, 883645607, 883645606, 977552035, -1718004337, 1491996597)[3])));
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        llslli0 = "c\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008e\u00aey\u00bb\u00f3\u00c4\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u009a\u00ae\"\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u00ac\u009d\u008b\u00b7\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008e\u00b8es\u00ac\u00b5\u00b9\u00bb\u00af\u00d5\u00e2\u007f.\u00b5\u00ad\u009a?kaY\u00e8\u00ec\u00e9\u00c3\u00a6\u009c\u00ac\u001c+\u00a8\u00a7\u00d9zImA\u00b5\u00c8\u00f0\u0083\u00b2\u00ce\u00fdd\"\u00e1i\u0099\u00b6\u00c2\u00f7$\u00c3\u0000\u00bb\u00af\u00d5\u00e2\u007f.\u00b5\u00ad\u009a?kaY\u00e8\u00b9P\u00c3\u00a6\u00c4\u00bey\b\u00b5\u00b2\u0091?Lo@\u00f6\u00ffe\u0096\u00b4\u00d5\u00ec(p\u00bc\u00fbA\u00de\u0096Q\u00bb\u00af\u00d5\u00e2\u007f.\u00b5\u00ad\u009a?kaY\u00e8\u00b9\u0001\u00c3\u00a6\u009c\u00c3\u0016\u0002\u00f3\u008c\u00bdT`z\u007f\u00df\u00bdV\u00ad\u0092\u009c+\"\u00a4\u00e7A\u00da\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u00b7\u0087\u00e2\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008e\u00b8YW2\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u00aa\u00b9\u00a7\u00bb\u008b\u00e3\u00c3*\u0016\u009f\u00ad\u00d9|\u007f;a\u00f0\u00b1\u00f9\u0096\u00ef\u00cb\u00e4>#\u00f5\u0093\u0082bOnJ\u00a1\u008b\u00c3\u00bc\u0084\u00e1\u00ff\u0002\u0001\u00b7\u00ef\u009af\u001d)a\u00d1\u0094\u00c9\u008d\u0092\u00e2\u00e8\u007f(\u00b0\u00fbIK\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u009a\u00be(\u00de\u008c\u00cd\u00e4&%\u00f5\u00ac\u0097~A/b\u00f8\u00efe\u0094\u00b4\u009c\"\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008e\u00b8YI\u001b\u00de\u009a\u00ca\u00ad\nQ\u00de\u008c\u00ec\u00c1\u0016>\u0088\u0085\u009b?hNd\u00f5\u00be\u00bc\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u00aa\u00a7\u0017\u0092\u00b8\u00d3v\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008e\u00b8^|gc\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008d\u00a4\u0016\u0085\u00a7\u0088\u00ef?)\u00b6\u00ef\u00bbqRrD\u00e2\u00e4\u001f\u00e7\u00b1\u00d4\u0096\u00b3\u00e9\u00e0(0\u0001\u0092\u00b4N\u00b1\u00e9\u00eb\u00ce\u0014\u0002\u00a0\u0092\u00b3}\tZ\u007f\u00a1\u0094\u00de\u008c\u00c8\u00f77k\u00b0\u00af\u009b|\tML\u00ee\u00f7\u00d5\u008f\u00f4\u00c1\u00be\u00f7\u00de\u008c\u00ec\u00c1\u0016>\u0088\u0085\u009b?hNI\u00ff\u00be\u00df\u00be\u00e9\u00eb\u00ef12\u00bb\u00ef\u009aqHg\u0002\u00d5\u00e7\u009d\u0092\u00a3\u00d3\u00be(\u00de\u008c\u00c8\u00f77k\u00b0\u00af\u009b|\tML\u00ee\u00f7i\u008f\u00f4\u00c1\u00d6$%\u00b9\u00ab\u00cd\u00ac\u009e\u00ba\u00c2\u00df\u00de\u008c\u00cd\u00e4&%\u00f5\u00ac\u0097~A/d\u00ee\u00e0\u0085\u0096\u00a2\u00cb\u00e0k\u0081\u00de\u008c\u00cd\u00e4&%\u00f5\u00b5\u0082yJ/a\u00f3\u00f6\u00dd\u00cc\u00e7\u00bb\u00aa\u00c6\u00f31k\u00b6\u00a1\u0098w\tOO\u00f0\u00e0\u00df\u0083\u00fb\"\u00bb\u00aa\u00c6\u00f31k\u00b6\u00a1\u0098w\tSY\u00e8\u00ec\u0017\u0090\u00fb\u00a7\u00de\u008c\u00ec\u00c1\u0016>\u0088\u0085\u009b?hNd\u00eb\u00eb\u0013\u0096\u00b6\u00c6\u00aa<%\u00b4\u00a7\u00d9YRe_\u00fb\u00e7\u0015\u0092\u00c3\u0096\u00b6\u00c6\u00aa%0\u00b3\u00ac\u00d9YRe_\u00fb\u00f1\u00c6\u0085Z\u0082\u00ac\u00a7\u00bb\u00aa\u00c6\u00f31k\u00b6\u00a1\u0098w\tOO\u00f0\u00b5\u00ec\u0083\u00fb\u008e\u00df\u009d\u00b8\u00f7\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u00b5\u00afF\u00a7\u00de\u008c\u00cd\u00e4&%\u00f5\u00b5\u0082yJ/d\u00ee\u00b5\u00fd\u0096\u00b4\u00c8\u00f7kN\u00de\u008c\u00ec\u00c1\u0016>\u0088\u0085\u009b?hXD\u00a1\u001b\u00bb\u00aa\u00c6\u00f31k\u00b6\u00a1\u0098w\tOO\u00f0\u00b5P\u0083\u00fb\u008e\u00d3\u0000\u0083\u00a5\u00d5\u00e4$+\u00a8\u0015\u00be\u00e9\u00eb\u00ce\u0014\u0002\u00a0\u0092\u00b3}\tZ\u007f\u00a1\u001d\u0092\u00b3\u00d3\u0015\u00de\u0089\u0085v\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u008e\u00b8tC\u001f\u00de\u008c\u00ec\u00c1\u0016>\u0088\u0085\u009b?|R\u0016|\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u00ac\u009c\u0096\u0096\u00b6\u00c6\u00aa%0\u00b3\u00ac\u00d9\\OsYx\u00b3\u0086\u00dd\u00d7\u0015)\u00f5\u009a\u00a4\u001f\u00bb\u008b\u00e3\u00c3*\u0016\u009f\u00ad\u00d9^DK\u0016\u00b3\u0094";
        Ili00Or = new int[]{21889034, 20774913, 0x880003, 851978, 11665409, 35586067, 0x10D0001, 0xB00002, 17694730, 6160385, 0x303000E, 23658506, 49676289, 28573712, 49741836, 45350927, 720897, 20840464, 19660812, 38076432, 12451852, 27197461, 43843585, 24313873, 5767174, 3145768, 41484291, 6225961, 0x22000C, 0x210001, 22806541, 11468801, 32964630, 39125010, 47710216, 43909142, 40304658, 25559047, 20447235, 22544388, 18350100, 20643842, 51445770, 11730945, 52101134, 32702468, 49479683, 26017795, 29622293, 0xCA000A, 49217540, 41680917, 786433, 25427970, 53018634, 9109540, 30998554, 11796490, 0x3330010, 11, 43122689, 43057153, 48234511, 26214415, 0x2E0002, 36831251, 1507338, 13893689, 34406418, 43188234, 46333973};
        jQ.b();
        jQ.j();
        jQ.P();
        jQ.T();
        jQ.m();
    }

    private static /* synthetic */ CallSite I1lOlr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ili00Or[n2 ^ 0x34AB5C93];
        int n9 = n8 >>> 16;
        String string2 = jQ.lItjrlmj(llslli0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x34AB5C93);
        n8 = Ili00Or[n3 ^ 0x34AB5C93];
        int n10 = n8 >>> 16;
        String string3 = jQ.lItjrlmj(llslli0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x34AB5C93);
        n8 = Ili00Or[n4 ^ 0x34AB5C93];
        int n11 = n8 >>> 16;
        String string4 = jQ.lItjrlmj(llslli0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x34AB5C93);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA6C3DB62) + -178;
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

    private static /* synthetic */ CallSite I1OOIn0i(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Ili00Or[n2 ^ 0x34AB5C93];
        int n8 = n7 >>> 16;
        String string2 = jQ.lItjrlmj(llslli0.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x34AB5C93);
        n7 = Ili00Or[n3 ^ 0x34AB5C93];
        int n9 = n7 >>> 16;
        String string3 = jQ.lItjrlmj(llslli0.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x34AB5C93);
        n7 = Ili00Or[n4 ^ 0x34AB5C93];
        int n10 = n7 >>> 16;
        String string4 = jQ.lItjrlmj(llslli0.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x34AB5C93);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA6C3DB62) + -178;
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

    private static /* synthetic */ String lItjrlmj(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{62, -81, 9, 22, -62, -31, 3, 88, -55, 71, 87, -79, -105, -126, 13, 71};
        byte[] byArray3 = new byte[]{-24, -16, 86, -52, 117, -42, 17, 40, 114, 12, 63, -15, -88, 50, -82, -11};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void lOI0tjlI(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[71];
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
        llslli0 = stringBuilder.toString();
        Ili00Or = nArray;
    }

    private static /* synthetic */ CallSite OOtktk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Ili00Or[n2 ^ 0x34AB5C93];
        int n9 = n8 >>> 16;
        String string2 = jQ.lItjrlmj(llslli0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x34AB5C93);
        n8 = Ili00Or[n3 ^ 0x34AB5C93];
        int n10 = n8 >>> 16;
        String string3 = jQ.lItjrlmj(llslli0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x34AB5C93);
        n8 = Ili00Or[n4 ^ 0x34AB5C93];
        int n11 = n8 >>> 16;
        String string4 = jQ.lItjrlmj(llslli0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x34AB5C93);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA6C3DB62) + -178;
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
