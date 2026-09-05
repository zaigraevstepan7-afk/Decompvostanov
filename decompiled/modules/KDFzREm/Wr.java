/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.Wh;
import KDFzREm.il;
import KDFzREm.iw;
import KDFzREm.mL;
import KDFzREm.mN;
import KDFzREm.my;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@UZ(L="ClickAction", y=UR.MISC, N=Uz.BASE)
public class Wr
extends UM {
    private static short[] u;
    private static boolean[] i;
    public Object[] L;
    private static /* synthetic */ String lItrOjtjm;
    private static /* synthetic */ int[] lIp0p;

    private static void P() {
        u = new short[]{0, 0, 0};
    }

    public Wr() {
        Wr.lOOrli("cwypqr", -1607859679, 1638555583, 1638555582, 1638555581, -1607859679, -1607859679, -1607859679, (Wr)this);
        ArrayList arrayList = new ArrayList();
        Wr.lOOrli("atpth", -1607859677, 1638555583, 1638555580, 1638555579, -1607859677, -1607859677, -1607859677, (Wr)this)[Wr.lOOrli("swtopw", -1607859675, 1638555583, 1638555578, 1638555577, -1607859675, -1607859675, -1607859675)[0]] = arrayList;
        Wr.lOOrli("swtopw", -1607859679, 1638555583, 1638555567, 1638555563, -1607859679, -1607859679, -1607859679, (Wr)this, (Wh)new mN(this));
        Wr.lOOrli("bdenujp", -1607859679, 1638555583, 1638555567, 1638555563, -1607859679, -1607859679, -1607859679, (Wr)this, (Wh)new my(this));
        Wr.lOOrli("eadns", -1607859679, 1638555583, 1638555567, 1638555563, -1607859679, -1607859679, -1607859679, (Wr)this, (Wh)new mL(this));
    }

    static {
        Wr.ntfClinit();
    }

    private void s() {
        if (Wr.lOOrli("eadns", -1607859677, 1638555583, 1638555580, 1638555579, -1607859677, -1607859677, -1607859677, (Wr)this) == null) {
            Wr.lOOrli("swtopw", -1607859678, 1638555583, 1638555580, 1638555579, -1607859678, -1607859678, -1607859678, (Wr)this, (Object[])new Object[Wr.lOOrli("bdenujp", -1607859675, 1638555583, 1638555562, 1638555561, -1607859675, -1607859675, -1607859675)[0]]);
            CallSite callSite = Wr.lOOrli("hqnhvv", -1607859677, 1638555583, 1638555580, 1638555579, -1607859677, -1607859677, -1607859677, (Wr)this);
        }
    }

    private static void m() {
        i = new boolean[]{true};
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(-Integer.rotateRight(n, 31), 1) ^ 0x388E79E0;
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 12), 11), 5) ^ 0x146D37E5, 13), 14), 31), 15);
    }

    private void N(Wh wh) {
        Wr.lOOrli("twrqfkyy", -1607859679, 1638555583, 1638555582, 1638555581, -1607859679, -1607859679, -1607859679, (Wr)this);
        Wr.lOOrli("bdenujp", -1607859666, 1638555576, 1638555565, 1638555564, -1607859666, -1607859666, -1607859666, (List)((List)((Object)Wr.lOOrli("znhj", -1607859677, 1638555583, 1638555580, 1638555579, -1607859677, -1607859677, -1607859677, (Wr)this)[Wr.lOOrli("bdenujp", -1607859675, 1638555583, 1638555578, 1638555577, -1607859675, -1607859675, -1607859675)[2]])), (Object)wh);
    }

    @uF(u=true)
    public void N(iw iw2) {
        Wr.lOOrli("twrqfkyy", -1607859679, 1638555583, 1638555582, 1638555581, -1607859679, -1607859679, -1607859679, (Wr)this);
        CallSite callSite = Wr.lOOrli("bdenujp", -1607859666, 1638555576, 1638555575, 1638555574, -1607859666, -1607859666, -1607859666, (List)((List)((Object)Wr.lOOrli("znhj", -1607859677, 1638555583, 1638555580, 1638555579, -1607859677, -1607859677, -1607859677, (Wr)this)[Wr.lOOrli("cqkjnqx", -1607859675, 1638555583, 1638555578, 1638555577, -1607859675, -1607859675, -1607859675)[1]])));
        while (Wr.lOOrli("ynzvec", -1607859666, 1638555573, 1638555572, 1638555571, -1607859666, -1607859666, -1607859666, (Iterator)((Object)callSite)) != false) {
            Wh wh = (Wh)((Object)Wr.lOOrli("swtopw", -1607859666, 1638555573, 1638555570, 1638555569, -1607859666, -1607859666, -1607859666, (Iterator)((Object)callSite)));
            Wr.lOOrli("twrqfkyy", -1607859679, 1638555568, 1638555567, 1638555566, -1607859679, -1607859679, -1607859679, (Wh)wh, (il)iw2);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        lItrOjtjm = "\u00d5L\u00e7\u0095\u008a\u00a6Z\u00a7\u00ff\u00ee\u0005\u0006\u00b6\u00a0N\u00dc\u00d0_\u00fbL\u00e2\u00ba\u00c0\u00abZ\u00e7\u00a0\u0004\u00cb\u00b9a\u00da\u00b0\u00e3\u00a9|\u008b\u00fe\u00ee%\u001e\u00e8\u00fbydI\u00f5\fY\u00f4\u0086\u00c4\u00a7A\u00bcaa\u00fb\u0095\u00d3\u00b2\u0001\u00a2\u00f2\u00af+]\u009c\u00b0E\u009bYY\u00aa\u00d4\u0004\u00dd\u009e\u00c4\u00a5O\u00e1\u00ff\u00a0\"\u0015\u00fc\u009dM\u00ec\u0099N\u00e5\u00cf\u00d2H\u00e9\u0080\u008c~\u00e2,L\u00e7\u0095\u008a\u00a6Z\u00a7\u00ff\u00ee\u0000\u001b\u00a0\u00a6-\u0004\u00c7\u00ad\u008cw\u00fb(a\u00fb\u0095\u00d3\u00b2\u0001\u00a2\u00f2\u00af+]\u009c\u00b0E\u00cdcY\u00aa\u00dd\u00ffLdi\u00d7\u008e\u00f7\u0096C\u00e1\u00c4\u00a9\u0012a\u00da\u00b0\u00e3\u00a9|\u008b\u00fe\u00ee\u001b\u001a\u00e8\u00fby\u00a8i\u00d7\u008e\u00f7\u0096C\u00e1\u00c4\u00b3\u00ec\u0004\u00dd\u009e\u00c4\u00a5O\u00e1\u00e6\u00b5%\u001e\u00fc\u009b[\u00ce\u00b6L\u00e5\u009b\u00d7\u00e8";
        lIp0p = new int[]{0xA9000A, 6553601, 0x730003, 9371649, 3604499, 0x190001, 0x620002, 6619150, 3080200, 11730966, 18, 1179655, 1703939, 6160388, 4849684, 0x90000A, 7733249, 1900559, 2883587, 7995413, 10092559, 7929857, 0x770002};
        Wr.P();
        Wr.m();
    }

    private static /* synthetic */ CallSite lOOrli(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIp0p[n2 ^ 0x61AA5FBF];
        int n9 = n8 >>> 16;
        String string2 = Wr.IIO0Om(lItrOjtjm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x61AA5FBF);
        n8 = lIp0p[n3 ^ 0x61AA5FBF];
        int n10 = n8 >>> 16;
        String string3 = Wr.IIO0Om(lItrOjtjm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x61AA5FBF);
        n8 = lIp0p[n4 ^ 0x61AA5FBF];
        int n11 = n8 >>> 16;
        String string4 = Wr.IIO0Om(lItrOjtjm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x61AA5FBF);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA02A0297) + -178;
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

    private static /* synthetic */ void Ol0rq(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[23];
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
        lItrOjtjm = stringBuilder.toString();
        lIp0p = nArray;
    }

    private static /* synthetic */ CallSite I1nljrjim(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lIp0p[n2 ^ 0x61AA5FBF];
        int n9 = n8 >>> 16;
        String string2 = Wr.IIO0Om(lItrOjtjm.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x61AA5FBF);
        n8 = lIp0p[n3 ^ 0x61AA5FBF];
        int n10 = n8 >>> 16;
        String string3 = Wr.IIO0Om(lItrOjtjm.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x61AA5FBF);
        n8 = lIp0p[n4 ^ 0x61AA5FBF];
        int n11 = n8 >>> 16;
        String string4 = Wr.IIO0Om(lItrOjtjm.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x61AA5FBF);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA02A0297) + -178;
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

    private static /* synthetic */ CallSite IIkiijs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lIp0p[n2 ^ 0x61AA5FBF];
        int n7 = n6 >>> 16;
        String string2 = Wr.IIO0Om(lItrOjtjm.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x61AA5FBF);
        n6 = lIp0p[n3 ^ 0x61AA5FBF];
        int n8 = n6 >>> 16;
        String string3 = Wr.IIO0Om(lItrOjtjm.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x61AA5FBF);
        n6 = lIp0p[n4 ^ 0x61AA5FBF];
        int n9 = n6 >>> 16;
        String string4 = Wr.IIO0Om(lItrOjtjm.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x61AA5FBF);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA02A0297) + -178;
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

    private static /* synthetic */ CallSite Ilsrp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lIp0p[n2 ^ 0x61AA5FBF];
        int n8 = n7 >>> 16;
        String string2 = Wr.IIO0Om(lItrOjtjm.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x61AA5FBF);
        n7 = lIp0p[n3 ^ 0x61AA5FBF];
        int n9 = n7 >>> 16;
        String string3 = Wr.IIO0Om(lItrOjtjm.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x61AA5FBF);
        n7 = lIp0p[n4 ^ 0x61AA5FBF];
        int n10 = n7 >>> 16;
        String string4 = Wr.IIO0Om(lItrOjtjm.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x61AA5FBF);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xA02A0297) + -178;
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

    private static /* synthetic */ String IIO0Om(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{99, -36, -14, 6, 37, -97, -15, -21, -16, 102, -89, -128, 76, -76, -33, 89};
        byte[] byArray3 = new byte[]{-125, 25, 62, -1, 25, 119, -112, 61, -56, -27, 115, 51, 47, 14, 10, 103};
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
