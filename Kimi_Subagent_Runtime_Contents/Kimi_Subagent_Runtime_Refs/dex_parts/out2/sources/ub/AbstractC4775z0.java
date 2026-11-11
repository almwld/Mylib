package ub;

import Cf.C0439y6;
import Dc.C0639v;
import Dc.C0660x2;
import Gc.C0889d1;
import Gc.C0948u1;
import Wc.C2175b;
import Wh.C2250b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.C4068d;

/* JADX INFO: renamed from: ub.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class AbstractC4775z0 {
    public static final void a(p1.r rVar, Wh.B b, C2250b c2250b, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(b, "previewPagerItem");
        Intrinsics.checkNotNullParameter(c2250b, "model");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(36879288);
        int i2 = (tVar.f(b) ? 32 : 16) | i | (tVar.h(c2250b) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = c2250b.a().e;
            p1.r rVarThen = rVar.then(androidx.compose.foundation.layout.d.c);
            N1.d0 d0VarD = t0.n.d(p1.c.e, false);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarThen);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            String str2 = b.c;
            boolean zH = tVar.h(c2250b);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zH || objT == obj) {
                objT = new W0.z2(6, c2250b);
                tVar.s0(objT);
            }
            Function1 function1 = (Function1) objT;
            Object objT2 = tVar.T();
            if (objT2 == obj) {
                objT2 = new C2175b(27);
                tVar.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            Object objT3 = tVar.T();
            if (objT3 == obj) {
                objT3 = new Wh.d(2);
                tVar.s0(objT3);
            }
            W5.a(str, str2, function1, function0, (Function1) objT3, tVar, 221232);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Wh.t(rVar, b, c2250b, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ue.C4801l b(Cf.C0439y6 r20) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.AbstractC4775z0.b(Cf.y6):ue.l");
    }

    public static final void c(C0439y6 c0439y6) {
        Object next;
        Cf.P3 p3 = c0439y6.j;
        Iterator it = p3.k0.o().s.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.b(((Dc.B2) next).c, C0660x2.d)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Dc.B2 b2 = (Dc.B2) next;
        if (b2 != null) {
            List<Dc.H6> list = p3.p().e().c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (Dc.H6 h6 : list) {
                if (Intrinsics.b(h6.a, Fc.H.d) || Intrinsics.b(h6.a, Fc.I.d)) {
                    p3.k0.v(b2.c);
                    return;
                }
            }
        }
    }

    public static final void d(C0439y6 c0439y6, C0639v c0639v) {
        if (c0639v.a.length() > 0) {
            Cf.P3 p3 = c0439y6.j;
            if (p3.M()) {
                Jc.b bVar = rh.d.a;
                p3.g0(rh.d.a());
            } else {
                p3.B0(rh.d.g(2, c0639v));
            }
            if (K5.i(p3.D()) && Intrinsics.b(p3.D().g, C0660x2.d)) {
                S7.b bVar2 = p3.k0;
                C4068d c4068d = Ah.f.a;
                bVar2.z(Ah.f.b(C0948u1.d));
            }
            c(c0439y6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Zd.y e(Cf.C0439y6 r27, java.util.List r28, Gf.U r29, ub.AbstractC4730u0 r30) {
        /*
            Method dump skipped, instruction units count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.AbstractC4775z0.e(Cf.y6, java.util.List, Gf.U, ub.u0):Zd.y");
    }

    public static Zd.y f(C0439y6 c0439y6, Gf.U u, int i) {
        kotlin.collections.I i2 = kotlin.collections.I.a;
        if ((i & 2) != 0) {
            u = new Gf.U((C0889d1) null, (Gf.l2) null, (Gf.m2) null, (Gf.Q0) null, (Gf.e2) null, (Dc.D2) null, (Dc.B2) null, 255);
        }
        return e(c0439y6, i2, u, null);
    }

    public static String g(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i2, iIndexOf);
            sb2.append(h(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb2.append(str2);
                sb2.append(h(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String h(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strI = v.z.i(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strI.length() + 8 + name2.length() + 1);
            A8.b.x(sb2, "<", strI, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
