/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KDFzREm.NNNZZ
 *  KDFzREm.NNNbw
 *  KDFzREm.NNNwS
 *  KDFzREm.NNuU
 *  KDFzREm.NQl
 *  KDFzREm.NQo
 *  KDFzREm.NbL
 */
package KDFzREm;

import KDFzREm.NNNZZ;
import KDFzREm.NNNbw;
import KDFzREm.NNNwS;
import KDFzREm.NNuU;
import KDFzREm.NQl;
import KDFzREm.NQo;
import KDFzREm.NbL;
import KDFzREm.RE;
import KDFzREm.Ru;
import KDFzREm.Ti;
import KDFzREm.Tu;
import KDFzREm.UM;
import KDFzREm.UR;
import KDFzREm.UZ;
import KDFzREm.Uz;
import KDFzREm.dx;
import KDFzREm.il;
import KDFzREm.iw;
import KDFzREm.uF;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;

@UZ(L="QuickUse", y=UR.PLAYER, N=Uz.BASE)
public class TL
extends UM {
    private static byte[] u;
    private static byte[] i;
    private static short[] R;
    public Object[] L;
    private static short[] M;
    private static boolean[] B;
    private static String[] Z;
    private static String[] z;
    private static boolean[] U;
    private static short[] W;
    private static /* synthetic */ String ll0lkpml;
    private static /* synthetic */ int[] Olqnnnjl;

    private static /* synthetic */ int L(int n) {
        return -Integer.rotateLeft(Integer.rotateLeft((n ^ 0xF07B7D0C) + 1 ^ 0xFA905E2, 3), 15);
    }

    private static /* synthetic */ String M(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-52, 78, -1, -67, 81, -80, -71, 68, -49, 11, -40, -10, 38, 124, 6, -102};
        int n = 0;
        int n2 = 79;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 89;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private boolean P() {
        block7: {
            block6: {
                block5: {
                    block4: {
                        if (TL.lOjIs("iflm", 953474691, -11733670, -11733669, -11733645, 360283155, (NNNZZ)((NNNZZ)TL.lOjIs("csinsj", 953474689, -11733651, -11733659, -11733634, -1753911044, (NNuU)((NNuU)TL.lOjIs("wkweunul", 953474689, -11733638, -11733650, -11733634, 1197975293, (TL)this)[TL.lOjIs("fszfl", 953474695, -11733638, -11733633, -11733636, 1218392468)[3]]))[TL.lOjIs("vhvzhxy", 953474695, -11733638, -11733633, -11733636, 2131160059)[4]])) != false) break block4;
                        if (TL.lOjIs("uxnvb", 953474691, -11733671, -11733666, -11733645, 360283155, (NNNwS)((NNNwS)TL.lOjIs("csinsj", 953474689, -11733651, -11733659, -11733634, -1109341985, (NNuU)((NNuU)TL.lOjIs("wkweunul", 953474689, -11733638, -11733650, -11733634, -505199281, (TL)this)[TL.lOjIs("fszfl", 953474695, -11733638, -11733633, -11733636, -1111081738)[5]]))[TL.lOjIs("mvege", 953474695, -11733638, -11733672, -11733636, 537013888)[0]])) == false) break block5;
                    }
                    return (boolean)TL.lOjIs("csinsj", 953474695, -11733638, -11733657, -11733643, -481747441)[4];
                }
                if (TL.lOjIs("vhvzhxy", 953474691, -11733671, -11733665, -11733645, 360283155, (NNNwS)((NNNwS)TL.lOjIs("wkweunul", 953474689, -11733651, -11733659, -11733634, -1654541345, (NNuU)((NNuU)TL.lOjIs("pwpnxtdh", 953474689, -11733638, -11733650, -11733634, -901620196, (TL)this)[TL.lOjIs("wkweunul", 953474695, -11733638, -11733672, -11733636, 1441858375)[1]]))[TL.lOjIs("bxlv", 953474695, -11733638, -11733672, -11733636, 1772696921)[2]])) != false) break block6;
                if (TL.lOjIs("vhvzhxy", 953474691, -11733649, -11733668, -11733667, 360283155, (Integer)((Object)TL.lOjIs("iflm", 953474689, -11733651, -11733656, -11733634, -233389401, (NNuU)((NNuU)TL.lOjIs("vhvzhxy", 953474689, -11733638, -11733650, -11733634, 198598084, (TL)this)[TL.lOjIs("pwpnxtdh", 953474695, -11733638, -11733672, -11733636, 1739839947)[3]]))[TL.lOjIs("wabckjy", 953474695, -11733638, -11733672, -11733636, -1677622540)[4]])) == false) break block7;
            }
            return (boolean)TL.lOjIs("vhvzhxy", 953474695, -11733638, -11733657, -11733643, 1494065949)[5];
        }
        return (boolean)TL.lOjIs("fszfl", 953474695, -11733638, -11733657, -11733643, -68833833)[6];
    }

    private static void T() {
        U = new boolean[]{false, true, false, false, false, false, true};
        B = new boolean[]{true, false, true, false, true, false, true, false};
    }

    public TL() {
        TL.lOjIs("fszfl", 953474691, -11733638, -11733637, -11733640, 953474691, (TL)this);
        Tu[] tuArray = new Tu[TL.lOjIs("vhvzhxy", 953474695, -11733638, -11733674, -11733641, 953474695)[0]];
        tuArray[TL.lOjIs("mvege", 953474695, -11733638, -11733657, -11733643, 953474695)[0]] = new Tu((dx)((Object)TL.lOjIs("csinsj", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("wabckjy", 953474695, -11733673, -11733676, -11733675, 953474695))), (String)((Object)TL.lOjIs("wabckjy", 953474695, -11733638, -11733688, -11733687, 953474695)[0]), this);
        tuArray[TL.lOjIs("bxlv", 953474695, -11733638, -11733657, -11733643, 953474695)[1]] = new Tu((dx)((Object)TL.lOjIs("uxnvb", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("uxnvb", 953474695, -11733673, -11733682, -11733675, 953474695))), (String)((Object)TL.lOjIs("csinsj", 953474695, -11733638, -11733688, -11733687, 953474695)[1]), this);
        tuArray[TL.lOjIs("csinsj", 953474695, -11733638, -11733674, -11733641, 953474695)[1]] = new Tu((dx)((Object)TL.lOjIs("iflm", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("vhvzhxy", 953474695, -11733673, -11733681, -11733675, 953474695))), (String)((Object)TL.lOjIs("bxlv", 953474695, -11733638, -11733688, -11733687, 953474695)[2]), this);
        tuArray[TL.lOjIs("iflm", 953474695, -11733638, -11733674, -11733641, 953474695)[2]] = new Tu((dx)((Object)TL.lOjIs("vhvzhxy", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("iflm", 953474695, -11733673, -11733684, -11733675, 953474695))), (String)((Object)TL.lOjIs("wabckjy", 953474695, -11733638, -11733688, -11733687, 953474695)[3]), this);
        tuArray[TL.lOjIs("uxnvb", 953474695, -11733638, -11733674, -11733641, 953474695)[3]] = new Tu((dx)((Object)TL.lOjIs("uxnvb", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("mvege", 953474695, -11733673, -11733683, -11733675, 953474695))), (String)((Object)TL.lOjIs("iflm", 953474695, -11733638, -11733688, -11733687, 953474695)[4]), this);
        tuArray[TL.lOjIs("mvege", 953474695, -11733638, -11733674, -11733641, 953474695)[4]] = new Tu((dx)((Object)TL.lOjIs("vhvzhxy", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("wabckjy", 953474695, -11733673, -11733694, -11733675, 953474695))), (String)((Object)TL.lOjIs("mvege", 953474695, -11733638, -11733688, -11733687, 953474695)[5]), this);
        tuArray[TL.lOjIs("mvege", 953474695, -11733638, -11733674, -11733641, 953474695)[5]] = new Ti(nQo -> {
            NNNbw[] nNNbwArray = new NNNbw[TL.lOjIs("bxlv", 953474695, -11733638, -11733644, -11733643, 1049942850)[4]];
            nNNbwArray[TL.lOjIs("fszfl", 953474695, -11733638, -11733644, -11733643, -2023587682)[5]] = TL.lOjIs("csinsj", 953474695, -11733678, -11733656, -11733677, 1613590350);
            return (boolean)TL.lOjIs("bxlv", 953474701, -11733680, -11733647, -11733679, 360283155, (NQo)nQo, (NNNbw[])nNNbwArray);
        }, (String)((Object)TL.lOjIs("uxnvb", 953474695, -11733638, -11733688, -11733687, 953474695)[6]), this);
        tuArray[TL.lOjIs("mvege", 953474695, -11733638, -11733674, -11733641, 953474695)[6]] = new Tu(nQo -> {
            CallSite callSite;
            if (TL.lOjIs("csinsj", 953474691, -11733690, -11733647, -11733689, 360283155, (NQo)nQo, (NQl)TL.lOjIs("iflm", 953474695, -11733673, -11733695, -11733675, -1582138280)) != false) {
                NNNbw[] nNNbwArray = new NNNbw[TL.lOjIs("pwpnxtdh", 953474695, -11733638, -11733644, -11733643, -736672047)[0]];
                nNNbwArray[TL.lOjIs("iflm", 953474695, -11733638, -11733644, -11733643, 1745127921)[1]] = TL.lOjIs("bxlv", 953474695, -11733678, -11733633, -11733677, -1574878964);
                if (TL.lOjIs("vhvzhxy", 953474701, -11733680, -11733647, -11733679, 360283155, (NQo)nQo, (NNNbw[])nNNbwArray) != false) {
                    callSite = TL.lOjIs("wkweunul", 953474695, -11733638, -11733644, -11733643, -1964040095)[2];
                    return (boolean)callSite;
                }
            }
            callSite = TL.lOjIs("wkweunul", 953474695, -11733638, -11733644, -11733643, -1017953943)[3];
            return (boolean)callSite;
        }, (String)((Object)TL.lOjIs("mvege", 953474695, -11733638, -11733693, -11733687, 953474695)[0]), this);
        tuArray[TL.lOjIs("wkweunul", 953474695, -11733638, -11733642, -11733641, 953474695)[0]] = new Tu((dx)((Object)TL.lOjIs("csinsj", 953474701, -11733686, -11733647, -11733685, 953474701, (NQl)TL.lOjIs("uxnvb", 953474695, -11733673, -11733696, -11733675, 953474695))), (String)((Object)TL.lOjIs("fszfl", 953474695, -11733638, -11733693, -11733687, 953474695)[1]), this);
        Tu[] tuArray2 = tuArray;
        TL.lOjIs("mvege", 953474689, -11733638, -11733639, -11733634, 953474689, (TL)this)[TL.lOjIs("pwpnxtdh", 953474695, -11733638, -11733656, -11733636, 953474695)[0]] = tuArray2;
    }

    static {
        TL.ntfClinit();
    }

    private static /* synthetic */ String B(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{42, 25, 14, 66, 124, 91, -126, 18, -85, -69, 70, 94, -61, -101, -35, -117};
        int n = 0;
        int n2 = 220;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 107;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String Z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-36, 84, -53, 124, -118, 11, -16, -101, -86, -32, 46, 58, -58, -19, 119, -120};
        int n = 0;
        int n2 = 57;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 217;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String i(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-106, 74, -75, -75, 100, -81, 84, -47, 71, 62, 84, 86, 75, -80, 46, 93};
        int n = 0;
        int n2 = 208;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 233;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static void b() {
        M = new short[]{0, 1, 0, 4};
        R = new short[]{0, 1, 0, 0, 2, 0};
        W = new short[]{4, 0, 4, 0, 4};
    }

    private static void s() {
        Z = new String[]{"shield", "milk", "chorus", "golden-apple", "enchanted-golden-apple", "bottle-of-exp", "instant-damage"};
        z = new String[]{"instant-health", "trident"};
    }

    private void m() {
        if (TL.lOjIs("iflm", 953474689, -11733638, -11733639, -11733634, 953474689, (TL)this) == null) {
            TL.lOjIs("csinsj", 953474688, -11733638, -11733639, -11733634, 953474688, (TL)this, (Object[])new Object[TL.lOjIs("uxnvb", 953474695, -11733638, -11733642, -11733641, 953474695)[2]]);
            CallSite callSite = TL.lOjIs("vhvzhxy", 953474689, -11733638, -11733639, -11733634, 953474689, (TL)this);
            callSite[TL.lOjIs("vhvzhxy", 953474695, -11733638, -11733644, -11733643, 953474695)[6]] = TL.lOjIs("pwpnxtdh", 953474701, -11733635, -11733654, -11733653, 953474701, (boolean)TL.lOjIs("mvege", 953474695, -11733638, -11733644, -11733643, 953474695)[7]);
        }
    }

    private static void j() {
        i = new byte[]{9, 2, 3, 4, 5, 6, 7};
        u = new byte[]{8, 4, 2};
    }

    private static /* synthetic */ String U(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{114, -93, 77, -88, -62, 32, -36, 14, -52, -1, 43, 54, 102, 88, 49, -82};
        int n = 0;
        int n2 = 11;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 173;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String z(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{72, 82, 114, 28, -14, 43, -71, -118, -42, 88, 112, 37, -42, -113, 0, -6};
        int n = 0;
        int n2 = 153;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 195;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ String u(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{-37, 122, -113, 11, 5, 1, -18, 92, 95, -38, 61, -61, 9, -48, 115, 6};
        int n = 0;
        int n2 = 238;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 153;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int u(int n) {
        return -Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(Integer.rotateRight(n, 14) ^ 0x71E24230, 5), 5), 18), 9);
    }

    private static /* synthetic */ String y(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{66, 8, -36, -111, -74, -17, 67, -112, 0, 12, 97, 94, -32, -14, -41, 33};
        int n = 0;
        int n2 = 205;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 5;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ int y(int n) {
        return -Integer.rotateRight(Integer.rotateRight(n, 30) ^ 0xAE6C3C1B, 25) ^ 0x67F405BB;
    }

    /*
     * WARNING - void declaration
     */
    @uF(u=true)
    public void N(iw iw2) {
        void var4_5;
        TL.lOjIs("vhvzhxy", 953474691, -11733638, -11733637, -11733640, 953474691, (TL)this);
        Tu[] tuArray = (Tu[])TL.lOjIs("pwpnxtdh", 953474689, -11733638, -11733639, -11733634, 953474689, (TL)this)[TL.lOjIs("uxnvb", 953474695, -11733638, -11733633, -11733636, 953474695)[2]];
        int n = tuArray.length;
        CallSite callSite = TL.lOjIs("wabckjy", 953474695, -11733638, -11733657, -11733643, 953474695)[3];
        while (var4_5 < n) {
            Tu tu = tuArray[var4_5];
            TL.lOjIs("uxnvb", 953474691, -11733660, -11733647, -11733692, 953474691, (Tu)tu, (il)iw2);
            ++var4_5;
        }
    }

    private static /* synthetic */ int N(int n) {
        return -Integer.rotateRight(Integer.rotateLeft((n ^ 0xD8308508) + 1, 20), 23);
    }

    /*
     * WARNING - void declaration
     */
    @uF
    public void N(Ru ru) {
        void var4_6;
        TL.lOjIs("vhvzhxy", 953474691, -11733638, -11733637, -11733640, 360283155, (TL)this);
        if (TL.lOjIs("bxlv", 953474691, -11733635, -11733646, -11733645, 360283155, (Boolean)((Boolean)((Object)TL.lOjIs("pwpnxtdh", 953474689, -11733638, -11733639, -11733634, 1464677103, (TL)this)[TL.lOjIs("vhvzhxy", 953474695, -11733638, -11733656, -11733636, 1015223518)[1]]))) != false && TL.lOjIs("vhvzhxy", 953474691, -11733638, -11733655, -11733645, 360283155, (TL)this) != false) {
            CallSite callSite = TL.lOjIs("uxnvb", 953474701, -11733649, -11733654, -11733652, 360283155, (int)TL.lOjIs("uxnvb", 953474695, -11733638, -11733642, -11733641, -828145039)[1]);
            TL.lOjIs("fszfl", 953474689, -11733651, -11733656, -11733634, -127744750, (NNuU)((NNuU)TL.lOjIs("pwpnxtdh", 953474689, -11733638, -11733650, -11733634, -1966758079, (TL)this)[TL.lOjIs("uxnvb", 953474695, -11733638, -11733656, -11733636, 1395453969)[2]]))[TL.lOjIs("bxlv", 953474695, -11733638, -11733656, -11733636, 1443312805)[3]] = callSite;
            TL.lOjIs("uxnvb", 953474701, -11733663, -11733647, -11733658, 360283155, (NbL)TL.lOjIs("vhvzhxy", 953474695, -11733662, -11733661, -11733664, 2097983819));
        }
        Tu[] tuArray = (Tu[])TL.lOjIs("mvege", 953474689, -11733638, -11733639, -11733634, -2132493347, (TL)this)[TL.lOjIs("bxlv", 953474695, -11733638, -11733633, -11733636, -877382715)[0]];
        int n = tuArray.length;
        CallSite callSite = TL.lOjIs("fszfl", 953474695, -11733638, -11733657, -11733643, 1678028490)[2];
        while (var4_6 < n) {
            Tu tu = tuArray[var4_6];
            TL.lOjIs("bxlv", 953474691, -11733660, -11733639, -11733640, 360283155, (Tu)tu);
            ++var4_6;
        }
    }

    @uF
    public void N(RE rE) {
        TL.lOjIs("vhvzhxy", 953474691, -11733638, -11733637, -11733640, 360283155, (TL)this);
        if (TL.lOjIs("bxlv", 953474691, -11733635, -11733646, -11733645, 360283155, (Boolean)((Boolean)((Object)TL.lOjIs("wkweunul", 953474689, -11733638, -11733639, -11733634, -1240850515, (TL)this)[TL.lOjIs("iflm", 953474695, -11733638, -11733633, -11733636, -989104411)[1]]))) != false) {
            TL.lOjIs("fszfl", 953474691, -11733648, -11733647, -11733640, 360283155, (RE)rE);
        }
    }

    private static /* synthetic */ String R(String string) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{103, 8, -39, -87, 44, -80, 49, 22, 0, 91, 116, -97, -105, -2, 73, 19};
        int n = 0;
        int n2 = 254;
        while (n < byArray.length) {
            byArray[n] = (byte)(byArray[n] ^ byArray2[n % byArray2.length] ^ byArray2[(n2 & 0xFF) % byArray2.length]);
            ++n;
            n2 += 161;
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ CallSite l1r0m0il(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5, int n6) throws Exception {
        int n7 = Olqnnnjl[n2 ^ 0xFF4CF57A];
        int n8 = n7 >>> 16;
        String string2 = TL.ooijmkqn(ll0lkpml.substring(n8, n8 + (n7 & 0xFFFF)), n2 ^ 0xFF4CF57A);
        n7 = Olqnnnjl[n3 ^ 0xFF4CF57A];
        int n9 = n7 >>> 16;
        String string3 = TL.ooijmkqn(ll0lkpml.substring(n9, n9 + (n7 & 0xFFFF)), n3 ^ 0xFF4CF57A);
        n7 = Olqnnnjl[n4 ^ 0xFF4CF57A];
        int n10 = n7 >>> 16;
        String string4 = TL.ooijmkqn(ll0lkpml.substring(n10, n10 + (n7 & 0xFFFF)), n4 ^ 0xFF4CF57A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x38D4DE35) + -178;
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

    private static /* synthetic */ CallSite Iljtijklt(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Olqnnnjl[n2 ^ 0xFF4CF57A];
        int n7 = n6 >>> 16;
        String string2 = TL.ooijmkqn(ll0lkpml.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xFF4CF57A);
        n6 = Olqnnnjl[n3 ^ 0xFF4CF57A];
        int n8 = n6 >>> 16;
        String string3 = TL.ooijmkqn(ll0lkpml.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xFF4CF57A);
        n6 = Olqnnnjl[n4 ^ 0xFF4CF57A];
        int n9 = n6 >>> 16;
        String string4 = TL.ooijmkqn(ll0lkpml.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xFF4CF57A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x38D4DE35) + -178;
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

    private static /* synthetic */ CallSite lOjIs(MethodHandles.Lookup lookup, String string, MethodType methodType, int n, int n2, int n3, int n4, int n5) throws Exception {
        int n6 = Olqnnnjl[n2 ^ 0xFF4CF57A];
        int n7 = n6 >>> 16;
        String string2 = TL.ooijmkqn(ll0lkpml.substring(n7, n7 + (n6 & 0xFFFF)), n2 ^ 0xFF4CF57A);
        n6 = Olqnnnjl[n3 ^ 0xFF4CF57A];
        int n8 = n6 >>> 16;
        String string3 = TL.ooijmkqn(ll0lkpml.substring(n8, n8 + (n6 & 0xFFFF)), n3 ^ 0xFF4CF57A);
        n6 = Olqnnnjl[n4 ^ 0xFF4CF57A];
        int n9 = n6 >>> 16;
        String string4 = TL.ooijmkqn(ll0lkpml.substring(n9, n9 + (n6 & 0xFFFF)), n4 ^ 0xFF4CF57A);
        Class<?> clazz = Class.forName(string2.replace('/', '.'), false, lookup.lookupClass().getClassLoader());
        n = (n ^ 0x38D4DE35) + -178;
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

    private static /* synthetic */ String ooijmkqn(String string, int n) {
        byte[] byArray = string.getBytes(StandardCharsets.ISO_8859_1);
        byte[] byArray2 = new byte[]{20, -23, 87, -111, -108, 92, -9, -122, 43, -119, 127, -16, -19, -85, 7, 113};
        byte[] byArray3 = new byte[]{52, -14, -8, -49, -47, -6, 69, 85, -60, 57, 122, 8, 2, 83, -69, 106};
        byArray3[0] = (byte)(byArray3[0] ^ n);
        byArray3[1] = (byte)(byArray3[1] ^ n >>> 8);
        byArray3[2] = (byte)(byArray3[2] ^ n >>> 16);
        byArray3[3] = (byte)(byArray3[3] ^ n >>> 24);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(byArray[i] ^ byArray2[i & 0xF] ^ byArray2[(byArray3[i + 1 & 0xF] | 1) * (byArray3[i & 0xF] + i) & 0xF]);
        }
        return new String(byArray, StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        ll0lkpml = ";U\u00eb\u0082T\u00d6#.\u00abQ\u0082\u0015\u00a9\u0096\u00c0\u0019\u00f4p\u00c5\u00aav\u00f3DS\u00f6F\u00deR\u00e4\u0080h\u00fe4\u0006\u00e90\u00a57\u00f0\u00c8\u00ad \u00b8J\u00b1R\u00e4\u0080h\u00fe4\u0006\u00e90\u00ba\u0015\u00a9\u0014\u0081O\u00e8\u0017U\u00eb\u0082T\u00d6#.\u00abQ\u00a5\u001b\u00de\u0084\u00bf\u00ce\u00d1j\u00e8|\u00d4\u00ae}\u00c8.]\u00f7O\u00de\u008aw\u00d4\u0090s\u00c0\u0004\u000e\u00a9k0\u00f6X]\u00e6\u00bc@\u00e9\u001cD\u0092\u000b\u00bf[y\u00ff|\u00cb]\u00e6\u00bc@\u00e9\u001cD\u0088\u001c\u00a7\u00a6C\u00f4]\u00e6\u00bc@\u00e9\u001cD\u00b1' ]\u00e6\u00bc@\u00e9\u001cD\u0094;V\u00ccU\u00eb\u0082T\u00d6#.\u00abQ\u00a5(\u00fe\u0084\u00bf\u00c2\u0097U\u00eb\u0082T\u00d6#.\u00abQ\u00a5(\u00fd\u0084\u00cd\u00bb\u00f4]\u00e6\u00bc@\u00e9\u001cD\u00880\u00a5\u001b\u00e5\u0084\u00bf\u00ad\u00b1\u000f{\u0004MU\u00eb\u0082T\u00d6#.\u00abQ\u00a5(\u00fe\u0084\u00bf\u0096.]\u00e6\u00bc@\u00e9\u001cD\u00a2\u0006\u00d0\u00efx\u00d6\u00a7=\u00c0\u0010\u0005\u00a1Q\u00a2\u0017\u00e6\u00da\u00f1\u009d\u00f7\u00b2]\u00e6\u00bc@\u00e9\u001cD\u00880\u00a5#\u00c8t]\u00e6\u00bc@\u00e9\u001cD\u0088/\u0084\u00d7\u00b50\u00e9\u00af]\u00e6\u00bc@\u00e9\u001cD\u0088/\u008a\u008fx\u00cc\u00b3w\u00e3\u0017\u0018\u000e\u00f1\u00e2v\u00cf\u00aaw\u00cd\u001f=\u00a7\u0012\u009e\u001c\u00b2]\u00e6\u00bc@\u00e9\u001cD\u00922MC\u0089\u008ax\u00cd\u0007\n\u00e9\u0012\u008a\u0017\u00f5\u0090\u00d4\u00b5\nu\u00c5\u00a7|\u0097Q[U\u00ca\u00a7d\u00cd^\u0007\u00a7\u0010\u008cV\u00dd\u00dd\u00fc\u009dcm\u009b\u00f7x\u00d6\u00a7=\u00c0\u0010\u0005\u00a1Q\u00a9\u0016\u00fd\u00d3\u00f3\u00e0\u00f3\u0013U\u00ca\u00a7d\u00cd^\u0007\u00a7\u0010\u008cV\u00c1\u00cb\u00e4i&~\u009b\u00cb]\u00e6\u00bc@\u00e9\u001cD\u0088\u001c\u00a2'R\u00e4\u0080h\u00fe4\u0006\u00e90\u00895\u00a9\bJn\u00c7[\u007fvjM\u00d6]\u00e6\u00bc@\u00e9\u001cD\u00880\u009e, ]\u00e6\u00bc@\u00e9\u001cD\u00b1\u000b\u00e9m\u0003]\u00e6\u00bc@\u00e9\u001cD\u00880\u00a5\u000e\u00c1\u00b2]\u00e6\u00bc@\u00e9\u001cD\u00a2\u0006\u00ba0\u00fa\u00cbP\u0089\u008ax\u00cd\u0007\n\u00e9\u0012\u008a\u0017\u00f5\u0090\u00df\u00ef\u0097|\u00c7\u00a3`\u0097";
        Olqnnnjl = new int[]{20185098, 27525121, 0x630003, 13238273, 22347795, 0x10F0001, 0x2A0002, 23592977, 19398668, 31195139, 9175050, 19333121, 27590657, 0x700002, 22282241, 0x800002, 18743303, 20840470, 19267585, 19202049, 7471105, 15073297, 31391766, 28114956, 7667723, 0x10000A, 26673165, 8519690, 3997712, 13041665, 0x66000A, 6422529, 16187405, 2686977, 3735553, 29687821, 27656193, 5177355, 5898248, 0x1100003, 25952267, 1703951, 28901386, 10944544, 9830401, 18022411, 27852802, 2883597, 30539786, 13303835, 983041, 24707091, 27983874, 29556738, 3801090, 7536642, 27721730, 3932161, 13107202, 5046274, 17039371, 9895952, 15};
        TL.b();
        TL.j();
        TL.T();
        TL.s();
    }

    private static /* synthetic */ void l1psl(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[63];
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
        ll0lkpml = stringBuilder.toString();
        Olqnnnjl = nArray;
    }
}
