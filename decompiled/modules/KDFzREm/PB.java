/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.RB;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.ih;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.uA;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="Sprint", y=UR.MOVEMENT, N=Uz.BASE)
public class PB
extends UM {
    public Object[] L;
    private static boolean[] u;
    private static String[] i;
    private static short[] R;
    private static /* synthetic */ String OOltiq;
    private static /* synthetic */ int[] IlnIn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 9), 23), 9), 15), 3), 17), 10);
    }

    private static void P() {
        u = new boolean[]{false, true};
    }

    private static void T() {
        R = new short[]{0, 0};
    }

    public PB() {
        PB.OOksO("wyievd", -1372703930, 1537345497, 1537345500, 1537345503, -1372703930, (PB)this);
        CallSite callSite = PB.OOksO("pioxcev", -1372703928, 1537345488, 1537345491, 1537345490, -1372703928, (lY)this, (String)((Object)PB.OOksO("fffsqcvc", -1372703934, 1537345497, 1537345502, 1537345489, -1372703934)[0]), (boolean)PB.OOksO("ddfaqnl", -1372703934, 1537345497, 1537345498, 1537345501, -1372703934)[0]);
        PB.OOksO("ftteehn", -1372703932, 1537345497, 1537345496, 1537345499, -1372703932, (PB)this)[PB.OOksO("bplld", -1372703934, 1537345497, 1537345493, 1537345492, -1372703934)[0]] = callSite;
    }

    static {
        PB.ntfClinit();
    }

    private static void s() {
        i = new String[]{"ignore-hunger"};
    }

    private void m() {
        if (PB.OOksO("ddfaqnl", -1372703932, 1537345497, 1537345496, 1537345499, -1372703932, (PB)this) == null) {
            PB.OOksO("ddfaqnl", -1372703931, 1537345497, 1537345496, 1537345499, -1372703931, (PB)this, (Object[])new Object[PB.OOksO("ftteehn", -1372703934, 1537345497, 1537345498, 1537345501, -1372703934)[1]]);
            CallSite callSite = PB.OOksO("wyievd", -1372703932, 1537345497, 1537345496, 1537345499, -1372703932, (PB)this);
        }
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{118, -88, -96, 125, -77, -7, -90, 67, -45, -35, -20, 82, 81, -27, 70, 32};
        int n = 0;
        int n2 = 127;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 21;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(-n ^ 0x18065EEA, 7), 24), 17);
    }

    @uF
    public void N(RB rB) {
        PB.OOksO("ddfaqnl", -1372703930, 1537345497, 1537345500, 1537345503, 1492988086, (PB)this);
        PB.OOksO("fffsqcvc", -1372703930, 1537345482, 1537345491, 1537345485, 1492988086, (RB)rB, (boolean)PB.OOksO("usuyywqf", -1372703930, 1537345481, 1537345480, 1537345483, 1492988086, (Boolean)((Boolean)((Object)PB.OOksO("mbcsw", -1372703930, 1537345495, 1537345502, 1537345494, 1492988086, (lT)((lT)((Object)PB.OOksO("usuyywqf", -1372703932, 1537345497, 1537345496, 1537345499, 1529272536, (PB)this)[PB.OOksO("ddfaqnl", -1372703934, 1537345497, 1537345493, 1537345492, -222210113)[1]])))))));
    }

    @uF(y=uA.AFTER)
    public void N(ih ih2) {
        PB.OOksO("bplld", -1372703930, 1537345484, 1537345487, 1537345486, 1492988086, (ih)ih2, (boolean)PB.OOksO("fffsqcvc", -1372703930, 1537345484, 1537345502, 1537345483, 1492988086, (ih)ih2));
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n ^ 0x7A076F00, 22), 18), 4);
    }

    private static /* synthetic */ void ntfClinit() {
        OOltiq = "\u00d32\u0083\u008b\u0011\u009cX\u00fc\u00cd\u001b%E\u00b8\u0084\u00c9\u00827\u00ca\u00d4\u001a\u000e\u0010\u00ba\u0083\u00a7\u00eb,\u00beC\n\u0094U\u00c2\u00d9$\u001a/\u0085\u00e9\u00a6\u009dE\u00b0\u0012\u00ecT\u00b91\u00ea\u00fe0/E\u00bb\u00b2\u00b8\u00ad\u0010\u009bC\u00d7\u000b\u0094U\u00c2\u00d9$\u001a/\u0085\u00e9\u00a6\u0090E\u00e6\u00f1R\u00ec\u00fe()E\u0084\u00a7\u00a4\u00a3Q\u00b3\u001a\u00e7\u00ab\u00bbj\u00bd3\u00d6\u009cX\u00fc\u00cd\u001b%E\u0084\u00ad\u00804\u00827\u00ca\u00d4\u001a\u000e\u0010\u00ba\u0083\u00a7\u00eb\u0017\u0094C\u00d6\u00b7q\u00ea\u00fa?&<\u0089\u00aa\u00bf\u00a1u\u00f8\u00a6\u009cX\u00fc\u00cd\u001b%E\u0081\u00ae\u0013\u0094t\u00e7\u00e9?g\u0006\u0089\u00a8\u00ad\u00eb-\u0088\n\u00b1&\u00bf%\u008d\u00ba\u0082(\u00f1D0\u00b9h\u00e7\u00b02)\u0004\u008f\u00e9\u0088\u00ab\u0011\u0090\u001d\u00b94V\u00f1H[\u0094t\u00e7\u00e9?g\u0006\u0089\u00a8\u00ad\u00eb1\u009e\u0012\u00e8c\u00ac%`\u009cX\u00fc\u00cd\u001b%E\u0084\u0092\u00ed\u009cX\u00fc\u00cd\u001b%E\u00ba\u0084";
        IlnIn = new int[]{262154, 8781825, 12451859, 1, 10813442, 6881281, 0xBB0003, 8716289, 9502739, 6225930, 10747905, 1900589, 65537, 131074, 13697034, 4849684, 0xAA0011, 7929868, 10944515, 14352394, 917519, 8847370, 6160385, 6946831};
        PB.T();
        PB.P();
        PB.s();
    }

    private static /* synthetic */ CallSite l1slppl(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = IlnIn[n2 ^ 0x5BA207D9];
        int n10 = n9 >>> 16;
        String string2 = PB.lIrkmnql(OOltiq.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x5BA207D9);
        n9 = IlnIn[n3 ^ 0x5BA207D9];
        int n11 = n9 >>> 16;
        String string3 = PB.lIrkmnql(OOltiq.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x5BA207D9);
        n9 = IlnIn[n4 ^ 0x5BA207D9];
        int n12 = n9 >>> 16;
        String string4 = PB.lIrkmnql(OOltiq.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x5BA207D9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE2E33F0) + -178;
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

    private static /* synthetic */ CallSite lO0rk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = IlnIn[n2 ^ 0x5BA207D9];
        int n10 = n9 >>> 16;
        String string2 = PB.lIrkmnql(OOltiq.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0x5BA207D9);
        n9 = IlnIn[n3 ^ 0x5BA207D9];
        int n11 = n9 >>> 16;
        String string3 = PB.lIrkmnql(OOltiq.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0x5BA207D9);
        n9 = IlnIn[n4 ^ 0x5BA207D9];
        int n12 = n9 >>> 16;
        String string4 = PB.lIrkmnql(OOltiq.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0x5BA207D9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE2E33F0) + -178;
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

    private static /* synthetic */ void OOpjp(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[24];
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
        OOltiq = stringBuilder.toString();
        IlnIn = nArray;
    }

    private static /* synthetic */ CallSite lIk00isil(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = IlnIn[n2 ^ 0x5BA207D9];
        int n8 = n7 >>> 16;
        String string2 = PB.lIrkmnql(OOltiq.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x5BA207D9);
        n7 = IlnIn[n3 ^ 0x5BA207D9];
        int n9 = n7 >>> 16;
        String string3 = PB.lIrkmnql(OOltiq.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x5BA207D9);
        n7 = IlnIn[n4 ^ 0x5BA207D9];
        int n10 = n7 >>> 16;
        String string4 = PB.lIrkmnql(OOltiq.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x5BA207D9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE2E33F0) + -178;
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

    private static /* synthetic */ CallSite OOksO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = IlnIn[n2 ^ 0x5BA207D9];
        int n7 = n6 >>> 16;
        String string2 = PB.lIrkmnql(OOltiq.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x5BA207D9);
        n6 = IlnIn[n3 ^ 0x5BA207D9];
        int n8 = n6 >>> 16;
        String string3 = PB.lIrkmnql(OOltiq.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x5BA207D9);
        n6 = IlnIn[n4 ^ 0x5BA207D9];
        int n9 = n6 >>> 16;
        String string4 = PB.lIrkmnql(OOltiq.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x5BA207D9);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xAE2E33F0) + -178;
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

    private static /* synthetic */ String lIrkmnql(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{125, -91, 29, -77, 86, -32, 53, 95, -66, -112, -100, 97, 3, -55, 39, -37};
        byte[] byArray3 = new byte[]{-126, -1, -110, 63, 59, -45, 10, -105, -108, 51, 82, -110, -124, 17, 13, -107};
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
