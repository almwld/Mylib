package vb;

import Dc.C0486d7;
import Dc.C0568n;
import Dc.Z6;
import android.widget.Toast;
import bc.C2424a;
import dg.C2978a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.C3692j;
import je.C3694k;
import je.C3695k0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mg.AbstractC4002a;
import qg.AbstractC4261D;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class J3 {
    public static z8.p a(En.B b, En.n nVar, String str, A8.j jVar, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            jVar = null;
        }
        return new z8.p(b, nVar, str, jVar);
    }

    public static z8.s b(En.j jVar, En.n nVar) {
        return new z8.s(jVar, nVar, (I3) null);
    }

    public static final boolean c(Z6 z6) {
        Intrinsics.checkNotNullParameter(z6, "<this>");
        C2424a c2424a = Zd.B.b;
        String str = z6.b;
        c2424a.getClass();
        return C2424a.k(str) == Zd.B.q1;
    }

    public static final boolean d(C3695k0 c3695k0) {
        Intrinsics.checkNotNullParameter(c3695k0, "<this>");
        C0568n c0568n = (C0568n) CollectionsKt.d0(c3695k0.a.m);
        if (c0568n != null && c0568n.i() && c(c0568n.p())) {
            List list = c0568n.p().r;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!StringsKt.W(((C0486d7) it.next()).c())) {
                }
            }
            return true;
        }
        return false;
    }

    public static final List e(Z6 z6) {
        Object objA;
        Object next;
        Intrinsics.checkNotNullParameter(z6, "<this>");
        Iterator it = z6.r.iterator();
        while (true) {
            objA = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0486d7) next).c().length() > 0) {
                break;
            }
        }
        C0486d7 c0486d7 = (C0486d7) next;
        if (c0486d7 == null) {
            return kotlin.collections.I.a;
        }
        String strC = c0486d7.c();
        C3692j c3692j = C3694k.Companion;
        c3692j.getClass();
        Intrinsics.checkNotNullParameter(strC, "jsonStr");
        Zf.f fVar = Zf.f.a;
        try {
            if (strC.length() != 0) {
                kn.t tVar = Zf.f.c;
                tVar.getClass();
                objA = tVar.a(N2.j(new jn.d(c3692j.serializer(), 0)), strC);
            }
        } catch (Throwable th2) {
            boolean z = C2978a.a;
            s3.e.v(strC, th2, "KimiJson", (Throwable) null);
        }
        List list = (List) objA;
        return list == null ? kotlin.collections.I.a : list;
    }

    public static final void f() {
        Pf.B.L(Pf.B.p(Qk.O.b()), null, 6);
    }

    public static final void g() {
        Qk.F f = Qk.F.d;
        Sk.w wVar = Qk.X.a;
        Intrinsics.checkNotNullParameter(f, "<this>");
        Pf.B.L(Pf.B.p((Zn.L) Qk.X.V.getValue()), null, 6);
    }

    public static void h(Zn.L l, int i) {
        Intrinsics.checkNotNullParameter(l, "msg");
        Pf.E e = Pf.E.a;
        Intrinsics.checkNotNullParameter(e, "duration");
        String strP = Pf.B.p(l);
        Intrinsics.checkNotNullParameter(strP, "msg");
        Intrinsics.checkNotNullParameter(e, "duration");
        Toast toast = AbstractC4261D.a;
        AbstractC4002a.a();
        AbstractC4261D.a(e, strP, Ui.l.a(), true);
    }
}
