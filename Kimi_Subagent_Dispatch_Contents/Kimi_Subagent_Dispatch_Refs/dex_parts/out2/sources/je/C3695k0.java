package je;

import Dc.AbstractC0493e5;
import Dc.AbstractC0616s3;
import Dc.C0545k3;
import Dc.C0554l3;
import Dc.C0568n;
import Dc.C0572n3;
import Dc.C0590p3;
import Dc.G2;
import Dc.G4;
import Dc.I4;
import Dc.R4;
import Dc.S4;
import Dc.X4;
import bc.C2424a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ub.AbstractC4646k5;
import ub.L7;
import vb.I2;

/* JADX INFO: renamed from: je.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C3695k0 {
    public static final C3695k0 h = new C3695k0(new Dc.N(null, null, null, null, null, null, null, 65535), (C3697l0) null, 0, (C3657O) null, (F0) null, 58);
    public static final C3695k0 i = new C3695k0(new Dc.N(null, null, null, null, null, null, null, 65535), (C3697l0) null, 0, (C3657O) null, (F0) null, 58);
    public static final C3695k0 j = new C3695k0(new Dc.N("empty_for_scroll_to_bottom", I4.d, null, null, null, null, null, 65530), (C3697l0) null, 0, (C3657O) null, (F0) null, 58);
    public final Dc.N a;
    public final C3697l0 b;
    public final int c;
    public final String d;
    public final C3657O e;
    public final F0 f;
    public final ArrayList g;

    /* JADX WARN: Removed duplicated region for block: B:145:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3695k0(Dc.N r10, je.C3697l0 r11, int r12, java.lang.String r13, je.C3657O r14, je.F0 r15) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je.C3695k0.<init>(Dc.N, je.l0, int, java.lang.String, je.O, je.F0):void");
    }

    public static C3693j0 F(C3695k0 c3695k0) {
        c3695k0.getClass();
        Intrinsics.checkNotNullParameter(c3695k0, "source");
        C3693j0 c3693j0 = new C3693j0();
        c3693j0.a = I2.e(c3695k0.a);
        C3697l0 c3697l0 = c3695k0.b;
        c3697l0.getClass();
        Intrinsics.checkNotNullParameter(c3697l0, "source");
        d1.L l = new d1.L(3);
        l.b = c3697l0.a;
        l.c = c3697l0.b;
        c3693j0.b = l;
        c3693j0.c = c3695k0.c;
        c3693j0.d = c3695k0.d;
        C3657O c3657o = c3695k0.e;
        c3657o.getClass();
        Intrinsics.checkNotNullParameter(c3657o, "source");
        C3656N c3656n = new C3656N();
        c3656n.d = c3657o.a;
        c3656n.a = c3657o.b;
        c3656n.e = CollectionsKt.D0(c3657o.c);
        c3656n.f = CollectionsKt.D0(c3657o.d);
        c3656n.b = c3657o.e;
        c3656n.c = c3657o.f;
        c3693j0.e = c3656n;
        c3693j0.f = c3695k0.f;
        return c3693j0;
    }

    public final boolean A() {
        Dc.M mA1 = this.a.h;
        if (mA1 == null) {
            mA1 = Dc.M.Companion.M0(0);
        }
        return Intrinsics.b(mA1, Dc.J.d);
    }

    public final boolean B() {
        Dc.M mA1 = this.a.h;
        if (mA1 == null) {
            mA1 = Dc.M.Companion.M0(0);
        }
        return Intrinsics.b(mA1, Dc.L.d);
    }

    public final boolean C() {
        return Intrinsics.b(this.a.a, "welcome_message_id");
    }

    public final boolean D() {
        if (!n() || C()) {
            return false;
        }
        List list = this.a.m;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C0568n) it.next()).m != null) {
                    return false;
                }
            }
        }
        return r();
    }

    public final boolean E() {
        if (!n()) {
            return false;
        }
        List<C0568n> list = this.a.m;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C0568n c0568n : list) {
                if (c0568n.n == null && c0568n.o == null) {
                    return false;
                }
            }
        }
        return x();
    }

    public final boolean G(C3695k0 c3695k0) {
        Intrinsics.checkNotNullParameter(c3695k0, "other");
        Dc.N n = this.a;
        String str = n.a;
        Dc.N n2 = c3695k0.a;
        if (Intrinsics.b(str, n2.a) && n.e().f()) {
            AbstractC0616s3 abstractC0616s3E = n.e();
            AbstractC0616s3 abstractC0616s3E2 = n2.e();
            Intrinsics.checkNotNullParameter(abstractC0616s3E, "<this>");
            Intrinsics.checkNotNullParameter(abstractC0616s3E2, "other");
            int iD = AbstractC4646k5.d(abstractC0616s3E) - AbstractC4646k5.d(abstractC0616s3E2);
            if (iD <= 0) {
                if (iD >= 0) {
                    boolean z = n.m.size() > n2.m.size();
                    boolean z2 = this.c > c3695k0.c;
                    if (z || z2) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final String H() {
        Dc.N n = this.a;
        return "[role=" + n.c + ", id=" + n.a + ", status=" + n.e();
    }

    public final boolean a() {
        return (z() && r()) || o();
    }

    public final String b() {
        List list = this.a.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C0568n) obj).h()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.Z(arrayList, "\n", (String) null, (String) null, new j0.H0(6), 30);
    }

    public final String c() {
        Zd.y yVar;
        Zd.z zVar;
        String str;
        Zd.A a = this.e.a;
        return (a == null || (yVar = a.b) == null || (zVar = yVar.d) == null || (str = zVar.b) == null || str.length() <= 0) ? "text" : "talk";
    }

    public final String d() {
        List list = this.a.m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C0568n c0568n = (C0568n) obj;
            if (c0568n.h() && c0568n.n().a.length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.Z(arrayList, "\n", (String) null, (String) null, new j0.H0(7), 30);
    }

    public final boolean e() {
        List list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0568n) it.next()).l != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3695k0)) {
            return false;
        }
        C3695k0 c3695k0 = (C3695k0) obj;
        return Intrinsics.b(this.a, c3695k0.a) && Intrinsics.b(this.b, c3695k0.b) && this.c == c3695k0.c && Intrinsics.b(this.d, c3695k0.d) && Intrinsics.b(this.e, c3695k0.e) && Intrinsics.b(this.f, c3695k0.f);
    }

    public final boolean f() {
        List<C0568n> list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C0568n c0568n : list) {
            Intrinsics.checkNotNullParameter(c0568n, "<this>");
            if (AbstractC4646k5.h(c0568n) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        Dc.N n = this.a;
        List list = n.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C0568n) it.next()).p().b;
            C2424a c2424a = Zd.B.b;
            if (Intrinsics.b(str, "generate_image")) {
                return Intrinsics.b(n.f, S4.d);
            }
        }
        return false;
    }

    public final boolean h() {
        List list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0568n) it.next()).i != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + Ie.K0.d(cn.jiguang.commons.a.A.A(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31);
    }

    public final boolean i() {
        return !this.a.d().c.isEmpty() || g();
    }

    public final boolean j() {
        List list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0568n) it.next()).v != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        List list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0568n) it.next()).e != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        List<C0568n> list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C0568n c0568n : list) {
            if (c0568n.l != null && Intrinsics.b(c0568n.b().b, Cc.h.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        List list = this.a.m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0568n) it.next()).g != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return Intrinsics.b(this.a.c, G4.d);
    }

    public final boolean o() {
        return (!n() || C() || this.e.b || t() || f()) ? false : true;
    }

    public final boolean p() {
        return Intrinsics.b(this.a.e(), C0545k3.d);
    }

    public final boolean q() {
        EnumC3699m0 enumC3699m0 = this.b.a;
        if (enumC3699m0 != EnumC3699m0.f) {
            return enumC3699m0 == EnumC3699m0.g && Intrinsics.b(this.a.e(), C0572n3.d);
        }
        return true;
    }

    public final boolean r() {
        return Intrinsics.b(this.a.e(), C0554l3.d);
    }

    public final boolean s(boolean z) {
        Dc.N n = this.a;
        if (z) {
            if (!Intrinsics.b(n.f, X4.d)) {
                return false;
            }
            G2 g2C = n.c();
            Intrinsics.checkNotNullParameter(g2C, "<this>");
            return Intrinsics.b(g2C.a, "deep-researcher");
        }
        if (Intrinsics.b(n.f, R4.d)) {
            return true;
        }
        if (!Intrinsics.b(n.f, X4.d)) {
            return false;
        }
        G2 g2C2 = n.c();
        Intrinsics.checkNotNullParameter(g2C2, "<this>");
        return Intrinsics.b(g2C2.a, "deep-researcher");
    }

    public final boolean t() {
        return Intrinsics.b(this.a.e(), C0572n3.d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageItem(data=");
        sb2.append(this.a);
        sb2.append(", localStatus=");
        sb2.append(this.b);
        sb2.append(", eventOffset=");
        S0.b.u(this.c, ", streamId=", this.d, ", envData=", sb2);
        sb2.append(this.e);
        sb2.append(", roomMeta=");
        sb2.append(this.f);
        sb2.append(")");
        return sb2.toString();
    }

    public final boolean u() {
        Dc.N n = this.a;
        if (Intrinsics.b(n.f, X4.d)) {
            return n.c().a.length() == 0 || L7.d(n.c());
        }
        return false;
    }

    public final boolean v(boolean z) {
        if (u()) {
            return true;
        }
        Dc.N n = this.a;
        AbstractC0493e5 abstractC0493e5 = n.f;
        X4 x4 = X4.d;
        if (Intrinsics.b(abstractC0493e5, x4) && L7.c(n.c())) {
            return true;
        }
        if (Intrinsics.b(n.f, x4) && L7.e(n.c())) {
            return true;
        }
        return (Intrinsics.b(n.f, x4) && L7.f(n.c())) || s(z);
    }

    public final boolean w() {
        if (!z()) {
            return false;
        }
        EnumC3699m0 enumC3699m0 = this.b.a;
        return enumC3699m0 == EnumC3699m0.d || enumC3699m0 == EnumC3699m0.e;
    }

    public final boolean x() {
        return t() || q();
    }

    public final boolean y() {
        return Intrinsics.b(this.a.e(), C0590p3.d);
    }

    public final boolean z() {
        return Intrinsics.b(this.a.c, I4.d);
    }

    public C3695k0(Dc.N n, C3697l0 c3697l0, int i2, C3657O c3657o, F0 f0, int i3) {
        this(n, (i3 & 2) != 0 ? new C3697l0(3) : c3697l0, (i3 & 4) != 0 ? 0 : i2, Pf.B.E(), (i3 & 16) != 0 ? new C3657O(null, 63) : c3657o, (i3 & 32) != 0 ? new F0(null, null, null, null, false, null, 255) : f0);
    }
}
