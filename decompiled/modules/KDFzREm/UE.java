/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NSE
 *  KDFzREm.NbK
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NSE;
import KDFzREm.NbK;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.iF;
import KDFzREm.lT;
import KDFzREm.lY;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;

@UZ(L="NoFriendDamage", y=UR.COMBAT, N=Uz.OTHER)
public class UE
extends UM {
    private static boolean[] u;
    private static String[] i;
    private static short[] R;
    public Object[] L;
    private static /* synthetic */ String oom0m;
    private static /* synthetic */ int[] lOmqmr;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(Integer.rotateLeft(n, 28) ^ 0x8FB6DDEF, 20), 20), 29);
    }

    private static void P() {
        u = new boolean[]{false, false, true, false, true};
    }

    private void T() {
        if (UE.I1tmlr("lvkksmrl", -1893334579, 254681037, 254681026, 254681033, -1893334579, -1893334579, (UE)this) == null) {
            UE.I1tmlr("rudrbz", -1893334580, 254681037, 254681026, 254681033, -1893334580, -1893334580, (UE)this, (Object[])new Object[UE.I1tmlr("wbwyaj", -1893334581, 254681037, 254681031, 254681055, -1893334581, -1893334581)[4]]);
            CallSite callSite = UE.I1tmlr("yfendmt", -1893334579, 254681037, 254681026, 254681033, -1893334579, -1893334579, (UE)this);
        }
    }

    public UE() {
        UE.I1tmlr("wtrsgcxu", -1893334577, 254681037, 254681034, 254681036, -1893334577, -1893334577, (UE)this);
        CallSite callSite = UE.I1tmlr("wtrsgcxu", -1893334591, 254681063, 254681039, 254681060, -1893334591, -1893334591, (lY)this, (String)((Object)UE.I1tmlr("xkpqqyzy", -1893334581, 254681037, 254681045, 254681062, -1893334581, -1893334581)[0]), (boolean)UE.I1tmlr("yfendmt", -1893334581, 254681037, 254681031, 254681055, -1893334581, -1893334581)[0]);
        UE.I1tmlr("lvkksmrl", -1893334579, 254681037, 254681026, 254681033, -1893334579, -1893334579, (UE)this)[UE.I1tmlr("wtrsgcxu", -1893334581, 254681037, 254681046, 254681047, -1893334581, -1893334581)[0]] = callSite;
    }

    static {
        UE.ntfClinit();
    }

    private static void s() {
        R = new short[]{0, 0, 0, 4, 0, 4, 0, 4};
    }

    private static void m() {
        i = new String[]{"teams"};
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n, 7), 12), 19) ^ 0x1D20E865, 7), 27);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-125, 112, -106, -50, 96, 108, 42, -50, -83, -58, 71, 97, 4, 78, -5, 86};
        int n = 0;
        int n2 = 224;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 49;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(Integer.rotateLeft(-Integer.rotateLeft(Integer.rotateRight(n, 12) ^ 0xE4CDB48A, 15), 13), 25);
    }

    @uF
    public void N(iF iF2) {
        if (UE.I1tmlr("yfendmt", -1893334592, 254681024, 254681025, 254681038, -1454117669, 1838159544, (Predicate)((Object)UE.I1tmlr("nbzwlqhb", -1893334591, 254681030, 254681031, 254681028, -1454117669, 1838159544)), (Object)UE.I1tmlr("wbwyaj", -1893334577, 254681029, 254681026, 254681027, -1454117669, 1838159544, (iF)iF2)) != false) {
            UE.I1tmlr("nbzwlqhb", -1893334577, 254681029, 254681039, 254681036, -1454117669, 1838159544, (iF)iF2);
        }
    }

    public boolean N(NbK nbK) {
        block4: {
            block3: {
                UE.I1tmlr("eeleqp", -1893334577, 254681037, 254681034, 254681036, -1454117669, 1838159544, (UE)this);
                if (UE.I1tmlr("wbwyaj", -1893334577, 254681037, 254681035, 254681032, -1454117669, 1838159544, (UE)this) == false) break block3;
                if (UE.I1tmlr("rudrbz", -1893334577, 254681043, 254681040, 254681032, -1454117669, 1838159544, (Boolean)((Boolean)((Object)UE.I1tmlr("yfendmt", -1893334577, 254681044, 254681045, 254681042, -1454117669, 1838159544, (lT)((lT)((Object)UE.I1tmlr("wtrsgcxu", -1893334579, 254681037, 254681026, 254681033, -1595213536, 631943418, (UE)this)[UE.I1tmlr("xkpqqyzy", -1893334581, 254681037, 254681046, 254681047, -71826555, 1485514311)[1]])))))) == false) break block3;
                if ((NNNwS)UE.I1tmlr("wketrdel", -1893334579, 254681054, 254681034, 254681033, 1519438881, -2129530162, (NNuU)((NNuU)UE.I1tmlr("lvkksmrl", -1893334579, 254681037, 254681041, 254681033, 109669785, -1623944534, (UE)this)[UE.I1tmlr("wketrdel", -1893334581, 254681037, 254681046, 254681047, 1155467215, -1152320775)[2]]))[UE.I1tmlr("rudrbz", -1893334581, 254681037, 254681046, 254681047, -1150692971, 1286688446)[3]] == null) break block3;
                if (nbK != (NNNwS)UE.I1tmlr("caalocgy", -1893334579, 254681054, 254681034, 254681033, 41396174, 1227837252, (NNuU)((NNuU)UE.I1tmlr("yfendmt", -1893334579, 254681037, 254681041, 254681033, -1219389921, 137637426, (UE)this)[UE.I1tmlr("yfendmt", -1893334581, 254681037, 254681046, 254681047, -1496477252, -1276008643)[4]]))[UE.I1tmlr("lvkksmrl", -1893334581, 254681037, 254681046, 254681047, 541475905, 1268045083)[5]]) break block4;
            }
            return (boolean)UE.I1tmlr("rudrbz", -1893334581, 254681037, 254681031, 254681055, -194998251, 180202943)[1];
        }
        CallSite callSite = UE.I1tmlr("yfendmt", -1893334577, 254681052, 254681053, 254681050, -1454117669, 1838159544, (NNNwS)((NNNwS)UE.I1tmlr("lvkksmrl", -1893334579, 254681054, 254681034, 254681033, -1510223989, -773111718, (NNuU)((NNuU)UE.I1tmlr("lvkksmrl", -1893334579, 254681037, 254681041, 254681033, -1922043667, -343210986, (UE)this)[UE.I1tmlr("esdwx", -1893334581, 254681037, 254681046, 254681047, 1591129914, -2046140931)[6]]))[UE.I1tmlr("qvyhyg", -1893334581, 254681037, 254681046, 254681047, -1673367792, -164472690)[7]]));
        return (boolean)(callSite != null && UE.I1tmlr("yfendmt", -1893334577, 254681048, 254681039, 254681049, -1454117669, 1838159544, (NSE)callSite, (NSE)UE.I1tmlr("sgftlvzo", -1893334577, 254681051, 254681053, 254681050, -1454117669, 1838159544, (NbK)nbK)) != false ? UE.I1tmlr("caalocgy", -1893334581, 254681037, 254681031, 254681055, -1266636619, 762118198)[2] : UE.I1tmlr("qvyhyg", -1893334581, 254681037, 254681031, 254681055, -361453149, 842217306)[3]);
    }

    private static /* synthetic */ void ntfClinit() {
        oom0m = "\u00ae.\u00d9z\u0007D\u0082/\u001d\n\u009ce\u0011q\u0007\u0007\u00e6V.Z\u008f_G\u001d\u00c1:;\u00a5jyY*\u0082~\tN\u00ba5yF\u00df\nn\u008e;B\u0006\u0007\u00e6V.Z\u008f_G\u001d\u00c17;a\u000f\u00ebh:e\u00b05da\u00e8\u00c1\u0018L0\u000f\u00ebh:e\u00b05d|\u00d86\u0007b\u00e1x\tV\u00bc5_F\u00c4\u000f/\u008fuvL?\u00c4}\u0006\u000f\u008dhOV\u00c4\u0000a\u009de#\u000e\u0007\u00e6V.Z\u008f_G\u001d\u00e30E\u00d2)4\u00ef\u00bab\u00e1Y,f\u00a7Ho_\u0082-b\u00a2;d\u000f\u00ebh:e\u00b05Ff\u009a\u000f\u00ebh:e\u00b05d|\u00e3\u0014S:\u001d\u000b$b\u00e1Y,f\u00a7Ho_\u0082-C\u008a;\u0003\u000f\u00ebh:e\u00b05dP\u00e6#\u000f\u00ebh:e\u00b05_}3\u0007\u00c7s\u001eA\u00f2vK\\\u00caLS\u009drW\u0006,\u0096\u00d1\u000f\u00ebh:e\u00b05FY\u00e5$\u00c2~\rA\u00b3LK^\u00d8\u0006\u00f9b\u00fbp}\u0007\u00c7s\u001eA\u00f2vK\\\u00caLO\u008bj\u000bE?\u0096\u00f8*\u00dbsGL\u00bctM\u001d\u00ef\fo\u0085ea\u00fc(b\u00e1x\tV\u00bc5FS\u00c3\u0004/\u00a6bje(\u00d9)S\u0007\u00c7s\u001eA\u00f2vK\\\u00caLO\u008bj\u0080\u0018?\u0096;2\u0006.\u00defS\u000f\u00ebh:e\u00b05Ct\u0002b\u00f7\u0088\u000f\u00ebh:e\u00b05\u007fw\u00ed*\u00dbsGU\u00a9sF\u001d\u00cb\u0016n\u008at\u00dd\u00e8%\u0082B\u001aE\u00b9sIS\u00d9\u0006X";
        lOmqmr = new int[]{13172746, 8716289, 0x550020, 22085642, 4718593, 8781839, 23592988, 21823492, 20447253, 0xFF0001, 16515075, 22937610, 25427969, 11337729, 22740995, 0x1000013, 11272193, 4587522, 9764874, 851969, 19136532, 0x1130011, 0xF0000C, 11403265, 4784140, 720898, 10420237, 11, 0xAF000F, 0xBE000B, 0x3B000B, 7667728, 13828115, 15073290, 917549};
        UE.s();
        UE.P();
        UE.m();
    }

    private static /* synthetic */ CallSite II0Omnk(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) throws Exception {
        int n9 = lOmqmr[n2 ^ 0xF2E1FC6];
        int n10 = n9 >>> 16;
        String string2 = UE.llmqk0jq(oom0m.substring(n10, n10 + (n9 & 0xFFFF)), n2 ^ 0xF2E1FC6);
        n9 = lOmqmr[n3 ^ 0xF2E1FC6];
        int n11 = n9 >>> 16;
        String string3 = UE.llmqk0jq(oom0m.substring(n11, n11 + (n9 & 0xFFFF)), n3 ^ 0xF2E1FC6);
        n9 = lOmqmr[n4 ^ 0xF2E1FC6];
        int n12 = n9 >>> 16;
        String string4 = UE.llmqk0jq(oom0m.substring(n12, n12 + (n9 & 0xFFFF)), n4 ^ 0xF2E1FC6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x8F260179) + -178;
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

    private static /* synthetic */ CallSite OOkrklO(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lOmqmr[n2 ^ 0xF2E1FC6];
        int n7 = n6 >>> 16;
        String string2 = UE.llmqk0jq(oom0m.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xF2E1FC6);
        n6 = lOmqmr[n3 ^ 0xF2E1FC6];
        int n8 = n6 >>> 16;
        String string3 = UE.llmqk0jq(oom0m.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xF2E1FC6);
        n6 = lOmqmr[n4 ^ 0xF2E1FC6];
        int n9 = n6 >>> 16;
        String string4 = UE.llmqk0jq(oom0m.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xF2E1FC6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x8F260179) + -178;
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

    private static /* synthetic */ CallSite I1tmlr(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = lOmqmr[n2 ^ 0xF2E1FC6];
        int n8 = n7 >>> 16;
        String string2 = UE.llmqk0jq(oom0m.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xF2E1FC6);
        n7 = lOmqmr[n3 ^ 0xF2E1FC6];
        int n9 = n7 >>> 16;
        String string3 = UE.llmqk0jq(oom0m.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xF2E1FC6);
        n7 = lOmqmr[n4 ^ 0xF2E1FC6];
        int n10 = n7 >>> 16;
        String string4 = UE.llmqk0jq(oom0m.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xF2E1FC6);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x8F260179) + -178;
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

    private static /* synthetic */ String llmqk0jq(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-5, 97, -47, 56, -109, -77, 42, -119, -9, -59, 124, -29, -128, 105, -44, -35};
        byte[] byArray3 = new byte[]{-124, -115, 44, -117, -4, 55, 82, 93, 89, 31, -8, -47, -24, -65, -16, -112};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void I1rsIjsnm(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[35];
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
        oom0m = stringBuilder.toString();
        lOmqmr = nArray;
    }
}
