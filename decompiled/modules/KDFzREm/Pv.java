/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.PG;
import KDFzREm.Pn;
import KDFzREm.Pt;
import KDFzREm.Rs;
import KDFzREm.Ry;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.iS;
import KDFzREm.ih;
import KDFzREm.lY;
import KDFzREm.ld;
import KDFzREm.lv;
import KDFzREm.uF;
import KDFzREm.uY;
import KDFzREm.ue;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

@UZ(L="Flight", y=UR.MOVEMENT, N=Uz.BASE)
public class Pv
extends UM {
    private static String[] u;
    private static byte[] i;
    private static short[] R;
    private static boolean[] M;
    private static short[] B;
    public Object[] L;
    private static /* synthetic */ String llqji0;
    private static /* synthetic */ int[] Olikmii;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight((Integer.rotateLeft(n, 17) ^ 0x941AE19) + 1, 17), 8), 13), 15);
    }

    private static void P() {
        u = new String[]{"multi-jump", "vanilla", "motion", "mode"};
    }

    private static void T() {
        i = new byte[]{3, 2, 4};
    }

    public Pv() {
        Pv.OOlsql("pdsjubr", -859653741, 1208747145, 1208747148, 1208747151, -859653741, (Pv)this);
        Pt pt = new Pt(this, (String)((Object)Pv.OOlsql("plylin", -859653737, 1208747145, 1208747143, 1208747142, -859653737)[0]), (boolean)Pv.OOlsql("bkbbzym", -859653737, 1208747145, 1208747161, 1208747160, -859653737)[0]);
        Pv.OOlsql("yzjz", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("plylin", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[0]] = pt;
        PG pG = new PG(this, (String)((Object)Pv.OOlsql("bkbbzym", -859653737, 1208747145, 1208747143, 1208747142, -859653737)[1]), (boolean)Pv.OOlsql("uhnvk", -859653737, 1208747145, 1208747161, 1208747160, -859653737)[1]);
        Pv.OOlsql("shne", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("jaizp", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[1]] = pG;
        Pn pn = new Pn(this, (String)((Object)Pv.OOlsql("uhnvk", -859653737, 1208747145, 1208747143, 1208747142, -859653737)[2]), (boolean)Pv.OOlsql("syxqsh", -859653737, 1208747145, 1208747161, 1208747160, -859653737)[2]);
        Pv.OOlsql("pdsjubr", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("shne", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[2]] = pn;
        lv[] lvArray = new ue[Pv.OOlsql("plylin", -859653737, 1208747145, 1208747146, 1208747149, -859653737)[0]];
        lvArray[Pv.OOlsql("ggbogq", -859653737, 1208747145, 1208747161, 1208747160, -859653737)[3]] = (ue)((Object)Pv.OOlsql("syxqsh", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("jaizp", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[3]]);
        lvArray[Pv.OOlsql("jaizp", -859653737, 1208747145, 1208747161, 1208747160, -859653737)[4]] = (ue)((Object)Pv.OOlsql("pdsjubr", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("syxqsh", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[4]]);
        lvArray[Pv.OOlsql("uhnvk", -859653737, 1208747145, 1208747146, 1208747149, -859653737)[1]] = (ue)((Object)Pv.OOlsql("yzjz", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("plylin", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[5]]);
        CallSite callSite = Pv.OOlsql("bkbbzym", -859653731, 1208747162, 1208747165, 1208747164, -859653731, (lY)this, (String)((Object)Pv.OOlsql("uhnvk", -859653737, 1208747145, 1208747143, 1208747142, -859653737)[3]), (lv[])lvArray);
        Pv.OOlsql("shne", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("jaizp", -859653737, 1208747145, 1208747163, 1208747137, -859653737)[6]] = callSite;
        CallSite callSite2 = Pv.OOlsql("jaizp", -859653732, 1208747166, 1208747153, 1208747152, -859653732, (List)((Object)Pv.OOlsql("yzjz", -859653741, 1208747136, 1208747144, 1208747167, -859653741, (ld)((ld)((Object)Pv.OOlsql("mmiygsln", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this)[Pv.OOlsql("ujzry", -859653737, 1208747145, 1208747150, 1208747137, -859653737)[0]])))));
        while (Pv.OOlsql("bkbbzym", -859653732, 1208747155, 1208747154, 1208747157, -859653732, (Iterator)((Object)callSite2)) != false) {
            lv lv2 = (lv)((Object)Pv.OOlsql("mmiygsln", -859653732, 1208747155, 1208747156, 1208747139, -859653732, (Iterator)((Object)callSite2)));
            if (!(lv2 instanceof uY)) continue;
            uY uY2 = (uY)((Object)lv2);
            Pv.OOlsql("bkbbzym", -859653732, 1208747159, 1208747165, 1208747140, -859653732, (uY)uY2, (Object)this);
        }
    }

    static {
        Pv.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{6, 104, 41, 5, -2, -85, 100, 114, -61, -47, -68, 96, -4, -62, -23, -44};
        int n = 0;
        int n2 = 240;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 213;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        R = new short[]{0, 1, 2, 0, 1, 2, 3};
        B = new short[]{3, 3, 3, 3, 3};
    }

    private static void s() {
        M = new boolean[]{true, false, false, false, true};
    }

    private void m() {
        if (Pv.OOlsql("shne", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this) == null) {
            Pv.OOlsql("uhnvk", -859653744, 1208747145, 1208747144, 1208747147, -859653744, (Pv)this, (Object[])new Object[Pv.OOlsql("zncc", -859653737, 1208747145, 1208747146, 1208747149, -859653737)[2]]);
            CallSite callSite = Pv.OOlsql("pdsjubr", -859653743, 1208747145, 1208747144, 1208747147, -859653743, (Pv)this);
        }
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 24) ^ 0xB82EE53E, 27), 5), 22), 18) ^ 0x370E4FAC;
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{43, -23, -83, 49, -14, -73, -9, 7, 1, 81, 32, -38, 120, -79, 89, -117};
        int n = 0;
        int n2 = 170;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 5;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateLeft(-n, 2) ^ 0x90C95A53, 14) ^ 0xA61E1935;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-123, -119, 75, -7, -84, -101, -82, -91, -66, -114, 6, 119, -45, -88, -7, -114};
        int n = 0;
        int n2 = 120;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 111;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(ih ih2) {
        Pv.OOlsql("vdrfkwcp", -859653741, 1208747145, 1208747148, 1208747151, 684334173, (Pv)this);
        Pv.OOlsql("ujzry", -859653741, 1208747138, 1208747141, 1208747140, 684334173, (ue)((ue)((Object)Pv.OOlsql("shne", -859653741, 1208747136, 1208747146, 1208747139, 684334173, (ld)((ld)((Object)Pv.OOlsql("zncc", -859653743, 1208747145, 1208747144, 1208747147, 950183608, (Pv)this)[Pv.OOlsql("plylin", -859653737, 1208747145, 1208747150, 1208747137, -1684059897)[4]]))))), (Object)ih2);
    }

    @uF
    public void N(Rs rs) {
        Pv.OOlsql("plylin", -859653741, 1208747145, 1208747148, 1208747151, 684334173, (Pv)this);
        Pv.OOlsql("ggbogq", -859653741, 1208747138, 1208747141, 1208747140, 684334173, (ue)((ue)((Object)Pv.OOlsql("jaizp", -859653741, 1208747136, 1208747146, 1208747139, 684334173, (ld)((ld)((Object)Pv.OOlsql("bkbbzym", -859653743, 1208747145, 1208747144, 1208747147, 813349308, (Pv)this)[Pv.OOlsql("ujzry", -859653737, 1208747145, 1208747150, 1208747137, -1187016193)[3]]))))), (Object)rs);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 12), 17), 22), 20), 27);
    }

    @uF
    public void N(iS iS2) {
        Pv.OOlsql("pdsjubr", -859653741, 1208747145, 1208747148, 1208747151, 684334173, (Pv)this);
        Pv.OOlsql("ujzry", -859653741, 1208747138, 1208747141, 1208747140, 684334173, (ue)((ue)((Object)Pv.OOlsql("shne", -859653741, 1208747136, 1208747146, 1208747139, 684334173, (ld)((ld)((Object)Pv.OOlsql("vdrfkwcp", -859653743, 1208747145, 1208747144, 1208747147, 268713485, (Pv)this)[Pv.OOlsql("zncc", -859653737, 1208747145, 1208747150, 1208747137, -944909576)[2]]))))), (Object)iS2);
    }

    @uF
    public void N(Ry ry) {
        Pv.OOlsql("bkbbzym", -859653741, 1208747145, 1208747148, 1208747151, 684334173, (Pv)this);
        Pv.OOlsql("plylin", -859653741, 1208747138, 1208747141, 1208747140, 684334173, (ue)((ue)((Object)Pv.OOlsql("poqcpliq", -859653741, 1208747136, 1208747146, 1208747139, 684334173, (ld)((ld)((Object)Pv.OOlsql("pdsjubr", -859653743, 1208747145, 1208747144, 1208747147, 270640182, (Pv)this)[Pv.OOlsql("vdrfkwcp", -859653737, 1208747145, 1208747150, 1208747137, 580837041)[1]]))))), (Object)ry);
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-43, 94, -107, -55, -43, -124, 22, 127, -119, -113, 41, -58, -74, -101, -20, 83};
        int n = 0;
        int n2 = 5;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 127;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        llqji0 = "\u008f\u00ca\u00efu\u00b3\u00d9\u00f6OSs,$y\u00ce\u00ac\u00f4\u00e7\u0094\u00c2\u0011\u009b\u00fe\u00e2z9Mw:I\u009b\u0087\u00a5\u00dd\u00ae\u00e8z\u00b1\u00e5\u00deX{1o>\u001b\u00dc\u00ac\u00d5\u00c2\u00a4\u00d9l\u00b2\u00f2\u00a3qr%1(\u008ar\u009d\u00fe\u00fa|9kw!L\u00da\u00ac\u00f7\u0001t\u0098\u0002\u00c2H\u0096\u00b0\u00f9i\u007fr,\u0004I\u0086\u0094\b\u00efT\u0096\u00e9\u00ed2z\u007fm/\u000f\u00ba\u0082\u00f4\u009dC\u00d7\u0005\u00de\u00c9\u00db\u00e7x\u008d\u00cd\u00c9p9rg\u00bd\u00efT\u0096\u00e9\u00ed2z\u007fm/\u000f\u00ba\u0082\u00f4e\u0085\u00d7\u0005\u0085(\u008ar\u009d\u00fe\u00fa|9rb&G\u00da\u00af\u00fc\u00ece\u00c0J\u00ccC\u00e7x\u008d\u00cd\u00c9p9kZ^\u00e7x\u008d\u00cd\u00c9p9Nu(\u008ah}\u008e\u00d7[\u0085\u00fe\u00f8rd\u00be\u00e7x\u008d\u00cd\u00c9p9kf\u0010Zj\u00c2H\u0096\u00b0\u00f9i\u007fr,\u0001T\u0090\u0092\u00ff\u00f2o\u00d1\u0090\u00e1N\u00c6F\u0083\u00bc\u00f0*`\u008adM\u00efT\u0096\u00e9\u00ed2z\u007fm/\u000f\u00a6\u0094\u00ec\u00d9x\u00c4\u0005\u00b8\u008ar\u009d\u00fe\u00fa|9kw!L\u00da\u00a9\u00ea\u0000\u00e2\u00c2J\u0098\u00ed\u00b7X2\u00e7x\u008d\u00cd\u00c9p9rh\u00b4\u009d\u00c2M\u00b9\u00fa\u00f4iM\u00f9";
        Olikmii = new int[]{0xAC000A, 13434881, 7995411, 0xCC0001, 0xE00002, 1, 11927555, 15204353, 15073282, 0x70000A, 9306132, 12713994, 3801089, 5963797, 12124161, 15466515, 0x1150001, 19398658, 0x1200001, 18219018, 9240577, 65593, 3866642, 5046286, 12189704, 16711702, 13500434, 18939911, 15269891, 14811140, 0xA2000A};
        Pv.b();
        Pv.T();
        Pv.s();
        Pv.P();
    }

    private static /* synthetic */ CallSite OOrqm0lr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = Olikmii[n2 ^ 0x480C0489];
        int n9 = n8 >>> 16;
        String string2 = Pv.oojrOsm(llqji0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x480C0489);
        n8 = Olikmii[n3 ^ 0x480C0489];
        int n10 = n8 >>> 16;
        String string3 = Pv.oojrOsm(llqji0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x480C0489);
        n8 = Olikmii[n4 ^ 0x480C0489];
        int n11 = n8 >>> 16;
        String string4 = Pv.oojrOsm(llqji0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x480C0489);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCCC2B925) + -178;
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

    private static /* synthetic */ String oojrOsm(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-95, -55, 106, 67, 71, -40, -76, -73, -87, -73, -23, -127, -95, 84, 70, 49};
        byte[] byArray3 = new byte[]{-74, 113, 49, 47, -5, 10, -78, -43, -71, 9, 50, -111, -35, -107, 83, -108};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void OlIIpt(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[31];
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
        llqji0 = stringBuilder.toString();
        Olikmii = nArray;
    }

    private static /* synthetic */ CallSite OOlsql(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Olikmii[n2 ^ 0x480C0489];
        int n7 = n6 >>> 16;
        String string2 = Pv.oojrOsm(llqji0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x480C0489);
        n6 = Olikmii[n3 ^ 0x480C0489];
        int n8 = n6 >>> 16;
        String string3 = Pv.oojrOsm(llqji0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x480C0489);
        n6 = Olikmii[n4 ^ 0x480C0489];
        int n9 = n6 >>> 16;
        String string4 = Pv.oojrOsm(llqji0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x480C0489);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCCC2B925) + -178;
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

    private static /* synthetic */ CallSite OlqsjmOO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Olikmii[n2 ^ 0x480C0489];
        int n7 = n6 >>> 16;
        String string2 = Pv.oojrOsm(llqji0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x480C0489);
        n6 = Olikmii[n3 ^ 0x480C0489];
        int n8 = n6 >>> 16;
        String string3 = Pv.oojrOsm(llqji0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x480C0489);
        n6 = Olikmii[n4 ^ 0x480C0489];
        int n9 = n6 >>> 16;
        String string4 = Pv.oojrOsm(llqji0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x480C0489);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCCC2B925) + -178;
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
