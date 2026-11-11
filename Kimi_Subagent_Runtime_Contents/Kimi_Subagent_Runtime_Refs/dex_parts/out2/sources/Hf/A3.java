package Hf;

import Cf.AbstractC0397u0;
import Cf.C0406v0;
import Cf.C0415w0;
import Cf.C0424x0;
import Cf.C0433y0;
import Cf.C0442z0;
import Dc.C0568n;
import Dc.W5;
import ch.AbstractC2613a;
import com.google.firebase.encoders.json.BuildConfig;
import je.C3695k0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import qi.C4277e;
import ub.AbstractC4646k5;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class A3 extends Df.d implements Df.b {
    public static final /* synthetic */ int m = 0;
    public final Cf.S3 k;
    public final String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(Cf.S3 s3) {
        super(s3);
        Intrinsics.checkNotNullParameter(s3, "delegate");
        this.k = s3;
        this.l = "KEY_OKC_PUSH_DIALOG_SHOW";
    }

    public static final void G(A3 a3, String str, String str2) {
        Cf.P3 p3 = a3.j;
        String str3 = p3.p().a;
        S7.b bVar = p3.k0;
        Be.e.w(str, str3, str2, AbstractC2613a.c(bVar.i()), bVar.k().b().d(), p3.p().d().a, str2);
    }

    public final void H(C3695k0 c3695k0, C0568n c0568n) {
        Cf.P3 p3 = this.j;
        Gf.E1 e1D = p3.y0.d();
        if (Intrinsics.b(c0568n.a, e1D.b) && Intrinsics.b(e1D.e, c0568n.p().c().a)) {
            return;
        }
        W5 w5 = p3.y0;
        w5.i(Gf.E1.a(w5.d(), c3695k0.a.a, c0568n.a, Gf.D1.a, BuildConfig.FLAVOR, c0568n.p().c().a, null, 32));
        boolean z = AbstractC4646k5.l(c0568n.p()) || !c3695k0.x();
        C4801l c4801l = this.k.k.n;
        String str = c0568n.p().c().a;
        c4801l.getClass();
        Intrinsics.checkNotNullParameter(str, "messageId");
        P1.f0 f0Var = c4801l.c;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(str, "messageId");
        C4277e c4277e = (C4277e) f0Var.g;
        if (c4277e != null) {
            c4277e.invoke(new ze.T(str, z));
        } else {
            Intrinsics.l("onEvent");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            Cf.P3 r0 = r8.j
            Dc.W5 r1 = r0.y0
            Gf.j2 r1 = r1.f()
            java.lang.String r2 = r1.b
            boolean r2 = kotlin.jvm.internal.Intrinsics.b(r2, r9)
            if (r2 == 0) goto L18
            java.lang.String r1 = r1.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.b(r1, r10)
            if (r1 != 0) goto L43
        L18:
            Dc.W5 r1 = r0.y0
            Gf.D1 r5 = Gf.D1.a
            java.lang.String r2 = "messageId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            java.lang.String r2 = "selectedAgentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r2 = "previewMode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            java.lang.String r2 = "previewToolBlockId"
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            Gf.j2 r2 = new Gf.j2
            r7 = 0
            r4 = r9
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.k(r2)
            int r9 = r4.length()
            if (r9 != 0) goto L44
        L43:
            return
        L44:
            Ae.f r9 = Ae.f.a
            Dc.v r9 = r0.p()
            java.lang.String r9 = r9.a
            ld.J r9 = Ae.f.c(r9, r4)
            if (r9 == 0) goto L66
            ld.A r9 = r9.f
            ld.w r10 = ld.C3870w.d
            boolean r10 = kotlin.jvm.internal.Intrinsics.b(r9, r10)
            if (r10 != 0) goto L66
            ld.v r10 = ld.C3869v.d
            boolean r9 = kotlin.jvm.internal.Intrinsics.b(r9, r10)
            if (r9 != 0) goto L66
            r9 = 1
            goto L67
        L66:
            r9 = 0
        L67:
            Cf.S3 r10 = r8.k
            Cf.y6 r10 = r10.k
            ue.l r10 = r10.n
            r10.getClass()
            java.lang.String r0 = "agentId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            P1.f0 r10 = r10.c
            r10.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r10 = r10.g
            qi.e r10 = (qi.C4277e) r10
            if (r10 == 0) goto L8c
            ze.S r0 = new ze.S
            r0.<init>(r4, r9)
            r10.invoke(r0)
            return
        L8c:
            java.lang.String r9 = "onEvent"
            kotlin.jvm.internal.Intrinsics.l(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.A3.I(java.lang.String, java.lang.String):void");
    }

    @Override // Df.c
    public final void c() {
        C1104g3 c1104g3 = new C1104g3(this, null);
        kotlin.jvm.internal.K k = kotlin.jvm.internal.J.a;
        w(k.b(C0424x0.class), c1104g3);
        w(k.b(C0433y0.class), new C1110h3(this, null));
        w(k.b(C0442z0.class), new C1116i3(this, null));
        w(k.b(Cf.A0.class), new C1122j3(this, null));
        w(k.b(Cf.I0.class), new C1128k3(this, null));
        w(k.b(C0406v0.class), new C1134l3(this, null));
        w(k.b(Cf.B0.class), new C1140m3(this, null));
        w(k.b(Cf.E0.class), new C1146n3(this, null));
        w(k.b(Cf.H0.class), new C1158p3(this, null));
        w(k.b(Cf.G0.class), new X2(this, null));
        w(k.b(Cf.F0.class), new Y2(this, null));
        w(k.b(AbstractC0397u0.class), new Z2(this, null));
        w(k.b(Cf.J0.class), new C1068a3(this, null));
        w(k.b(Cf.D0.class), new C1074b3(this, null));
        w(k.b(C0415w0.class), new C1080c3(this, null));
        w(k.b(Cf.C0.class), new C1086d3(this, null));
        w(k.b(Cf.K0.class), new C1098f3(this, null));
    }

    @Override // Df.b
    public final void e(Mm.B b, C4801l c4801l) {
        Intrinsics.checkNotNullParameter(b, "scope");
        Intrinsics.checkNotNullParameter(c4801l, "streamService");
        super.e(b, c4801l);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C1217z3(c4801l, this, null), 3);
    }
}
