/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNuU
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package KDFzREm;

import KDFzREm.NNuU;
import KDFzREm.kL;
import KDFzREm.kM;
import KDFzREm.ki;
import KDFzREm.ku;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kR {
    private static String[] L;
    private static boolean[] u;
    public Object[] N;
    public static Object[] y;
    private static short[] i;
    private static /* synthetic */ String l1npjq;
    private static /* synthetic */ int[] lOrlOqpi;

    private static void L() {
        i = new short[]{0, 0, 0, 0, 0, 0, 0, 0};
    }

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft((-n ^ 0x5289844E) + 1 ^ 0xC28D1E62, 29), 29);
    }

    public kR() {
        kR.OO0ppI("cdlaay", -332919039, -127544978, -127544977, -127544980, -332919039, (kR)this);
        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
        kR.OO0ppI("egwymu", -332919037, -127544978, -127544979, -127544982, -332919037, (kR)this)[kR.OO0ppI("dkdspr", -332919035, -127544978, -127544981, -127544984, -332919035)[0]] = concurrentLinkedDeque;
    }

    static {
        kR.ntfClinit();
    }

    private static /* synthetic */ int i(int n) {
        return (Integer.rotateLeft(Integer.rotateRight(n, 19) ^ 0x2214BAA8, 5) ^ 0x33233C8E) + 1;
    }

    private static void i() {
        y = new Object[]{null};
    }

    private static /* synthetic */ int u(int n) {
        return Integer.rotateLeft(-Integer.rotateRight(-Integer.rotateLeft(n ^ 0x34C0FEFE, 25), 10) ^ 0x7E973D3, 17);
    }

    private static void u() {
        L = new String[]{"Error updating schedules: {}"};
    }

    public void y(int n, Runnable runnable) {
        kR.OO0ppI("njxt", -332919039, -127544983, -127544986, -127544985, 697581970, (ConcurrentLinkedDeque)((ConcurrentLinkedDeque)((Object)kR.OO0ppI("fkersred", -332919037, -127544978, -127544979, -127544982, 1108090494, (kR)this)[kR.OO0ppI("ysdmjx", -332919035, -127544978, -127544981, -127544984, -1593912930)[4]])), (Object)new kM(n, runnable));
    }

    private static void y() {
        u = new boolean[]{true, false, true, false, true, true};
    }

    public kL y(int n, int n2, Runnable runnable) {
        kL kL2 = new kL(n, n2, runnable);
        kR.OO0ppI("kkjvd", -332919039, -127544983, -127544986, -127544985, 697581970, (ConcurrentLinkedDeque)((ConcurrentLinkedDeque)((Object)kR.OO0ppI("cdlaay", -332919037, -127544978, -127544979, -127544982, 2095992608, (kR)this)[kR.OO0ppI("kxlq", -332919035, -127544978, -127544981, -127544984, -2088043360)[6]])), (Object)kL2);
        return kL2;
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateLeft(Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateRight(n, 31), 12), 28), 6) ^ 0x1D00A4FA, 9);
    }

    public void N(Predicate<NNuU> predicate, Runnable runnable) {
        kR.OO0ppI("qymezdw", -332919039, -127544983, -127544986, -127544985, -332919039, (ConcurrentLinkedDeque)((ConcurrentLinkedDeque)((Object)kR.OO0ppI("fkersred", -332919037, -127544978, -127544979, -127544982, -332919037, (kR)this)[kR.OO0ppI("ahfy", -332919035, -127544978, -127544981, -127544984, -332919035)[3]])), (Object)new ku(runnable, predicate));
    }

    public kL N(int n, Runnable runnable) {
        kL kL2 = new kL(n, runnable);
        kR.OO0ppI("cipqkq", -332919039, -127544983, -127544986, -127544985, 697581970, (ConcurrentLinkedDeque)((ConcurrentLinkedDeque)((Object)kR.OO0ppI("egwymu", -332919037, -127544978, -127544979, -127544982, -536495387, (kR)this)[kR.OO0ppI("qymezdw", -332919035, -127544978, -127544981, -127544984, -34431189)[5]])), (Object)kL2);
        return kL2;
    }

    public void N() {
        CallSite callSite = kR.OO0ppI("egwymu", -332919039, -127544983, -127544988, -127544987, -332919039, (ConcurrentLinkedDeque)((ConcurrentLinkedDeque)((Object)kR.OO0ppI("kkjvd", -332919037, -127544978, -127544979, -127544982, -332919037, (kR)this)[kR.OO0ppI("vxwvqxn", -332919035, -127544978, -127544981, -127544984, -332919035)[1]])));
        while (kR.OO0ppI("fkersred", -332919026, -127544990, -127544989, -127544992, -332919026, (Iterator)((Object)callSite)) != false) {
            try {
                CallSite callSite2;
                kM kM2 = (kM)((Object)kR.OO0ppI("njxt", -332919026, -127544990, -127544991, -127544962, -332919026, (Iterator)((Object)callSite)));
                CallSite callSite3 = kM2 != null ? kR.OO0ppI("cipqkq", -332919035, -127544978, -127544961, -127544964, -332919035)[0] : (callSite2 = kR.OO0ppI("kkjvd", -332919035, -127544978, -127544961, -127544964, -1441201526)[1]);
                if (callSite2 != false) {
                    kR.OO0ppI("kxlq", -332919039, -127544963, -127544961, -127544992, -332919039, (kM)kM2);
                }
                if (callSite2 != false && kR.OO0ppI("axibeypc", -332919039, -127544963, -127544966, -127544992, -332919039, (kM)kM2) == false) continue;
                kR.OO0ppI("ahfy", -332919026, -127544990, -127544965, -127544980, 697581970, (Iterator)((Object)callSite));
            }
            catch (Exception exception) {
                kR.OO0ppI("mgbcmdl", -332919026, -127544971, -127544974, -127544973, 697581970, (Logger)((Logger)kR.OO0ppI("egwymu", -332919035, -127544978, -127544968, -127544982, 1587451429)[kR.OO0ppI("fkersred", -332919035, -127544978, -127544981, -127544984, -1067749682)[2]]), (String)((Object)kR.OO0ppI("egwymu", -332919035, -127544978, -127544966, -127544967, 1848401541)[0]), (Object)kR.OO0ppI("dkdspr", -332919039, -127544970, -127544969, -127544972, 697581970, (Exception)exception), (Object)exception);
            }
        }
    }

    public void N(ki ki2) {
        kR.OO0ppI("ysdmjx", -332919039, -127544983, -127544986, -127544985, 697581970, (ConcurrentLinkedDeque)((ConcurrentLinkedDeque)((Object)kR.OO0ppI("axibeypc", -332919037, -127544978, -127544979, -127544982, -1450385268, (kR)this)[kR.OO0ppI("dkdspr", -332919035, -127544978, -127544981, -127544984, -962234609)[7]])), (Object)ki2);
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n ^ 0x6E1D15CF, 1), 27), 10);
    }

    private static /* synthetic */ String N(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{32, -51, -116, 52, 67, 1, -15, 99, -57, 77, 103, -99, 76, 104, -45, -57};
        int n = 0;
        int n2 = 100;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 97;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public void N(int n, int n2, Runnable runnable) {
        kR.OO0ppI("ahfy", -332919039, -127544978, -127544979, -127544975, 697581970, (kR)this, (ki)new ki(n, n2, runnable));
    }

    public void N(Runnable runnable) {
        kR.OO0ppI("axibeypc", -332919039, -127544978, -127544968, -127544976, 697581970, (kR)this, (int)kR.OO0ppI("axibeypc", -332919035, -127544978, -127544961, -127544964, -1612789356)[2], (Runnable)runnable);
    }

    private void R() {
        this.N = new Object[1];
    }

    private static /* synthetic */ void ntfClinit() {
        kR.IIOOItsOk(new String[]{"\u0000\u0006\u0000\u0002\u001bS\u0000\u0015\u0000\u0006\u000ee\u00e44\u00c9\u009f\u0000\n\u0000\bit\u00ec)\u00de\u008e\u00e7a\u0000\u0019\u0000\n\u00c7e\u00fd\u0016\u00da\u0089\u00fbrI\u0007\u0000\u000e\u0000\u0003\u00d7)\u00d3\u0000\u001f\u0000\u000f\u00e5L\u00c2\u001f\u00f9\u0080\u00daVCMz\u001c\u0084\u00d3\u00cf\u0000\u000f\u0000\u0004\u00a3e\u00f1/\u0000\r\u0000\u0007\u00aaa\u00fa\u0015\u00da\u0082\u00fc\u0000\u0017\u0000\u0013\u00e3L\u00e3:\u00c9\u009b\u00a7\u007fO\fvZ\u00ec\u008e\u00eb\u00d1\u00d6g\u00b2\u0000\u001e\u0000\u0018\u00d7I\u00c51\u00de\u008c\u00e9<B\u0003\u007f\u0012\u0090\u00a8\u00ech\u0091a\u00eb7\u00da\u00c1\u00a1E\u0000\u0007\u0000*\u00d2a\u00ff:\u0090\u008f\u00fczBMr\u001a\u00d1\u0099\u00ec\u00ca\u00cae\u00e7/\u0090\u00b9\u00e7}M\u0017c\u0007\u00da\u0094\u00ed\u00f4\u00d1n\u00e2>\u00db\u00be\u00edb[\u0007\u0000\u0010\u0000\u0014\u00a0)\u00c51\u00de\u008c\u00e9<B\u0003\u007f\u0012\u0090\u00b5\u00fbj\u00edc\u00fd`\u0000\u0005\u0000\u0001\u0015\u0000\u0000\u0000\n\u00c3D\u00cf!\u00ed\u00bf\u00e5<E0\u0000\u0018\u0000\u0013\u00b3a\u00ff:\u0090\u0096\u00e9}IMT\r\u00dc\u009f\u00e9\u00e2\u00b0o\u00e7\u0000\u001a\u0000\u0014()\u00c51\u00de\u008c\u00e9<B\u0003\u007f\u0012\u0090\u00a9\u00ed\u00a8in\u00ee`\u0000\b\u0000\u0003\u00b8d\u00ed\u0000\u0012\u0000\u0002\u00b8Z\u0000\u000b\u0000\u0016R)\u00c51\u00de\u008c\u00e9<[\u0016x\u0019\u0090\u00b3\u00ed\u00bf\ba\u00fd4\u00cd\u00c1\u0000\u0013\u0000\n\u00a7D\u00cf!\u00ed\u00bf\u00e5<E/\u0000\u0001\u0000\u0001\b\u0000\u0014\u0000\u0001\u00c5\u0000\u001c\u0000\u0005\u00d4r\u00fb4\u00cd\u0000\u0003\u0000\u0001\u00a2\u0000\f\u0000\u0012\u00dba\u00ff:\u0090\u008f\u00fczBMX\u0001\u00da\u0088\u00f8\u00c3\u00der\u0000\u001d\u00009\u00eaL\u00e3:\u00c9\u009b\u00a7\u007fO\fvZ\u00ec\u008e\u00eb\u00de\u00acg\u00b2\u0017\u00d5\u009b\u00fer\u0001\u000ep\u001b\u00d8\u00d5\u00d6\u00d5\u00a8e\u00ea/\u0084\u00b6\u00e2rX\u0003>\u0019\u00de\u0094\u00fe\u0098\u008db\u00e3>\u00dc\u008e\u00b3:x\u0000\u0011\u0000\u0001/\u0000\u001b\u0000\u001f\u0015r\u00eet\u00de\u008a\u00e9pF\u0007>\u0019\u00d0\u009d\u00fe\u00b3\u0014g\u00a67\u00d0\u009d\u00bcy\u0001.~\u0012\u00d8\u009f\u00eb\u0000\u0002\u0000\u0003\u00cb)\u00df\u0000\u0016\u0000\u00019\u0000\u0004\u0000\u0013\u00d2L\u00e3:\u00c9\u009b\u00a7\u007fO\fvZ\u00f0\u0098\u00f3\u00a7\u00eat\u00b2\u0000\t\u0000\u0015\u0088L\u00e3:\u00c9\u009b\u00a7\u007fO\fvZ\u00f0\u0098\u00f3\u00f3\u00c3t\u00b2r\u00e5"});
        kR.L();
        kR.y();
        kR.u();
        kR.i();
        kR.y[0] = LogManager.getLogger(String.class);
    }

    private static /* synthetic */ CallSite OO0ppI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lOrlOqpi[n2 ^ 0xF865D16E];
        int n7 = n6 >>> 16;
        String string2 = kR.lIjkis(l1npjq.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xF865D16E);
        n6 = lOrlOqpi[n3 ^ 0xF865D16E];
        int n8 = n6 >>> 16;
        String string3 = kR.lIjkis(l1npjq.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xF865D16E);
        n6 = lOrlOqpi[n4 ^ 0xF865D16E];
        int n9 = n6 >>> 16;
        String string4 = kR.lIjkis(l1npjq.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xF865D16E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC280FB7) + -178;
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

    private static /* synthetic */ String lIjkis(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{30, 98, -105, -90, 94, 68, -106, -14, -3, -36, -81, -45, -31, -66, -57, 100};
        byte[] byArray3 = new byte[]{-54, -34, 46, -43, -16, 114, 122, 85, 29, -66, 123, -8, -96, 78, 126, 126};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite llirO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lOrlOqpi[n2 ^ 0xF865D16E];
        int n9 = n8 >>> 16;
        String string2 = kR.lIjkis(l1npjq.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0xF865D16E);
        n8 = lOrlOqpi[n3 ^ 0xF865D16E];
        int n10 = n8 >>> 16;
        String string3 = kR.lIjkis(l1npjq.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0xF865D16E);
        n8 = lOrlOqpi[n4 ^ 0xF865D16E];
        int n11 = n8 >>> 16;
        String string4 = kR.lIjkis(l1npjq.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0xF865D16E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC280FB7) + -178;
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

    private static /* synthetic */ CallSite l1l0mslp(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lOrlOqpi[n2 ^ 0xF865D16E];
        int n8 = n7 >>> 16;
        String string2 = kR.lIjkis(l1npjq.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xF865D16E);
        n7 = lOrlOqpi[n3 ^ 0xF865D16E];
        int n9 = n7 >>> 16;
        String string3 = kR.lIjkis(l1npjq.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xF865D16E);
        n7 = lOrlOqpi[n4 ^ 0xF865D16E];
        int n10 = n7 >>> 16;
        String string4 = kR.lIjkis(l1npjq.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xF865D16E);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0xEC280FB7) + -178;
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

    private static /* synthetic */ void IIOOItsOk(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[32];
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
        l1npjq = stringBuilder.toString();
        lOrlOqpi = nArray;
    }
}
