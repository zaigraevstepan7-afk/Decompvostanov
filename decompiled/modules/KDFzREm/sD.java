/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.gB
 */
package KDFzREm;

import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.gB;
import KDFzREm.ic;
import KDFzREm.ih;
import KDFzREm.lY;
import KDFzREm.lj;
import KDFzREm.lv;
import KDFzREm.sS;
import KDFzREm.sh;
import KDFzREm.sx;
import KDFzREm.uA;
import KDFzREm.uF;
import KDFzREm.uY;
import KDFzREm.wg;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.List;

@UZ(L="NoDelay", y=UR.PLAYER, N=Uz.BASE)
public class sD
extends UM {
    private static byte[] u;
    private static boolean[] i;
    private static short[] R;
    private static String[] M;
    private static short[] B;
    private static short[] Z;
    private static boolean[] z;
    public Object[] L;
    private static /* synthetic */ String I10mpln;
    private static /* synthetic */ int[] lInrn;

    private static /* synthetic */ int L(int n) {
        return Integer.rotateLeft(Integer.rotateRight(Integer.rotateRight(n ^ 0xAE6372B8, 3), 30) ^ 0x46957080, 15) ^ 0x19498F81;
    }

    private static void P() {
        M = new String[]{"block-breaking", "delays", "right-click", "jump-delay"};
    }

    private static void T() {
        B = new short[]{0, 0, 1, 1, 1};
        Z = new short[]{1, 0};
        R = new short[]{4, 0, 4, 1, 0, 4, 0, 4};
    }

    public sD() {
        sD.Olstt0i("zjqn", 1572857063, 1413474024, 1413474025, 1413474026, 1572857063, (sD)this);
        sx sx2 = new sx(this, (String)((Object)sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413473998, 1413473985, 1572857059)[0]), (boolean)sD.Olstt0i("olwlz", 1572857059, 1413474024, 1413474032, 1413474034, 1572857059)[0]);
        sD.Olstt0i("wzxtllc", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this)[sD.Olstt0i("nhnn", 1572857059, 1413474024, 1413473992, 1413474030, 1572857059)[0]] = sx2;
        lv[] lvArray = new sh[sD.Olstt0i("olwlz", 1572857059, 1413474024, 1413473999, 1413473984, 1572857059)[0]];
        lvArray[sD.Olstt0i("zjqn", 1572857059, 1413474024, 1413474032, 1413474034, 1572857059)[1]] = new sS(this, (String)((Object)sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413473998, 1413473985, 1572857059)[2]), (boolean)sD.Olstt0i("xevply", 1572857059, 1413474024, 1413474032, 1413474034, 1572857059)[2], object -> {
            if (object instanceof ic) {
                if ((NNNwS)sD.Olstt0i("rtdfgo", 1572857061, 1413474022, 1413474023, 1413474028, 401135140, (NNuU)((NNuU)sD.Olstt0i("nhnn", 1572857061, 1413474024, 1413474021, 1413474028, 365839855, (sD)this)[sD.Olstt0i("xevply", 1572857059, 1413474024, 1413474040, 1413474030, 1292402953)[4]]))[sD.Olstt0i("wzxtllc", 1572857059, 1413474024, 1413474040, 1413474030, 2098322104)[5]] != null) {
                    CallSite callSite = sD.Olstt0i("wzxtllc", 1572857065, 1413474045, 1413473996, 1413473997, 1400091595, (int)sD.Olstt0i("iuopj", 1572857059, 1413474024, 1413474016, 1413474034, -527371883)[2]);
                    sD.Olstt0i("vwmwtyj", 1572857061, 1413474022, 1413473998, 1413474028, -2039941391, (NNuU)((NNuU)sD.Olstt0i("wzxtllc", 1572857061, 1413474024, 1413474021, 1413474028, -180256929, (sD)this)[sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413474040, 1413474030, -1911104309)[6]]))[sD.Olstt0i("rtdfgo", 1572857059, 1413474024, 1413474040, 1413474030, -1097984026)[7]] = callSite;
                }
            }
        });
        lvArray[sD.Olstt0i("wzxtllc", 1572857059, 1413474024, 1413474032, 1413474034, 1572857059)[3]] = new sS(this, (String)((Object)sD.Olstt0i("rrvafukj", 1572857059, 1413474024, 1413473998, 1413473985, 1572857059)[3]), (boolean)sD.Olstt0i("xevply", 1572857059, 1413474024, 1413474032, 1413474034, 1572857059)[4], object -> {
            if (object instanceof ih) {
                ih ih2 = (ih)object;
                if ((NNNwS)sD.Olstt0i("nhnn", 1572857061, 1413474022, 1413474023, 1413474028, -508299675, (NNuU)((NNuU)sD.Olstt0i("wzxtllc", 1572857061, 1413474024, 1413474021, 1413474028, -1169956565, (sD)this)[sD.Olstt0i("olwlz", 1572857059, 1413474024, 1413474029, 1413474030, 287517722)[1]]))[sD.Olstt0i("cmip", 1572857059, 1413474024, 1413474040, 1413474030, 1367528760)[0]] != null && sD.Olstt0i("wzxtllc", 1572857063, 1413474041, 1413474027, 1413474042, 1400091595, (ih)ih2) != false) {
                    if (sD.Olstt0i("zjqn", 1572857063, 1413474045, 1413474046, 1413474047, 1400091595, (Integer)((Object)sD.Olstt0i("rtdfgo", 1572857061, 1413474043, 1413474044, 1413474028, -1459013518, (NNNwS)((NNNwS)sD.Olstt0i("zjqn", 1572857061, 1413474022, 1413474023, 1413474028, 201628079, (NNuU)((NNuU)sD.Olstt0i("xevply", 1572857061, 1413474024, 1413474021, 1413474028, 649291118, (sD)this)[sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413474040, 1413474030, -1083214399)[1]]))[sD.Olstt0i("rtdfgo", 1572857059, 1413474024, 1413474040, 1413474030, 1540871714)[2]]))[sD.Olstt0i("cmip", 1572857059, 1413474024, 1413474040, 1413474030, -836954355)[3]])) == false) {
                        CallSite callSite = sD.Olstt0i("iuopj", 1572857065, 1413474035, 1413474036, 1413474037, 1400091595, (gB)sD.Olstt0i("nhnn", 1572857063, 1413474041, 1413474032, 1413474033, 1400091595, (ih)ih2), (int)sD.Olstt0i("xevply", 1572857059, 1413474024, 1413474032, 1413474034, 1457808593)[5]);
                        if (sD.Olstt0i("vwmwtyj", 1572857063, 1413474038, 1413474036, 1413474047, 1400091595, (wg)((Object)callSite)) > sD.Olstt0i("rrvafukj", 1572857059, 1413474024, 1413474016, 1413474034, -575121714)[0]) {
                            sD.Olstt0i("vwmwtyj", 1572857063, 1413474041, 1413474016, 1413474039, 1400091595, (ih)ih2, (boolean)sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413474016, 1413474034, 1642042150)[1]);
                        }
                    }
                }
            }
        });
        lvArray[sD.Olstt0i("iuopj", 1572857059, 1413474024, 1413473999, 1413473984, 1572857059)[1]] = (sx)((Object)sD.Olstt0i("olwlz", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this)[sD.Olstt0i("olwlz", 1572857059, 1413474024, 1413473992, 1413474030, 1572857059)[1]]);
        CallSite callSite = sD.Olstt0i("xevply", 1572857065, 1413473986, 1413474021, 1413473987, 1572857065, (lY)this, (String)((Object)sD.Olstt0i("zjqn", 1572857059, 1413474024, 1413473998, 1413473985, 1572857059)[1]), (lv[])lvArray);
        sD.Olstt0i("vwmwtyj", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this)[sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413473992, 1413474030, 1572857059)[2]] = callSite;
        sD.Olstt0i("rrvafukj", 1572857064, 1413474018, 1413474019, 1413474020, 1572857064, (List)((Object)sD.Olstt0i("xevply", 1572857063, 1413474031, 1413474027, 1413473988, 1572857063, (lj)((lj)((Object)sD.Olstt0i("nhnn", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this)[sD.Olstt0i("rrvafukj", 1572857059, 1413474024, 1413473992, 1413474030, 1572857059)[3]])))), sh2 -> {
            if (sh2 instanceof uY) {
                uY uY2 = (uY)((Object)sh2);
                sD.Olstt0i("vwmwtyj", 1572857064, 1413473995, 1413474036, 1413473994, 1572857064, (uY)uY2, (Object)this);
            }
        });
    }

    static {
        sD.ntfClinit();
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{109, 95, -46, 112, 89, -72, -60, 38, 70, -85, 8, -87, -6, -114, -32, -124};
        int n = 0;
        int n2 = 115;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 91;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private void b() {
        if (sD.Olstt0i("iuopj", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this) == null) {
            sD.Olstt0i("olwlz", 1572857060, 1413474024, 1413474027, 1413474028, 1572857060, (sD)this, (Object[])new Object[sD.Olstt0i("vwmwtyj", 1572857059, 1413474024, 1413473999, 1413473984, 1572857059)[2]]);
            CallSite callSite = sD.Olstt0i("vwmwtyj", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this);
        }
    }

    private static void s() {
        u = new byte[]{3, 2, 2};
    }

    private static void m() {
        z = new boolean[]{false, false, false, true, true, false};
        i = new boolean[]{true, false, false};
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-58, -12, 60, -2, 93, 94, -78, 55, 103, -27, -9, -26, -116, -33, 106, -1};
        int n = 0;
        int n2 = 156;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 115;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft(-Integer.rotateLeft(n, 14), 30) ^ 0xF11A9BFE, 7);
    }

    private static /* synthetic */ int y(int n) {
        return (Integer.rotateRight(-Integer.rotateRight(Integer.rotateRight(Integer.rotateLeft(n, 17), 6) ^ 0x5E08611C, 24), 21) ^ 0x2E3CE0FB) + 1;
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-35, -47, 117, -112, -95, -121, 29, -19, -55, -110, 64, 66, 5, 52, -93, -58};
        int n = 0;
        int n2 = 25;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 139;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    @uF
    public void N(ic ic2) {
        sD.Olstt0i("nhnn", 1572857063, 1413474024, 1413474025, 1413474026, 1572857063, (sD)this);
        sD.Olstt0i("rrvafukj", 1572857064, 1413474018, 1413474019, 1413474020, 1572857064, (List)((List)((Object)sD.Olstt0i("olwlz", 1572857063, 1413474031, 1413474016, 1413474017, 1572857063, (lj)((lj)((Object)sD.Olstt0i("iuopj", 1572857061, 1413474024, 1413474027, 1413474028, 1572857061, (sD)this)[sD.Olstt0i("iuopj", 1572857059, 1413474024, 1413474029, 1413474030, 1572857059)[0]]))))), sh2 -> sD.Olstt0i("vwmwtyj", 1572857063, 1413473993, 1413474021, 1413473994, 1572857063, (sh)sh2, (Object)ic2));
    }

    private static /* synthetic */ int N(int n) {
        return Integer.rotateRight(-Integer.rotateLeft(-Integer.rotateLeft(n ^ 0x24C0936D, 20) ^ 0xC685BFC3, 22), 17);
    }

    @uF(y=uA.AFTER_ALL)
    public void N(ih ih2) {
        sD.Olstt0i("rtdfgo", 1572857063, 1413474024, 1413474025, 1413474026, 1400091595, (sD)this);
        sD.Olstt0i("iuopj", 1572857064, 1413474018, 1413474019, 1413474020, 1400091595, (List)((List)((Object)sD.Olstt0i("xevply", 1572857063, 1413474031, 1413474016, 1413474017, 1400091595, (lj)((lj)((Object)sD.Olstt0i("olwlz", 1572857061, 1413474024, 1413474027, 1413474028, -1182452424, (sD)this)[sD.Olstt0i("iuopj", 1572857059, 1413474024, 1413473992, 1413474030, -1080922127)[4]]))))), sh2 -> sD.Olstt0i("xevply", 1572857063, 1413473993, 1413474021, 1413473994, 1400091595, (sh)sh2, (Object)ih2));
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{46, -59, 12, 114, -37, -109, 49, -116, 109, -107, -99, -23, 23, 73, 62, -34};
        int n = 0;
        int n2 = 44;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 35;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite Olstt0i(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lInrn[n2 ^ 0x543FE6E8];
        int n7 = n6 >>> 16;
        String string2 = sD.lOnrr0q(I10mpln.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x543FE6E8);
        n6 = lInrn[n3 ^ 0x543FE6E8];
        int n8 = n6 >>> 16;
        String string3 = sD.lOnrr0q(I10mpln.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x543FE6E8);
        n6 = lInrn[n4 ^ 0x543FE6E8];
        int n9 = n6 >>> 16;
        String string4 = sD.lOnrr0q(I10mpln.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x543FE6E8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5DBFE451) + -178;
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

    private static /* synthetic */ String lOnrr0q(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-16, -27, 95, 0, 15, -100, -72, 110, -74, 119, 47, -122, -82, -115, 82, 25};
        byte[] byArray3 = new byte[]{-1, -65, 79, 16, -118, -75, -90, -32, 1, 122, 84, 126, 117, -82, -112, -76};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ooilipO(String[] stringArray) {
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
        I10mpln = stringBuilder.toString();
        lInrn = nArray;
    }

    private static /* synthetic */ CallSite II0Ons(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6, int n7) throws Exception {
        int n8 = lInrn[n2 ^ 0x543FE6E8];
        int n9 = n8 >>> 16;
        String string2 = sD.lOnrr0q(I10mpln.substring(n9, n9 + (n8 & 0xFFFF)), n2 ^ 0x543FE6E8);
        n8 = lInrn[n3 ^ 0x543FE6E8];
        int n10 = n8 >>> 16;
        String string3 = sD.lOnrr0q(I10mpln.substring(n10, n10 + (n8 & 0xFFFF)), n3 ^ 0x543FE6E8);
        n8 = lInrn[n4 ^ 0x543FE6E8];
        int n11 = n8 >>> 16;
        String string4 = sD.lOnrr0q(I10mpln.substring(n11, n11 + (n8 & 0xFFFF)), n4 ^ 0x543FE6E8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5DBFE451) + -178;
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

    private static /* synthetic */ CallSite ll0snsmpI(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = lInrn[n2 ^ 0x543FE6E8];
        int n7 = n6 >>> 16;
        String string2 = sD.lOnrr0q(I10mpln.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0x543FE6E8);
        n6 = lInrn[n3 ^ 0x543FE6E8];
        int n8 = n6 >>> 16;
        String string3 = sD.lOnrr0q(I10mpln.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0x543FE6E8);
        n6 = lInrn[n4 ^ 0x543FE6E8];
        int n9 = n6 >>> 16;
        String string4 = sD.lOnrr0q(I10mpln.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0x543FE6E8);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x5DBFE451) + -178;
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

    private static /* synthetic */ void ntfClinit() {
        I10mpln = "W(O\u0093\u00a9\u00fc`Pz\u00e4+\u001d$\u00dec\u00d1GUY\u00d0\u0084\u00c1E9u\u00c2\u0007\u001c$\u00d1~\u0084\r\t|\u00d5\u008b\u0098gyn\u00c5\u001b\u001dn\u00c50\u00c38\u00c5FTvY\u00f1\u00a1\u00f1^DE\u00dbA\u001cR\u008cG\u0080a(t\u0095\u0089\u00d6Jq/\u00e5\u001a\u0002b\u00d9l\u00d1[\u0012^\u00fe\u00a3\u00cdvSm\u0099\u0002\u00060\u009eG\u00a1D\u0018o\u00e8\u00a0\u00da\u000bzj\u008d\u00d8Y\u00d0\u0084\u00c1E9l\u00d7\u0000\u0017$\u00f8i\u0080\u0012\u0093a\u0081\u00cc\u00e1\u0012U<\u00f6\u008f\u00d6Rw/\u00c3\u001a\u0019g\u0098G\u0083\u001d\t.\u00dcW^Q\u00fc\u009f\u00e5a{/\u00c5*\u00f7<\u00f6\u00ae\u00f3blR\u00f3\u0003_l\u00f50\u00e4Q\u00fc\u009f\u00e5a{/\u00df\u0006\u00ee8z\u00c8\u00a0\u00d6G~\u00b4Q\u00fc\u009f\u00e5a{/\u00c373\u00f7{\u00ce\u00b3\u00d6Hce\u00db\u00fd\u00a2Q\u00fc\u009f\u00e5a{/\u00f8 \u0005^\u008aY\u00f1\u00a1\u00f1^DE\u00dbA\u0017I\u008cB\u00c3\"\u00e9Q\u00fc\u009f\u00e5a{/\u00c1\tK\u001ct\u00cc\u0084\u0098Qbi\u00daA<b\u00c4\u007f\n|\u00df\u0089\u00d3WI1\u0081\b\u00118\u0084:\u00db\u009e\\p\u0083\u0081\u0084A/b\u008eVCo\u00872\u00d8\u00ce^,\u008b\u00dc\u00d5B#a\u00f7<\u00f6\u008f\u00d6Rw/\u00da\u000f\u001el\u0098D\u0088\u00ef\u00bav\u00ce\u00de\u00d3\u00cd\u00b4Q\u00fc\u009f\u00e5a{/\u00f8 >|\u00e4=Q\u00fc\u009f\u00e5a{/\u00da\u0005\rQ\u00fc\u009f\u00e5a{/\u00da\u0004\u00d8<\u00ec7Y\u00d0\u0084\u00c1E9l\u00d7\u0000\u0017$\u00f8i\u0080\u0099\u000fa\u00813\u00d8<\u00e0-O\u001at\u00d6\u0090\u00d2kpn<\u00f3\u00e4Q\u00fc\u009f\u00e5a{/\u00c5\u0006\u0015Q\u00fc\u009f\u00e5a{/\u00c1?\"t\u00cc\u0084\u0098Hwn\u00d1A9e\u00c3n\u008d\u0099:\u00a2Q\u00fc\u009f\u00e5a{/\u00c1\t\u00b3`\\\u0093\u00a9\u00ddE`a\u0099\u0002\u0011e\u00d0$\u00a3\u0092<p\u00dd\u0080\u00c5\u001f\u0084Y\u00d0\u0084\u00c1E9l\u00d7\u0000\u0017$\u00e4\u007f\u0098\u00ec\u00b1r\u0081";
        lInrn = new int[]{9895946, 21495809, 23724035, 29294593, 23920659, 8519681, 3211266, 23068682, 12124161, 20119572, 16580622, 12189703, 0x110020, 13893633, 14024716, 0x330001, 0x100001, 0xAF000A, 25231363, 21561357, 17498152, 27525137, 0xCC0008, 26017795, 13959169, 10551310, 25427970, 26869770, 13303809, 14811163, 28639242, 65551, 1, 26214410, 7143445, 12648458, 25559047, 29360150, 21430273, 0x1800001, 9764866, 30801939, 22413322, 3407929, 8585234};
        sD.T();
        sD.s();
        sD.m();
        sD.P();
    }
}
