/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.F;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class r {
    private static short[] y;
    public Object[] N;
    private static boolean[] L;
    private static /* synthetic */ String l1qkjs;
    private static /* synthetic */ int[] OOkpptril;

    private static void L() {
        L = new boolean[]{true};
    }

    public r() {
        r.I1lkqlrs("vhts", 213987854, 1110267679, 1110267678, 1110267677, 213987854, 213987854, (r)this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r.I1lkqlrs("vxfn", 213987852, 1110267679, 1110267676, 1110267675, 213987852, 213987852, (r)this)[r.I1lkqlrs("hpfkpea", 213987850, 1110267679, 1110267674, 1110267673, 213987850, 213987850)[0]] = linkedHashMap;
    }

    static {
        r.ntfClinit();
    }

    private void u() {
        if (r.I1lkqlrs("egypqsvr", 213987852, 1110267679, 1110267676, 1110267675, 213987852, 213987852, (r)this) == null) {
            r.I1lkqlrs("mhap", 213987853, 1110267679, 1110267676, 1110267675, 213987853, 213987853, (r)this, (Object[])new Object[r.I1lkqlrs("wdhlww", 213987850, 1110267679, 1110267663, 1110267659, 213987850, 213987850)[0]]);
            CallSite callSite = r.I1lkqlrs("hpfkpea", 213987852, 1110267679, 1110267676, 1110267675, 213987852, 213987852, (r)this);
        }
    }

    private static /* synthetic */ int y(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(n, 13), 1), 8), 20);
    }

    private static void y() {
        y = new short[]{0, 0, 0, 0};
    }

    public Collection<F> N() {
        return r.I1lkqlrs("mhap", 213987841, 1110267672, 1110267666, 1110267665, 213987841, 213987841, (Map)((Map)((Object)r.I1lkqlrs("gamxqo", 213987852, 1110267679, 1110267676, 1110267675, 213987852, 213987852, (r)this)[r.I1lkqlrs("qpdnbg", 213987850, 1110267679, 1110267674, 1110267673, 213987850, 213987850)[3]])));
    }

    public Optional<F> N(String string) {
        return r.I1lkqlrs("qpdnbg", 213987840, 1110267669, 1110267668, 1110267667, 1104199772, -1090592233, (Object)((F)((Object)r.I1lkqlrs("nnrs", 213987841, 1110267672, 1110267671, 1110267670, 1104199772, -1090592233, (Map)((Map)((Object)r.I1lkqlrs("hpfkpea", 213987852, 1110267679, 1110267676, 1110267675, 1246455863, -1197313228, (r)this)[r.I1lkqlrs("qpdnbg", 213987850, 1110267679, 1110267674, 1110267673, 1126597640, -1128247841)[2]])), (Object)string))));
    }

    public void N(F f2) {
        if (r.I1lkqlrs("gamxqo", 213987854, 1110267664, 1110267663, 1110267662, 213987854, 213987854, (F)f2) != null) {
            r.I1lkqlrs("vhts", 213987841, 1110267672, 1110267661, 1110267660, 213987841, 213987841, (Map)((Map)((Object)r.I1lkqlrs("qpdnbg", 213987852, 1110267679, 1110267676, 1110267675, 213987852, 213987852, (r)this)[r.I1lkqlrs("hpfkpea", 213987850, 1110267679, 1110267674, 1110267673, 213987850, 213987850)[1]])), (Object)r.I1lkqlrs("hpfkpea", 213987854, 1110267664, 1110267663, 1110267662, 213987854, 213987854, (F)f2), (Object)f2);
        }
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(-n, 17), 19), 18), 3), 25);
    }

    private static /* synthetic */ void ntfClinit() {
        l1qkjs = "\u00f3\u00f4\u009e\u00e5h\u00f0-\u00e7\u00b4)f\u00bc\u00edg\u00ce\u0004\u00eb\u00f97<|\u00af\u00d7\u00f3\u0006\u007f\u0096\u00c9s\u00d4\t\u00a5\u00f7:7\u0098\u00a7\u001f.@eG\u00ae\u0098\u001a\u0089v\u00bb\u00cfg\u00c7\u001b\u0094\u00bf\u00d7$\u00f3\u00f5\u00e7\u009e\u00e5h\u00f0-\u00e7\u00b4\u001dL\u00bb\u00d5s\u008d\u001d\u00fe\u00f27v\u00b2\u00e9 \u000eh\u0096\u00c9s\u00d4\t\u00a5\u00f7:7\u0098\u00a7\u001f.@<#\u00ae\u0098^\u00c8\t\u00fc\u00fat5\u009e\u00e67ce;*\u00bf\u00c0f\u0099A\u00c6\u00f1:/\u009e\u00a7<-D>o\u0095\u00c1x\u00c7\u000b\u00fe\u00a0\u00f1\u00bb\u00d5s\u008d\u001d\u00fe\u00f27v\u00b0\u00f8$%E\u00dc\u00fa\u00b6\u00e3\u0096\u00c9s\u00d4\t\u00a5\u00f7:7\u0098\u00a7\u001f.@\u0002\u00a8\u00ae\u0098;\u00ee\u0002\u00eb\u00ed:v\u0093\u00e9>+\u0005(\u00a9\u00b0\u00c6q\u00d6S\u00ae\u00f3\u00efx\u00c3\u001e\u00eb\u00b478\u0091\u00ef\u007f\u001f^\u00a5\u00ef\u00b4\u00c4)\u0082\u00f3\u00efx\u00c3\u001e\u00eb\u00b4.-\u0096\u00e4\u007f\u000fE\u0004\u00c6\u00bf\u00c0f\u00cb\u0007\u00e4\u00a0\u007f\u0080\u00bc\u0096\u00c9s\u00d4\t\u00a5\u00f7:7\u0098\u00a7\u001f.@)\u00f7\u00ae\u0098;\u00ee\u0002\u00eb\u00ed:v\u008a\u00fc9 \u0005\u0003\u00e4\u00ae\u00ca}\u00cc\t\u00e6\u00a0";
        OOkpptril = new int[]{65545, 1, 0x370003, 0x500001, 1638419, 0x180001, 0x2C0002, 4390925, 0x340003, 10158118, 8978450, 655370, 15663144, 3014662, 13959192, 3801097, 0x170001, 12648468, 1310723, 5308472, 15532034};
        r.y();
        r.L();
    }

    private static /* synthetic */ CallSite lOpkprsIr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = OOkpptril[n2 ^ 0x422D571F];
        int n9 = n8 >>> 16;
        String string2 = r.llir0(l1qkjs.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x422D571F);
        n8 = OOkpptril[n3 ^ 0x422D571F];
        int n10 = n8 >>> 16;
        String string3 = r.llir0(l1qkjs.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x422D571F);
        n8 = OOkpptril[n4 ^ 0x422D571F];
        int n11 = n8 >>> 16;
        String string4 = r.llir0(l1qkjs.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x422D571F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC132B8) + -178;
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

    private static /* synthetic */ CallSite IlsOir(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOkpptril[n2 ^ 0x422D571F];
        int n8 = n7 >>> 16;
        String string2 = r.llir0(l1qkjs.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x422D571F);
        n7 = OOkpptril[n3 ^ 0x422D571F];
        int n9 = n7 >>> 16;
        String string3 = r.llir0(l1qkjs.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x422D571F);
        n7 = OOkpptril[n4 ^ 0x422D571F];
        int n10 = n7 >>> 16;
        String string4 = r.llir0(l1qkjs.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x422D571F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC132B8) + -178;
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

    private static /* synthetic */ String llir0(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-57, -122, -50, 83, 65, 92, 107, 120, -72, 109, -121, -29, 12, -53, -31, 52};
        byte[] byArray3 = new byte[]{-115, 114, -25, 33, -71, 22, -84, 118, -105, -124, -5, -53, -31, -119, -57, -104};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void Illqii(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[21];
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
        l1qkjs = stringBuilder.toString();
        OOkpptril = nArray;
    }

    private static /* synthetic */ CallSite ootltqk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOkpptril[n2 ^ 0x422D571F];
        int n8 = n7 >>> 16;
        String string2 = r.llir0(l1qkjs.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x422D571F);
        n7 = OOkpptril[n3 ^ 0x422D571F];
        int n9 = n7 >>> 16;
        String string3 = r.llir0(l1qkjs.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x422D571F);
        n7 = OOkpptril[n4 ^ 0x422D571F];
        int n10 = n7 >>> 16;
        String string4 = r.llir0(l1qkjs.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x422D571F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC132B8) + -178;
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

    private static /* synthetic */ CallSite I1lkqlrs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = OOkpptril[n2 ^ 0x422D571F];
        int n8 = n7 >>> 16;
        String string2 = r.llir0(l1qkjs.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0x422D571F);
        n7 = OOkpptril[n3 ^ 0x422D571F];
        int n9 = n7 >>> 16;
        String string3 = r.llir0(l1qkjs.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0x422D571F);
        n7 = OOkpptril[n4 ^ 0x422D571F];
        int n10 = n7 >>> 16;
        String string4 = r.llir0(l1qkjs.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0x422D571F);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xCC132B8) + -178;
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
