/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNYH
 *  KDFzREm.NNuU
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNYH;
import KDFzREm.NNuU;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.Wt;
import KDFzREm.ic;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.uA;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="TapeMouse", y=UR.COMBAT, N=Uz.TOOLS)
public class Wn
extends UM {
    private static byte[] u;
    private static short[] i;
    private static short[] R;
    private static short[] M;
    public Object[] L;
    private static boolean[] B;
    private static String[] Z;
    private static /* synthetic */ String I1psiI;
    private static /* synthetic */ int[] OlIiItpIm;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-n, 13) ^ 0x7AE76F40, 9) ^ 0x31753E4, 25) ^ 0xECD07792;
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{73, -37, -94, -88, -54, 18, 58, 11, 64, 117, -97, -128, 2, 114, 15, -20};
        int n = 0;
        int n2 = 233;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 121;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void P() {
        if (Wn.lIskpkpnr("mragau", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this) == null) {
            Wn.lIskpkpnr("estewv", -1558909101, 748701904, 748701918, 748701908, -1558909101, -1558909101, -1558909101, (Wn)this, (Object[])new Object[Wn.lIskpkpnr("rxrmeae", -1558909100, 748701904, 748701895, 748701896, -1558909100, -1558909100, -1558909100)[1]]);
            CallSite callSite = Wn.lIskpkpnr("ifgtbvz", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this);
        }
    }

    private static void T() {
        Z = new String[]{"left-mouse", "left-mouse-delay-sec", "right-mouse", "right-mouse-delay-sec", "mouse-buttons"};
    }

    public Wn() {
        Wn.lIskpkpnr("ifgtbvz", -1558909104, 748701904, 748701905, 748701906, -1558909104, -1558909104, -1558909104, (Wn)this);
        CallSite callSite = Wn.lIskpkpnr("mragau", -1558909100, 748701904, 748701897, 748701898, -1558909100, -1558909100, -1558909100)[0];
        CallSite callSite2 = Wn.lIskpkpnr("ifgtbvz", -1558909100, 748701904, 748701899, 748701900, -1558909100, -1558909100, -1558909100)[0];
        CallSite callSite3 = Wn.lIskpkpnr("ifgtbvz", -1558909100, 748701904, 748701897, 748701898, -1558909100, -1558909100, -1558909100)[1];
        NNuU nNuU = (NNuU)Wn.lIskpkpnr("rxrmeae", -1558909102, 748701904, 748701907, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("zrvsiqli", -1558909100, 748701904, 748701901, 748701910, -1558909100, -1558909100, -1558909100)[0]];
        Wn.lIskpkpnr("dskjgi", -1558909090, 748701902, 748701903, 748701936, -1558909090, -1558909090, -1558909090, (Object)nNuU);
        Wt wt2 = new Wt((String)((Object)callSite), (boolean)callSite2, (String)((Object)callSite3), () -> ((NNuU)nNuU).NF());
        Wn.lIskpkpnr("ifgtbvz", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("vrbus", -1558909100, 748701904, 748701901, 748701910, -1558909100, -1558909100, -1558909100)[1]] = wt2;
        CallSite callSite4 = Wn.lIskpkpnr("hrbfbgcv", -1558909100, 748701904, 748701897, 748701898, -1558909100, -1558909100, -1558909100)[2];
        CallSite callSite5 = Wn.lIskpkpnr("ifgtbvz", -1558909100, 748701904, 748701899, 748701900, -1558909100, -1558909100, -1558909100)[1];
        CallSite callSite6 = Wn.lIskpkpnr("uuuvfhlo", -1558909100, 748701904, 748701897, 748701898, -1558909100, -1558909100, -1558909100)[3];
        NNuU nNuU2 = (NNuU)Wn.lIskpkpnr("dskjgi", -1558909102, 748701904, 748701907, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("zrvsiqli", -1558909100, 748701904, 748701901, 748701910, -1558909100, -1558909100, -1558909100)[2]];
        Wn.lIskpkpnr("dskjgi", -1558909090, 748701902, 748701903, 748701936, -1558909090, -1558909090, -1558909090, (Object)nNuU2);
        Wt wt3 = new Wt((String)((Object)callSite4), (boolean)callSite5, (String)((Object)callSite6), () -> ((NNuU)nNuU2).yn());
        Wn.lIskpkpnr("zrvsiqli", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("hrbfbgcv", -1558909100, 748701904, 748701901, 748701910, -1558909100, -1558909100, -1558909100)[3]] = wt3;
        lv[] lvArray = new Wt[Wn.lIskpkpnr("estewv", -1558909100, 748701904, 748701895, 748701896, -1558909100, -1558909100, -1558909100)[0]];
        lvArray[Wn.lIskpkpnr("hrbfbgcv", -1558909100, 748701904, 748701899, 748701900, -1558909100, -1558909100, -1558909100)[2]] = (Wt)((Object)Wn.lIskpkpnr("estewv", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("hrbfbgcv", -1558909100, 748701904, 748701909, 748701910, -1558909100, -1558909100, -1558909100)[0]]);
        lvArray[Wn.lIskpkpnr("dskjgi", -1558909100, 748701904, 748701899, 748701900, -1558909100, -1558909100, -1558909100)[3]] = (Wt)((Object)Wn.lIskpkpnr("zrvsiqli", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("hrbfbgcv", -1558909100, 748701904, 748701909, 748701910, -1558909100, -1558909100, -1558909100)[1]]);
        CallSite callSite7 = Wn.lIskpkpnr("mragau", -1558909090, 748701937, 748701907, 748701938, -1558909090, -1558909090, -1558909090, (lY)this, (String)((Object)Wn.lIskpkpnr("ifgtbvz", -1558909100, 748701904, 748701897, 748701898, -1558909100, -1558909100, -1558909100)[4]), (lv[])lvArray);
        Wn.lIskpkpnr("ifgtbvz", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("vrbus", -1558909100, 748701904, 748701909, 748701910, -1558909100, -1558909100, -1558909100)[2]] = callSite7;
        Wn.lIskpkpnr("uuuvfhlo", -1558909089, 748701889, 748701890, 748701891, -1558909089, -1558909089, -1558909089, (List)((Object)Wn.lIskpkpnr("zrvsiqli", -1558909104, 748701919, 748701918, 748701939, -1558909104, -1558909104, -1558909104, (lj)((lj)((Object)Wn.lIskpkpnr("vrbus", -1558909102, 748701904, 748701918, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("dskjgi", -1558909100, 748701904, 748701909, 748701910, -1558909100, -1558909100, -1558909100)[3]])))), wt -> Wn.lIskpkpnr("hrbfbgcv", -1558909104, 748701892, 748701893, 748701894, -1558909104, -1558909104, -1558909104, (Wt)wt, (Wn)this));
    }

    static {
        Wn.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-7, 92, 70, 102, 118, 33, 79, -42, -65, 32, 113, 50, 3, 85, 12, -58};
        int n = 0;
        int n2 = 73;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 67;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        u = new byte[]{2, 3};
    }

    private static void s() {
        B = new boolean[]{true, false, false, true};
    }

    private static void m() {
        M = new short[]{0, 0, 0, 1};
        i = new short[]{0, 1, 2, 2, 0, 4, 0, 4};
        R = new short[]{0, 3, 2};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(-Integer.rotateLeft(Integer.rotateRight(n, 29), 15), 5), 31), 25) ^ 0x8C9883F1;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-33, -4, -124, -105, -16, 106, -89, -118, -67, -99, -84, -76, -60, -59, -49, 19};
        int n = 0;
        int n2 = 28;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 51;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-80, 62, -88, -108, 98, -21, -99, -103, 28, -37, 90, -107, 116, -42, -83, -88};
        int n = 0;
        int n2 = 49;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 193;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight((Integer.rotateLeft(n, 18) ^ 0x59935AD) + 1 ^ 0x573BE32F, 28);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateRight(-Integer.rotateRight(-Integer.rotateRight(n, 13) ^ 0xE00264EE, 28), 3), 13);
    }

    @uF(y=uA.BEFORE_ALL)
    public void N(ic ic2) {
        block3: {
            block2: {
                Wn.lIskpkpnr("ifgtbvz", -1558909104, 748701904, 748701905, 748701906, -1558909104, -1558909104, -1558909104, (Wn)this);
                if ((NNNwS)Wn.lIskpkpnr("vrbus", -1558909102, 748701911, 748701912, 748701908, -1558909102, -1558909102, -1558909102, (NNuU)((NNuU)Wn.lIskpkpnr("mragau", -1558909102, 748701904, 748701907, 748701908, -1558909102, -1558909102, -1558909102, (Wn)this)[Wn.lIskpkpnr("estewv", -1558909100, 748701904, 748701909, 748701910, -1558909100, -1558909100, -1558909100)[4]]))[Wn.lIskpkpnr("mragau", -1558909100, 748701904, 748701909, 748701910, -1558909100, -1558909100, -1558909100)[5]] == null) break block2;
                if (Wn.lIskpkpnr("mragau", -1558909104, 748701913, 748701914, 748701915, 1044647513, -492187956, -326467588, (NNNwS)((NNNwS)Wn.lIskpkpnr("rxrmeae", -1558909102, 748701911, 748701912, 748701908, -1427145713, 1692548301, -729752253, (NNuU)((NNuU)Wn.lIskpkpnr("mragau", -1558909102, 748701904, 748701907, 748701908, -1740674869, -1473051511, 233850900, (Wn)this)[Wn.lIskpkpnr("zrvsiqli", -1558909100, 748701904, 748701909, 748701910, 531017425, -1847132792, 686183248)[6]]))[Wn.lIskpkpnr("mragau", -1558909100, 748701904, 748701909, 748701910, -1203833396, -2121956771, -1806273305)[7]])) != false) break block2;
                if ((NNYH)Wn.lIskpkpnr("ifgtbvz", -1558909102, 748701911, 748701917, 748701908, -74162480, -1633456200, 1272408732, (NNuU)((NNuU)Wn.lIskpkpnr("rxrmeae", -1558909102, 748701904, 748701907, 748701908, -586965217, -1374904595, -953098715, (Wn)this)[Wn.lIskpkpnr("vrbus", -1558909100, 748701904, 748701916, 748701910, -1047814809, -1674570564, 287309485)[0]]))[Wn.lIskpkpnr("uuuvfhlo", -1558909100, 748701904, 748701916, 748701910, -1746681010, 1865860295, -1999174187)[1]] == null) break block3;
            }
            return;
        }
        Wn.lIskpkpnr("dskjgi", -1558909089, 748701889, 748701890, 748701891, 1044647513, -492187956, -326467588, (List)((List)((Object)Wn.lIskpkpnr("uuuvfhlo", -1558909104, 748701919, 748701909, 748701888, 1044647513, -492187956, -326467588, (lj)((lj)((Object)Wn.lIskpkpnr("vrbus", -1558909102, 748701904, 748701918, 748701908, 754494850, -1726024688, 1653838284, (Wn)this)[Wn.lIskpkpnr("mragau", -1558909100, 748701904, 748701916, 748701910, -585074608, 1613476101, -715411656)[2]]))))), wt -> Wn.lIskpkpnr("rxrmeae", -1558909104, 748701892, 748701893, 748701940, 1044647513, -492187956, -326467588, (Wt)wt, (ic)ic2));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-82, -21, 55, 70, 102, -6, -43, -61, 68, -99, -75, -126, -4, -9, 18, -23};
        int n = 0;
        int n2 = 1;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 181;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        I1psiI = "p\u00af\u00c8C\u00a8\u0011\u00e7\frM\u0003\u00b2SwV\u00f0E\u0084\u0099\u0088\u008f\u00a1F\u0086\u00d6J\u00b1\u0014\u0097V\"\u0012Q\u0013\u00ff\u00a7\u00e4X\u008c5\u00a5ODW\u009f\u00ca\u00f4!\u00eb\u00ca\u00f8\"\u00db\u00a7\u00e4X\u008c5\u00a5O\u007fHS\u00b0@\u00a7\u00e4X\u008c5\u00a5O]m*\u00eaS\u00af\u00a7\u00e4X\u008c5\u00a5ODM\u0006\u0080\u000b\u0086\u00d3W\u00b7\u0002\u00ad.|M*\u00e8loQu\u00ad\u00b9\u00fa\u0082\u00d4C\u00f1\u0005\u00bc\t\u007f\f(\u00f4swB\u00af\u00c8C\u00a8\u0011\u00e7\u0015gJ\b\u00b2fvJ\u00fa\u001e\u008a\u00cdL\u00f13\u00a7\u000e`V\t\u00f8r8\r\u00cf\u00ae\u0082\u00d4C\u00f1\u0005\u00bc\t\u007f\f+\u00ffjfG\u00d6\u00b7 \u00af\u00e9f\u0098\n\u009a%~\f3\u00f3;*r\u009f\u00af\u00e9f\u0098\n\u009a%~\f\b\u00c4;ON\u00f8\u00c1\u0082\u008dN\u00bf\u001e\u00afO@W\u0016\u00f4nd\u001f\u00c2\u00fb\u00a8\u00e6d\u00a4\"\u008d\r<O\u0012\u00a6)Oo\u00dd\u00f1\u0099\u00f0g\u00b3_\u00a4\n(\u0081K\u00a7\u00e4X\u008c5\u00a5O]m\u0011\u00c8\u00cc\u00ca\u00eeH\u00bf\u0006\u00a9O\u007fB\n\u00fa/LF\f\u0081\u0080\u00d6\u0019B\u00ca\u00eeH\u00bf\u0006\u00a9OfW\r\u00f1/OM\u00ea\u001e\u00d8\u00cc\u00af\u00c8C\u00a8\u0011\u00e7\frM\u0003\u00b2OaN\u0003\u0087\u0097\u0099\u000b\u0092\u001a\u00a9\u0016r\f\b\u00fcnd\u000b)\u0086\u0089\u00c7A\u00aaK\u00c0\u009c\u00af\u00e9f\u0098\n\u009a%~\f\r\u00fe;*r\u0019\u00d1\u008c\u00d0g\u00bf\u0013\u00a02\u00a7\u00e4X\u008c5\u00a5O\u007fI\u00ef\u00af\u00c8C\u00a8\u0011\u00e7\frM\u0003\u00b2OaN\u0098\u00d7\u0097\u0099\u00a4";
        OlIiItpIm = new int[]{5046282, 21692417, 2883587, 0x210001, 23920659, 5701633, 4063234, 15925260, 5767169, 0x40000D, 1441803, 0x300003, 0x1800001, 0x330001, 0x130001, 23265290, 16711700, 7012366, 22806535, 7929888, 0x22000A, 3080193, 0xAA000F, 6815745, 1310722, 6750209, 19, 15859713, 6881282, 22740993, 0x990011, 5832718, 19202086, 3407882, 12124217, 18022418, 21757967};
        Wn.m();
        Wn.b();
        Wn.s();
        Wn.T();
    }

    private static /* synthetic */ CallSite lIskpkpnr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OlIiItpIm[n2 ^ 0x2CA048D0];
        int n9 = n8 >>> 16;
        String string2 = Wn.IIInq0p0(I1psiI.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x2CA048D0);
        n8 = OlIiItpIm[n3 ^ 0x2CA048D0];
        int n10 = n8 >>> 16;
        String string3 = Wn.IIInq0p0(I1psiI.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x2CA048D0);
        n8 = OlIiItpIm[n4 ^ 0x2CA048D0];
        int n11 = n8 >>> 16;
        String string4 = Wn.IIInq0p0(I1psiI.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x2CA048D0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA314EFE6) + -178;
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

    private static /* synthetic */ void l1On0(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[37];
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
        I1psiI = stringBuilder.toString();
        OlIiItpIm = nArray;
    }

    private static /* synthetic */ String IIInq0p0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{50, -123, 102, -26, 88, -10, 57, -122, 75, 25, 93, -42, -15, 58, -94, -60};
        byte[] byArray3 = new byte[]{-57, 125, 31, -50, -97, -52, 22, 104, 76, 112, 116, 13, 0, 61, -81, 67};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite lOktmrq(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OlIiItpIm[n2 ^ 0x2CA048D0];
        int n9 = n8 >>> 16;
        String string2 = Wn.IIInq0p0(I1psiI.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x2CA048D0);
        n8 = OlIiItpIm[n3 ^ 0x2CA048D0];
        int n10 = n8 >>> 16;
        String string3 = Wn.IIInq0p0(I1psiI.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x2CA048D0);
        n8 = OlIiItpIm[n4 ^ 0x2CA048D0];
        int n11 = n8 >>> 16;
        String string4 = Wn.IIInq0p0(I1psiI.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x2CA048D0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA314EFE6) + -178;
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

    private static /* synthetic */ CallSite l1k0t(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OlIiItpIm[n2 ^ 0x2CA048D0];
        int n8 = n7 >>> 16;
        String string2 = Wn.IIInq0p0(I1psiI.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x2CA048D0);
        n7 = OlIiItpIm[n3 ^ 0x2CA048D0];
        int n9 = n7 >>> 16;
        String string3 = Wn.IIInq0p0(I1psiI.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x2CA048D0);
        n7 = OlIiItpIm[n4 ^ 0x2CA048D0];
        int n10 = n7 >>> 16;
        String string4 = Wn.IIInq0p0(I1psiI.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x2CA048D0);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA314EFE6) + -178;
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
