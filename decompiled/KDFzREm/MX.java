/*
 * Decompiled with CFR 0.152.
 */
package KDFzREm;

import KDFzREm.Mc;
import KDFzREm.NF;
import KDFzREm.uc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class MX {
    private static short[] y;
    private static short[] L;
    public Object[] N;
    private static boolean[] u;
    private static short[] i;
    private static /* synthetic */ String oor0Opik0;
    private static /* synthetic */ int[] IlmqO;

    public boolean L(String string) {
        return (boolean)MX.OOmqsqjm("gtxj", 568008603, -1025137738, -1025137735, -1025137736, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("kyep", 568008598, -1025137743, -1025137742, -1025137739, -613611859, (MX)this)[MX.OOmqsqjm("fqdbpvj", 568008592, -1025137743, -1025137730, -1025137737, 828269952)[3]])), (Object)string);
    }

    public Stream<String> L() {
        return MX.OOmqsqjm("kyep", 568008603, -1025137765, -1025137766, -1025137763, -174048176, (Set)((Object)MX.OOmqsqjm("qgzr", 568008603, -1025137738, -1025137767, -1025137768, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("kyep", 568008598, -1025137743, -1025137742, -1025137739, -1193170062, (MX)this)[MX.OOmqsqjm("apgzx", 568008592, -1025137743, -1025137744, -1025137737, 358609985)[2]])))));
    }

    public MX() {
        MX.OOmqsqjm("jwpk", 568008596, -1025137743, -1025137744, -1025137741, 568008596, (MX)this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MX.OOmqsqjm("apgzx", 568008598, -1025137743, -1025137742, -1025137739, 568008598, (MX)this)[MX.OOmqsqjm("qgzr", 568008592, -1025137743, -1025137740, -1025137737, 568008592)[0]] = linkedHashMap;
    }

    static {
        MX.ntfClinit();
    }

    private void i() {
        if (MX.OOmqsqjm("fqdbpvj", 568008598, -1025137743, -1025137742, -1025137739, 568008598, (MX)this) == null) {
            MX.OOmqsqjm("kyep", 568008599, -1025137743, -1025137742, -1025137739, 568008599, (MX)this, (Object[])new Object[MX.OOmqsqjm("gtxj", 568008592, -1025137743, -1025137733, -1025137734, 568008592)[4]]);
            CallSite callSite = MX.OOmqsqjm("gtxj", 568008598, -1025137743, -1025137742, -1025137739, 568008598, (MX)this);
        }
    }

    private static void u() {
        y = new short[]{0, 0, 0, 0};
        L = new short[]{0, 0, 0, 0, 0};
        i = new short[]{0, 0, 0, 0};
    }

    public List<Mc> y() {
        return MX.OOmqsqjm("qrjwii", 568008602, -1025137771, -1025137772, -1025137769, 568008602, (Collection)((Object)MX.OOmqsqjm("apgzx", 568008603, -1025137738, -1025137773, -1025137774, 568008603, (Map)((Map)((Object)MX.OOmqsqjm("fqdbpvj", 568008598, -1025137743, -1025137742, -1025137739, 568008598, (MX)this)[MX.OOmqsqjm("qrjwii", 568008592, -1025137743, -1025137744, -1025137737, 568008592)[3]])))));
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 31) ^ 0xD85E0637, 20), 30) ^ 0xEA7F1497, 26);
    }

    public boolean y(String string) {
        Mc mc = (Mc)((Object)MX.OOmqsqjm("jwpk", 568008603, -1025137738, -1025137770, -1025137745, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("kyep", 568008598, -1025137743, -1025137742, -1025137739, -1534423970, (MX)this)[MX.OOmqsqjm("qrjwii", 568008592, -1025137743, -1025137730, -1025137737, 1890013838)[0]])), (Object)string));
        if (mc == null) {
            return (boolean)MX.OOmqsqjm("fqdbpvj", 568008592, -1025137743, -1025137733, -1025137734, -858836880)[2];
        }
        MX.OOmqsqjm("kyep", 568008596, -1025137758, -1025137730, -1025137755, -174048176, (uc)((Object)MX.OOmqsqjm("qgzr", 568008602, -1025137729, -1025137730, -1025137759, -174048176)), (Object)MX.OOmqsqjm("qrjwii", 568008602, -1025137760, -1025137740, -1025137757, -174048176, (Mc)mc));
        MX.OOmqsqjm("ukau", 568008596, -1025137758, -1025137730, -1025137755, -174048176, (uc)((Object)MX.OOmqsqjm("qgzr", 568008602, -1025137729, -1025137730, -1025137759, -174048176)), (Object)MX.OOmqsqjm("jwpk", 568008602, -1025137754, -1025137742, -1025137751, -174048176, (NF)((NF)((Object)MX.OOmqsqjm("qrjwii", 568008592, -1025137756, -1025137753, -1025137739, -649709687)[MX.OOmqsqjm("ukau", 568008592, -1025137743, -1025137730, -1025137737, 1742019187)[1]]))));
        return (boolean)MX.OOmqsqjm("qrjwii", 568008592, -1025137743, -1025137733, -1025137734, -1516558988)[3];
    }

    public Optional<Mc> N(String string) {
        return MX.OOmqsqjm("gtxj", 568008602, -1025137746, -1025137775, -1025137776, -174048176, (Object)((Mc)((Object)MX.OOmqsqjm("jwpk", 568008603, -1025137738, -1025137748, -1025137745, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("qrjwii", 568008598, -1025137743, -1025137742, -1025137739, -1031526407, (MX)this)[MX.OOmqsqjm("fqdbpvj", 568008592, -1025137743, -1025137730, -1025137737, -1193555052)[2]])), (Object)string))));
    }

    public boolean N(String string, long l) {
        if (MX.OOmqsqjm("gtxj", 568008603, -1025137738, -1025137735, -1025137736, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("qrjwii", 568008598, -1025137743, -1025137742, -1025137739, 1526898886, (MX)this)[MX.OOmqsqjm("ukau", 568008592, -1025137743, -1025137740, -1025137737, -255457545)[1]])), (Object)string) != false) {
            return (boolean)MX.OOmqsqjm("ukau", 568008592, -1025137743, -1025137733, -1025137734, -649517445)[0];
        }
        Mc mc = new Mc(string, l);
        MX.OOmqsqjm("ukau", 568008603, -1025137738, -1025137731, -1025137732, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("kyep", 568008598, -1025137743, -1025137742, -1025137739, 1082216463, (MX)this)[MX.OOmqsqjm("kyep", 568008592, -1025137743, -1025137740, -1025137737, -1850681457)[2]])), (Object)string, (Object)mc);
        MX.OOmqsqjm("apgzx", 568008596, -1025137758, -1025137730, -1025137755, -174048176, (uc)((Object)MX.OOmqsqjm("kyep", 568008602, -1025137729, -1025137730, -1025137759, -174048176)), (Object)MX.OOmqsqjm("jwpk", 568008602, -1025137760, -1025137742, -1025137757, -174048176, (Mc)mc));
        MX.OOmqsqjm("qgzr", 568008596, -1025137758, -1025137730, -1025137755, -174048176, (uc)((Object)MX.OOmqsqjm("gtxj", 568008602, -1025137729, -1025137730, -1025137759, -174048176)), (Object)MX.OOmqsqjm("fqdbpvj", 568008602, -1025137754, -1025137742, -1025137751, -174048176, (NF)((NF)((Object)MX.OOmqsqjm("ukau", 568008592, -1025137756, -1025137753, -1025137739, -1685623043)[MX.OOmqsqjm("kyep", 568008592, -1025137743, -1025137740, -1025137737, -36899156)[3]]))));
        return (boolean)MX.OOmqsqjm("kyep", 568008592, -1025137743, -1025137733, -1025137734, 688319053)[1];
    }

    public void N() {
        if (MX.OOmqsqjm("kyep", 568008603, -1025137738, -1025137752, -1025137749, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("qrjwii", 568008598, -1025137743, -1025137742, -1025137739, 404435340, (MX)this)[MX.OOmqsqjm("kyep", 568008592, -1025137743, -1025137730, -1025137737, 732577535)[4]]))) != false) {
            return;
        }
        MX.OOmqsqjm("qrjwii", 568008603, -1025137738, -1025137750, -1025137741, -174048176, (Map)((Map)((Object)MX.OOmqsqjm("qgzr", 568008598, -1025137743, -1025137742, -1025137739, -1428881747, (MX)this)[MX.OOmqsqjm("gtxj", 568008592, -1025137743, -1025137744, -1025137737, 1306063586)[0]])));
        MX.OOmqsqjm("kyep", 568008596, -1025137758, -1025137730, -1025137755, -174048176, (uc)((Object)MX.OOmqsqjm("qrjwii", 568008602, -1025137729, -1025137730, -1025137759, -174048176)), (Object)MX.OOmqsqjm("qrjwii", 568008602, -1025137760, -1025137730, -1025137747, -174048176));
        MX.OOmqsqjm("jwpk", 568008596, -1025137758, -1025137730, -1025137755, -174048176, (uc)((Object)MX.OOmqsqjm("kyep", 568008602, -1025137729, -1025137730, -1025137759, -174048176)), (Object)MX.OOmqsqjm("kyep", 568008602, -1025137754, -1025137742, -1025137751, -174048176, (NF)((NF)((Object)MX.OOmqsqjm("kyep", 568008592, -1025137756, -1025137753, -1025137739, -345383737)[MX.OOmqsqjm("qgzr", 568008592, -1025137743, -1025137744, -1025137737, 1073980390)[1]]))));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(n, 19), 11), 30), 29);
    }

    private static void R() {
        u = new boolean[]{false, true, false, true, true};
    }

    private static /* synthetic */ void ntfClinit() {
        oor0Opik0 = "\u0084\u00c7]\u00a1\u00fa;\u00b0\u00c3\u00cf\u00f0`\u0012\u00f3\u00fd>\u00f7\u00c0\u00d7\r\u00b6\u00a2h\u00c3\u00c9\u00cb\u00a57\u0002\u00cf\u00f8j\u00ac\u00c5\u00d0Z\u00e5\u00f2n\u0097\u00ce\u009c\u00fd0V\u00ca\u00fcq\u00f7z\u00af\u00c1\u001d\u009b\u0085\u00e7\u00c4\u00df\u00e3\u00fd\u00f7z\u00af\u00c1\u001d\u009b\u0085\u00c3\u00dey\u00fc\u00d2J\u00b4\u00bc-\u0082\u00c3\u00c6\u00b3W\u0004\u00d8X\u00f7z\u00af\u00c1\u001d\u009b\u0085\u00d3\u0001\u00d2J\u00b4\u00bc-\u0082\u00c3\u00c6\u00b3H\b\u00df\u00b9\u0012\u00ffV\u00b4\u00e59\u00d9\u00c6\u00cb\u00f2cN\u00e3\u00afb\u00c1Y\u00c7\u0007\u00fc\u00c9\u0084\u00ad\u00d6E\u0086\u00f6,\u00c5\u00e9\u0012\u009ap\u009e\u00d7\u001e\u008c\u00f8\u00ef\u00f1+\u0014\u00cf\u00f6\u00be\u009af{\u00ffw\u0091\u00d5\"\u00a4\u00ef\u00c7\u00b3I\u0002\u0097\u00e4D=\u0017\u00f5F\u0087\u00d65\u00d9\u00c3\u00e8\u00a7\u00fd\u00dfY\u00b4\u00e1%\u00d2P\u00a0\u00f6+w\u00f7z\u00af\u00c1\u001d\u009b\u0085\u00c3\u00d1c\u00dcL\u00ac\u00dc>V\u00d2J\u00b4\u00bc-\u0082\u00c3\u00c6\u00b3I\u0000\u00dc{\u009aj\u00a7\u00ffV\u00b4\u00e59\u00d9\u00c6\u00cb\u00f2cN\u00e3\u00afbe\u00ec\u00c7\u0007\u0099\u00f99\u0080\u00cb\u0085\u00f0e\u000f\u00cb\u00e2Gb\u00e5\u00d6_\u00a1\u00a8q\u00ba\u00c0\u00cb\u00eaeN\u00c0\u00acfg\u00a0\u00fc^\u00bf\u00f6;\u0082\u0091\u0081\u00f7z\u00af\u00c1\u001d\u009b\u0085\u00df\u00ffN\u00d6Q\u00ba\u00e5=\u00e8\u00d6H;\u00ffV\u00b4\u00e59\u00d9\u00c6\u00cb\u00f2cN\u00e3\u00afb\fp\u00c7\u0007\u00fc\u00df2\u0097\u00dc\u00cb\u00b3h\u0000\u00c2\u00aa'&q\u00d9Y\u00b6\u00e7c\u009e\u00ffV\u00b4\u00e59\u00d9\u00c6\u00cb\u00f2cN\u00e3\u00afb%\u00d5\u00c7\u0007\u00fc\u00df2\u0097\u00dc\u00cb\u00b3q\u0015\u00c5\u00a1'\u000f\u00c6\u00c7U\u00ba\u00fd9\u009a\u0091\u00ee\u00ffw\u0091\u00d5\"\u00a4\u00ef\u00c7\u00b3J'\u0097\u00e4D\u00ef\u0082\u00f5F\u0087\u00d65\u00d9\u00c3\u00e7\u00a7U\u00c6H\r\u009ap\u00bf\u00f2.\u0097\u0085\u00df\u00e8m\r\u0083\u00be|r@\u00d2Q\u00fa\u00c0,\u0084\u00cf\u00cb\u00f1?\u00ac\u00e0\u00a5\u00dcR\u00a1\u00f21\u0098\u00d9\u00e1\u00f9}\u00ed\u00c7N\u00b0\u00f25t0\u00ffV\u00b4\u00e59\u00d9\u00c6\u00cb\u00f2cN\u00e3\u00afb\u00a0\b\u00c7\u0007S\u00c0y\u00b8\u00e3,\u008fK\u00f7z\u00af\u00c1\u001d\u009b\u0085\u00e4\u00da\r\u009ap\u009e\u00d7\u001e\u008c\u00f8\u00ef\u00f1+\b\u00ee\u00f6R\u00d2J\u00b4\u00bc-\u0082\u00c3\u00c6\u00b3K\u0011\u00d8\u00a4g\u0007Y\u00dfU\u00d5r\u00a0\u00ff4\u0097\u00c8\u00c6\u00f9\u0012\u009ap\u00bf\u00f2.\u0097\u0085\u00df\u00e8m\r\u0083\u009em\u00d0\u0001C\u00ffV\u00b4\u00e59\u00d9\u00c6\u00cb\u00f2cN\u00e3\u00afb\u00a0\b\u00c7\u0007\u00fc\u00c5\u00df\u00ffV\u00b4\u00e59\u00d9\u00df\u00de\u00f5hN\u00ef\u00a2d\u00f9\u0092\u00d0H\u00bc\u00fc6\u00cd\u0083\u00e6\u00f6e\u0017\u00cd\u00e2}\u00e1\u009e\u00df\u0013\u0099\u00fa+\u0082\u0091\u00e2\u009ap\u00bf\u00f2.\u0097\u0085\u00df\u00e8m\r\u0083\u008eg\u001a\u00a6\u00d6_\u00a1\u00fa7\u0098\u0091";
        IlmqO = new int[]{3014666, 3670017, 14286851, 8257537, 29491219, 0x440001, 28180482, 0xCD000D, 0x1B0000B, 6881301, 3735553, 8716290, 26214403, 14483512, 5373961, 0x1C10001, 8847374, 0x3A000A, 9961498, 18153482, 35717141, 31195146, 46, 12386314, 24510490, 30736391, 9764867, 11665413, 31850510, 19202051, 19398694, 32768018, 33947658, 21889064, 11993094, 39714840, 5963790, 13041670, 37093416, 18808838, 8323078, 0x2100011, 4521997, 29032454, 26411035};
        MX.u();
        MX.R();
    }

    private static /* synthetic */ CallSite OOmqsqjm(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = IlmqO[n2 ^ 0xC2E5A3B1];
        int n7 = n6 >>> 16;
        String string2 = MX.OOptni(oor0Opik0.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xC2E5A3B1);
        n6 = IlmqO[n3 ^ 0xC2E5A3B1];
        int n8 = n6 >>> 16;
        String string3 = MX.OOptni(oor0Opik0.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xC2E5A3B1);
        n6 = IlmqO[n4 ^ 0xC2E5A3B1];
        int n9 = n6 >>> 16;
        String string4 = MX.OOptni(oor0Opik0.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xC2E5A3B1);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x21DB1F22) + -178;
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

    private static /* synthetic */ CallSite ooIOq0(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = IlmqO[n2 ^ 0xC2E5A3B1];
        int n9 = n8 >>> 16;
        String string2 = MX.OOptni(oor0Opik0.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xC2E5A3B1);
        n8 = IlmqO[n3 ^ 0xC2E5A3B1];
        int n10 = n8 >>> 16;
        String string3 = MX.OOptni(oor0Opik0.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xC2E5A3B1);
        n8 = IlmqO[n4 ^ 0xC2E5A3B1];
        int n11 = n8 >>> 16;
        String string4 = MX.OOptni(oor0Opik0.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xC2E5A3B1);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x21DB1F22) + -178;
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

    private static /* synthetic */ String OOptni(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-117, -82, -73, -104, 61, 77, 65, 29, 4, -32, -77, 124, -79, -79, 21, -40};
        byte[] byArray3 = new byte[]{-59, -8, -66, -18, 5, -119, -8, 63, -37, 10, -104, -24, 109, 94, -79, 104};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ooqrOIsI(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[45];
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
        oor0Opik0 = stringBuilder.toString();
        IlmqO = nArray;
    }
}
