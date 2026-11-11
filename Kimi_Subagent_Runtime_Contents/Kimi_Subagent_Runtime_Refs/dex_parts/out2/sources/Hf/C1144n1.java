package Hf;

import Cf.C0414w;
import Cf.M7;
import Cf.N7;
import Cf.O7;
import Cf.P7;
import Cf.Q7;
import Dc.C0639v;
import Ec.C0720i;
import Ec.C0723l;
import Ec.C0727p;
import Gf.C0979f;
import dg.C2978a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import je.C3695k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.C4068d;
import ue.C4801l;

/* JADX INFO: renamed from: Hf.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1144n1 extends Df.d implements Df.b {
    public static final /* synthetic */ int n = 0;
    public final Cf.S3 k;
    public final Sk.w l;
    public Mm.y0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144n1(Cf.S3 s3) {
        super(s3);
        Intrinsics.checkNotNullParameter(s3, "delegate");
        this.k = s3;
        this.l = Sk.m.b(new X0(2));
    }

    public final String G() {
        String str = ((C0639v) this.k.k.n.i.getValue()).a;
        return StringsKt.W(str) ? this.j.p().a : str;
    }

    public final C3695k0 H(C0979f c0979f) {
        Object next;
        Iterator it = ((Iterable) this.k.k.n.j.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.b(((C3695k0) next).a.a, c0979f.a)) {
                break;
            }
        }
        C3695k0 c3695k0 = (C3695k0) next;
        return c3695k0 == null ? this.j.z(c0979f.a) : c3695k0;
    }

    public final void I(C0979f c0979f, C3695k0 c3695k0) {
        g9.a aVar = this.j.K0;
        String str = c0979f.a;
        String str2 = c0979f.b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(str, "messageId");
        Intrinsics.checkNotNullParameter(str2, "blockId");
        C4068d c4068d = (C4068d) aVar.c;
        c4068d.setValue(kotlin.collections.a0.f((Set) c4068d.a.getValue(), str + "#" + str2));
        ((C4068d) aVar.b).setValue(null);
        this.k.E(new C0414w(c3695k0));
    }

    public final void J(C0979f c0979f) {
        C4068d c4068d = c0979f.g;
        if (((Boolean) c4068d.a.getValue()).booleanValue()) {
            return;
        }
        C3695k0 c3695k0H = H(c0979f);
        if (c3695k0H == null) {
            boolean z = C2978a.a;
            C2978a.b("InteractionViewModel", null, new C1084d1(c0979f, 2));
            return;
        }
        Dc.N n2 = c3695k0H.a;
        if (StringsKt.W(n2.a)) {
            boolean z2 = C2978a.a;
            C2978a.b("InteractionViewModel", null, new C1084d1(c0979f, 3));
            return;
        }
        String strG = G();
        if (StringsKt.W(strG)) {
            boolean z3 = C2978a.a;
            C2978a.b("InteractionViewModel", null, new C1090e1(c3695k0H, c0979f, 1));
            return;
        }
        if (c3695k0H.y()) {
            c4068d.setValue(Boolean.TRUE);
            return;
        }
        C0720i c0720iD = vb.L3.d(c0979f.b, c3695k0H);
        if (c0720iD == null) {
            boolean z4 = C2978a.a;
            C2978a.b("InteractionViewModel", null, new C1090e1(c3695k0H, c0979f, 2));
        } else if (StringsKt.W(c0720iD.a)) {
            boolean z5 = C2978a.a;
            C2978a.b("InteractionViewModel", null, new C1090e1(c3695k0H, c0979f, 3));
        } else {
            c4068d.setValue(Boolean.TRUE);
            this.k.k.n.f(new C0723l(c0720iD.a, C0727p.d, null, null, null, new Ec.G(Ec.A.d), null, 220), n2.a, strG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(Gf.C0979f r29, Xk.c r30) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.C1144n1.K(Gf.f, Xk.c):java.lang.Object");
    }

    @Override // Df.c
    public final void c() {
        C1096f1 c1096f1 = new C1096f1(this, null);
        kotlin.jvm.internal.K k = kotlin.jvm.internal.J.a;
        w(k.b(P7.class), c1096f1);
        w(k.b(Q7.class), new C1102g1(this, null));
        w(k.b(N7.class), new C1108h1(this, null));
        w(k.b(M7.class), new C1114i1(this, null));
        w(k.b(O7.class), new C1120j1(this, null));
    }

    @Override // Df.b
    public final void e(Mm.B b, C4801l c4801l) {
        Intrinsics.checkNotNullParameter(b, "scope");
        Intrinsics.checkNotNullParameter(c4801l, "streamService");
        super.e(b, c4801l);
        Mm.y0 y0Var = this.m;
        if (y0Var != null) {
            y0Var.m((CancellationException) null);
        }
        this.m = Mm.E.z(androidx.lifecycle.Z.i(this), Mm.P.a, (Mm.C) null, new C1126k1(c4801l, this, null), 2);
    }
}
