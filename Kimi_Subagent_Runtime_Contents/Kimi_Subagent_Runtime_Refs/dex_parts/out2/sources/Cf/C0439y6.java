package Cf;

import Ad.C0098n;
import Dc.C0497f0;
import Dc.C0551l0;
import Dc.C0639v;
import Dc.C0651w2;
import Gc.C0889d1;
import Gc.C0912j0;
import Gc.C0948u1;
import Gf.C1008o1;
import Gf.C1011p1;
import Gf.C1030w0;
import Pf.AbstractC1816b;
import ag.AbstractC2393b;
import bh.C2498c;
import ce.C2589g;
import ch.AbstractC2613a;
import ch.C2621i;
import ci.C2634h;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import dd.C2919P;
import dg.C2978a;
import eg.EnumC3122e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import je.C3695k0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import ng.C4068d;
import ub.AbstractC4646k5;
import ub.AbstractC4775z0;
import ue.C4801l;
import ui.C4858i;
import vb.AbstractC4988t4;
import vb.AbstractC4994u4;
import ve.C5128h;

/* JADX INFO: renamed from: Cf.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C0439y6 extends Df.d implements Df.b {
    public static Rf.m s = new Rf.m("referenceClick", 0);
    public static Rf.m t = new Rf.m("imageDownloadClick", 0);
    public static Rf.m u = new Rf.m("tableShareClick", 0);
    public static Rf.m v = new Rf.m("chatEventBus", 0);
    public final S3 k;
    public Nh.h l;
    public Mm.y0 m;
    public C4801l n;
    public final Sk.w o;
    public Mm.y0 p;
    public Mm.y0 q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439y6(S3 s3) {
        super(s3);
        Intrinsics.checkNotNullParameter(s3, "delegate");
        this.k = s3;
        this.n = AbstractC4775z0.b(this);
        Gn.a.m(androidx.lifecycle.Z.i(this), true, new C0383s4(this, null));
        Gn.a.k(androidx.lifecycle.Z.i(this), true, new C0392t4(this, null));
        Jc.b bVar = rh.d.a;
        m3.a aVarI = androidx.lifecycle.Z.i(this);
        C0401u4 c0401u4 = new C0401u4(this, null);
        Intrinsics.checkNotNullParameter(aVarI, "scope");
        Intrinsics.checkNotNullParameter(c0401u4, "block");
        Mm.E.z(aVarI, (CoroutineContext) null, (Mm.C) null, new rh.c(c0401u4, null), 3);
        String strP = AbstractC2393b.a.p("key_input_mode", "keyboard");
        P3 p3 = this.j;
        p3.l0(p3.p());
        this.j.p0((strP.equals("voice") && this.j.x().length() == 0) ? C0257e3.c : C0257e3.b, true);
        if (!AbstractC2393b.b.k("key_tts_speed_reset_1.4.0", false)) {
            AbstractC2393b.b.s(1.0f, "key_tts_speed");
            AbstractC2393b.b.q("key_tts_speed_reset_1.4.0", true);
        }
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new C0419w4(this, null), 3);
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new C0437y4(this, null), 3);
        this.o = Sk.m.b(new Bj.a(14));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(Cf.C0439y6 r10, kd.V r11, Xk.c r12) {
        /*
            boolean r0 = r12 instanceof Cf.L4
            if (r0 == 0) goto L14
            r0 = r12
            Cf.L4 r0 = (Cf.L4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            Cf.L4 r0 = new Cf.L4
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r8.b
            Wk.a r0 = Wk.a.a
            int r1 = r8.d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kd.V r11 = r8.a
            P8.a.s(r12)
            r1 = r10
            goto L51
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            P8.a.s(r12)
            Cf.P3 r12 = r10.j
            r1 = 0
            r12.w0(r1)
            r8.a = r11
            r8.d = r2
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 125(0x7d, float:1.75E-43)
            r1 = r10
            java.lang.Object r10 = O(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r10 != r0) goto L51
            return r0
        L51:
            ue.l r10 = r1.n
            Zd.A r12 = new Zd.A
            Zd.s r0 = new Zd.s
            r0.<init>(r11)
            r11 = 7
            r2 = 0
            Zd.y r11 = ub.AbstractC4775z0.f(r1, r2, r11)
            r12.<init>(r0, r11, r2)
            ve.InterfaceC5141n0.a(r10, r12)
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.G(Cf.y6, kd.V, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(Cf.C0439y6 r6, java.lang.String r7, Ii.c r8, Xk.c r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.H(Cf.y6, java.lang.String, Ii.c, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(Cf.C0439y6 r9, cd.C2534P r10, Xk.c r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.I(Cf.y6, cd.P, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(Cf.C0439y6 r4, je.C3695k0 r5, java.lang.String r6, Xk.c r7) {
        /*
            boolean r0 = r7 instanceof Cf.C0296i6
            if (r0 == 0) goto L13
            r0 = r7
            Cf.i6 r0 = (Cf.C0296i6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Cf.i6 r0 = new Cf.i6
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            Wk.a r1 = Wk.a.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P8.a.s(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P8.a.s(r7)
            r0.c = r3
            java.lang.Object r5 = r4.P(r5, r6, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            Cf.P3 r4 = r4.j
            ng.d r5 = r4.T
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.setValue(r6)
            je.k0 r5 = je.C3695k0.h
            java.lang.String r6 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            ng.d r6 = r4.S
            r6.setValue(r5)
            java.lang.String r5 = ""
            r4.v0(r5)
            r5 = 0
            r4.w0(r5)
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.J(Cf.y6, je.k0, java.lang.String, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r0.K(r8, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(Cf.C0439y6 r6, je.C3695k0 r7, Xk.c r8) {
        /*
            Cf.S3 r0 = r6.k
            boolean r1 = r8 instanceof Cf.C0394t6
            if (r1 == 0) goto L15
            r1 = r8
            Cf.t6 r1 = (Cf.C0394t6) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            Cf.t6 r1 = new Cf.t6
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.b
            Wk.a r2 = Wk.a.a
            int r3 = r1.d
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L3c
            if (r3 == r4) goto L36
            if (r3 != r5) goto L2e
            je.k0 r7 = r1.a
            P8.a.s(r8)
            goto L63
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            je.k0 r7 = r1.a
            P8.a.s(r8)
            goto L51
        L3c:
            P8.a.s(r8)
            Cf.H3 r8 = new Cf.H3
            Cf.F3 r3 = Cf.F3.a
            r8.<init>(r3)
            r1.a = r7
            r1.d = r4
            java.lang.Object r8 = r0.K(r8, r1)
            if (r8 != r2) goto L51
            goto L62
        L51:
            Cf.y3 r8 = new Cf.y3
            Cf.r3 r3 = Cf.C0373r3.a
            r8.<init>(r3)
            r1.a = r7
            r1.d = r5
            java.lang.Object r8 = r0.K(r8, r1)
            if (r8 != r2) goto L63
        L62:
            return r2
        L63:
            pg.a[] r8 = pg.EnumC4230a.a
            ue.l r8 = r6.n
            Zd.A r0 = new Zd.A
            Zd.w r1 = new Zd.w
            r1.<init>(r7)
            Cf.P3 r7 = r6.j
            S7.b r7 = r7.k0
            Cf.o2 r2 = Cf.C0346o2.a
            Gf.U r7 = r7.h(r2)
            r2 = 5
            Zd.y r6 = ub.AbstractC4775z0.f(r6, r7, r2)
            r7 = 0
            r0.<init>(r1, r6, r7)
            ve.InterfaceC5141n0.a(r8, r0)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.K(Cf.y6, je.k0, Xk.c):java.lang.Object");
    }

    public static Gf.U L(Gf.U u2, boolean z) {
        if (!z) {
            return u2;
        }
        C0889d1 c0889d1 = u2.a;
        Dc.D2 d2C = u2.f;
        Object obj = null;
        if (AbstractC2613a.n(c0889d1)) {
            String strA = c0889d1.a();
            if (strA.length() <= 0 || d2C.a.length() != 0) {
                strA = null;
            }
            if (strA != null) {
                C2589g c2589g = C2589g.a;
                d2C = C2589g.c(strA);
            }
            return Gf.U.b(u2, null, d2C, null, 95);
        }
        C4068d c4068d = Ah.f.a;
        C0948u1 c0948u1 = C0948u1.d;
        C0889d1 c0889d1B = Ah.f.b(c0948u1);
        if (c0889d1B == null) {
            c0889d1B = new C0889d1(c0948u1, Dc.X4.d, 3454);
        }
        C2589g c2589g2 = C2589g.a;
        String strA2 = c0889d1B.a();
        if (StringsKt.W(strA2)) {
            strA2 = "ok-computer";
        }
        Dc.D2 d2C2 = C2589g.c(strA2);
        List list = d2C2.s;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.b(((Dc.B2) next).c, C0651w2.d)) {
                obj = next;
                break;
            }
        }
        Dc.B2 b2 = (Dc.B2) obj;
        if (b2 == null) {
            b2 = (Dc.B2) CollectionsKt.firstOrNull(list);
        }
        return Gf.U.b(u2, c0889d1B, d2C2, b2, 30);
    }

    public static Object O(C0439y6 c0439y6, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Vk.a aVar, int i) {
        Dc.D2 d2C;
        C0639v c0639v;
        int i2 = i & 1;
        String strX = BuildConfig.FLAVOR;
        String str2 = i2 != 0 ? BuildConfig.FLAVOR : str;
        boolean z6 = (i & 2) != 0 ? true : z;
        boolean z7 = (i & 4) != 0 ? false : z2;
        boolean z8 = (i & 8) != 0 ? true : z3;
        boolean z9 = (i & 32) != 0 ? true : z4;
        boolean z10 = (i & 64) == 0 ? z5 : false;
        Mc.M2 m2 = If.e.a;
        If.e.a();
        P3 p3 = c0439y6.j;
        String str3 = null;
        p3.s0.setValue(null);
        p3.q0.setValue(Boolean.FALSE);
        p3.p0.setValue(Boolean.TRUE);
        if (AbstractC4646k5.p(p3.p()) || (z6 && z7)) {
            p3.c(new C0639v(null, null, null, null, null, 131071));
        }
        if (str2.length() == 0) {
            d2C = new Dc.D2(null, 524287);
        } else {
            C2589g c2589g = C2589g.a;
            d2C = C2589g.c(str2);
        }
        Dc.D2 d2 = d2C;
        if (z10) {
            c0439y6.N();
        }
        if (!p3.Z() || z10) {
            c0639v = new C0639v(null, null, d2, null, null, 131063);
        } else {
            C0639v c0639vA = p3.A();
            if (c0639vA == null) {
                c0639vA = Z(p3.p());
            }
            if (!p3.J0()) {
                p3.x0(c0639vA);
            }
            String strC = c0639vA.g().c();
            if (strC.length() <= 0) {
                strC = null;
            }
            if (strC == null) {
                strC = c0639vA.f().a;
            }
            if (strC.length() > 0) {
                String strG = ub.K5.g(p3.D());
                Intrinsics.checkNotNullParameter(strC, "projectId");
                Intrinsics.checkNotNullParameter(strG, "modelName");
                Y6.k kVarB = A8.b.b("project_chat_start", "project_id", strC);
                if (StringsKt.W(strG)) {
                    strG = "unknown";
                }
                kVarB.y(strG, "model_name");
                kVarB.v();
            }
            c0639v = new C0639v(null, null, d2, c0639vA.f(), new C0551l0(C0497f0.d, strC, str3, 12), 130007);
        }
        C0639v c0639v2 = c0639v;
        if (!z7) {
            strX = p3.x();
        }
        Object objX = c0439y6.X(new Ef.b(c0639v2, false, z6, z7, z9, strX, false, z8, null, null, null, null, null, 65346), aVar);
        return objX == Wk.a.a ? objX : Unit.a;
    }

    public static C0639v Z(C0639v c0639v) {
        String strC = c0639v.g().c();
        String str = null;
        if (strC.length() <= 0) {
            strC = null;
        }
        if (strC == null) {
            strC = c0639v.f().a;
        }
        C2919P c2919pF = c0639v.f();
        C0497f0 c0497f0 = C0497f0.d;
        if (strC.length() <= 0) {
            strC = null;
        }
        return new C0639v(null, null, null, c2919pF, new C0551l0(c0497f0, strC, str, 12), 130015);
    }

    public static String b0(String str, String str2) {
        return (str.length() == 0 || str2.length() == 0 || CharsKt.b(kotlin.text.C.J(str2))) ? str : " ".concat(str);
    }

    public final void M() {
        P3 p3 = this.j;
        C3695k0 c3695k0 = (C3695k0) CollectionsKt.d0(p3.j().a);
        if (c3695k0 == null) {
            return;
        }
        if (!p3.O()) {
            if (AbstractC4988t4.d(c3695k0, p3.j().a, p3.p()) == null) {
                this.n.c(new C4858i(15));
                return;
            } else {
                p3.w0(false);
                A(new C0348o4(this, 1));
                return;
            }
        }
        P1.f0 f0Var = this.n.c;
        f0Var.getClass();
        C2978a.a("StreamApiImpl", null, new C5128h(18));
        Mm.y0 y0Var = (Mm.y0) f0Var.d;
        if (y0Var != null) {
            y0Var.m((CancellationException) null);
        }
    }

    public final void N() {
        P3 p3 = this.j;
        p3.x0(null);
        p3.l.setValue(null);
        p3.m.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(je.C3695k0 r8, java.lang.String r9, Xk.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof Cf.C4
            if (r0 == 0) goto L13
            r0 = r10
            Cf.C4 r0 = (Cf.C4) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Cf.C4 r0 = new Cf.C4
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            Wk.a r1 = Wk.a.a
            int r2 = r0.e
            Cf.S3 r3 = r7.k
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r5) goto L30
            java.lang.String r8 = r0.b
            je.k0 r9 = r0.a
            P8.a.s(r10)
            goto L77
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r9 = r0.b
            je.k0 r8 = r0.a
            P8.a.s(r10)
            goto L60
        L40:
            P8.a.s(r10)
            boolean r10 = kotlin.text.StringsKt.W(r9)
            if (r10 == 0) goto L4c
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L4c:
            Cf.H3 r10 = new Cf.H3
            Cf.F3 r2 = Cf.F3.a
            r10.<init>(r2)
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r10 = r3.K(r10, r0)
            if (r10 != r1) goto L60
            goto L73
        L60:
            Cf.y3 r10 = new Cf.y3
            Cf.r3 r2 = Cf.C0373r3.a
            r10.<init>(r2)
            r0.a = r8
            r0.b = r9
            r0.e = r5
            java.lang.Object r10 = r3.K(r10, r0)
            if (r10 != r1) goto L74
        L73:
            return r1
        L74:
            r6 = r9
            r9 = r8
            r8 = r6
        L77:
            kotlin.text.Regex r10 = Zd.o.a
            Cf.P3 r10 = r7.j
            boolean r0 = r10.Q0()
            if (r0 == 0) goto L86
            java.util.Map r10 = r10.g()
            goto L8a
        L86:
            kotlin.collections.J r10 = kotlin.collections.P.d()
        L8a:
            Zd.m r8 = Zd.o.a(r8, r10)
            char r10 = Zd.r.a
            java.lang.String r10 = r8.a
            Zd.p r10 = Zd.r.b(r10)
            ue.l r0 = r7.n
            Zd.A r1 = new Zd.A
            Zd.u r2 = new Zd.u
            java.lang.String r3 = r10.a
            java.util.List r8 = r8.b
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r10 = r10.b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r8 = kotlin.collections.CollectionsKt.j0(r8, r10)
            r2.<init>(r9, r3, r8)
            r8 = 7
            r9 = 0
            Zd.y r8 = ub.AbstractC4775z0.f(r7, r9, r8)
            r1.<init>(r2, r8, r9)
            Cf.f2 r8 = new Cf.f2
            r9 = 4
            r8.<init>(r9)
            r0.b(r1, r8)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.P(je.k0, java.lang.String, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(Xk.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof Cf.D4
            if (r0 == 0) goto L13
            r0 = r13
            Cf.D4 r0 = (Cf.D4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Cf.D4 r0 = new Cf.D4
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.b
            Wk.a r1 = Wk.a.a
            int r2 = r0.d
            java.lang.String r3 = "<this>"
            r4 = 1
            Cf.P3 r5 = r12.j
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            Gc.d1 r0 = r0.a
            P8.a.s(r13)
            goto L88
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            P8.a.s(r13)
            ng.d r13 = Ah.f.a
            Gc.u1 r13 = Gc.C0948u1.d
            Gc.d1 r7 = Ah.f.b(r13)
            if (r7 != 0) goto L45
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L45:
            S7.b r13 = r5.k0
            Gc.d1 r13 = r13.k()
            java.lang.String r2 = ch.AbstractC2613a.a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            boolean r13 = ch.AbstractC2613a.d(r13)
            if (r13 != 0) goto Lbe
            Gc.j0 r13 = r5.D()
            boolean r13 = ub.K5.i(r13)
            if (r13 == 0) goto L61
            goto Lbe
        L61:
            boolean r13 = r5.K()
            if (r13 == 0) goto L70
            boolean r13 = r5.a()
            if (r13 != 0) goto L70
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L70:
            Gf.I r6 = new Gf.I
            r10 = 0
            r11 = 118(0x76, float:1.65E-43)
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r0.a = r7
            r0.d = r4
            Cf.S3 r13 = r12.k
            java.lang.Object r13 = r13.K(r6, r0)
            if (r13 != r1) goto L87
            return r1
        L87:
            r0 = r7
        L88:
            S7.b r13 = r5.k0
            Gc.d1 r13 = r13.k()
            java.lang.String r1 = ch.AbstractC2613a.a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            boolean r13 = ch.AbstractC2613a.d(r13)
            if (r13 != 0) goto La4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            boolean r13 = ch.AbstractC2613a.d(r0)
            if (r13 == 0) goto La3
            goto La4
        La3:
            r4 = 0
        La4:
            if (r4 == 0) goto Lb9
            Sk.w r13 = Qk.M0.a
            Qk.F r13 = Qk.F.d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r3)
            Sk.w r13 = Qk.M0.z
            java.lang.Object r13 = r13.getValue()
            Zn.L r13 = (Zn.L) r13
            r0 = 6
            vb.J3.h(r13, r0)
        Lb9:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            return r13
        Lbe:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.Q(Xk.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(Xk.c r23) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.R(Xk.c):java.lang.Object");
    }

    public final boolean S() {
        Object next;
        P3 p3 = this.j;
        if (AbstractC2613a.d(p3.k0.k())) {
            return false;
        }
        C0912j0 c0912j0D = p3.D();
        boolean zP = AbstractC4646k5.p(p3.p());
        boolean zK = p3.K();
        boolean zQ = AbstractC4994u4.q(Wc.M.d);
        Intrinsics.checkNotNullParameter(c0912j0D, "model");
        if (!ub.J5.b(c0912j0D) || !zP || zK || !zQ) {
            return false;
        }
        Jc.b bVar = rh.d.a;
        List list = rh.d.d().b;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!ub.K5.i((C0912j0) next)) {
                break;
            }
        }
        C0912j0 c0912j0 = (C0912j0) next;
        if (c0912j0 == null || Intrinsics.b(c0912j0.j, p3.D().j)) {
            return false;
        }
        p3.g0(c0912j0);
        ((C4068d) p3.N0.b).setValue(Gf.Y.a);
        return true;
    }

    public final Nh.h T() {
        if (this.l == null && AbstractC1816b.a() == EnumC3122e.a) {
            Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new G4(this, null), 3);
            this.l = new Nh.h(androidx.lifecycle.Z.i(this), Nh.i.b, new Aj.y(1, this));
        }
        return this.l;
    }

    public final Object U(C2634h c2634h, Xk.i iVar) {
        if (c2634h.a()) {
            C0098n c0098n = C0098n.a;
            if (!C0098n.g()) {
                I4.y.c(androidx.lifecycle.Z.i(this), "routeInInfo", new C0357p4(this, c2634h, 0));
                return Unit.a;
            }
        }
        Object objV = V(c2634h, iVar);
        return objV == Wk.a.a ? objV : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0136, code lost:
    
        if (r14.K(r1, r7) == r11) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014f, code lost:
    
        if (r14.K(r1, r7) == r11) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016b, code lost:
    
        if (r14.K(r1, r7) == r11) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0186, code lost:
    
        if (r14.K(r1, r7) == r11) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b1, code lost:
    
        if (r14.K(r1, r7) == r11) goto L214;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0241 A[PHI: r2 r7 r12 r13 r14 r20
      0x0241: PHI (r2v18 ci.h) = (r2v9 ci.h), (r2v9 ci.h), (r2v9 ci.h), (r2v19 ci.h) binds: [B:101:0x023d, B:88:0x01d3, B:82:0x01c1, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r7v6 Cf.I4) = (r7v3 Cf.I4), (r7v3 Cf.I4), (r7v3 Cf.I4), (r7v7 Cf.I4) binds: [B:101:0x023d, B:88:0x01d3, B:82:0x01c1, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r12v6 int) = (r12v3 int), (r12v3 int), (r12v3 int), (r12v7 int) binds: [B:101:0x023d, B:88:0x01d3, B:82:0x01c1, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r13v5 boolean) = (r13v2 boolean), (r13v2 boolean), (r13v2 boolean), (r13v6 boolean) binds: [B:101:0x023d, B:88:0x01d3, B:82:0x01c1, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r14v5 Cf.S3) = (r14v2 Cf.S3), (r14v2 Cf.S3), (r14v2 Cf.S3), (r14v6 Cf.S3) binds: [B:101:0x023d, B:88:0x01d3, B:82:0x01c1, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0241: PHI (r20v5 Cf.P3) = (r20v2 Cf.P3), (r20v2 Cf.P3), (r20v2 Cf.P3), (r20v6 Cf.P3) binds: [B:101:0x023d, B:88:0x01d3, B:82:0x01c1, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033e A[PHI: r2 r7 r12 r13 r14 r20
      0x033e: PHI (r2v20 ci.h) = (r2v18 ci.h), (r2v18 ci.h), (r2v18 ci.h), (r2v18 ci.h), (r2v18 ci.h), (r2v18 ci.h), (r2v18 ci.h), (r2v21 ci.h) binds: [B:143:0x0329, B:145:0x033a, B:141:0x0322, B:139:0x031e, B:125:0x02d4, B:113:0x027c, B:120:0x02a5, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x033e: PHI (r7v8 Cf.I4) = (r7v6 Cf.I4), (r7v6 Cf.I4), (r7v6 Cf.I4), (r7v6 Cf.I4), (r7v6 Cf.I4), (r7v6 Cf.I4), (r7v6 Cf.I4), (r7v9 Cf.I4) binds: [B:143:0x0329, B:145:0x033a, B:141:0x0322, B:139:0x031e, B:125:0x02d4, B:113:0x027c, B:120:0x02a5, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x033e: PHI (r12v8 int) = (r12v6 int), (r12v6 int), (r12v6 int), (r12v6 int), (r12v6 int), (r12v6 int), (r12v6 int), (r12v9 int) binds: [B:143:0x0329, B:145:0x033a, B:141:0x0322, B:139:0x031e, B:125:0x02d4, B:113:0x027c, B:120:0x02a5, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x033e: PHI (r13v7 boolean) = 
      (r13v5 boolean)
      (r13v5 boolean)
      (r13v5 boolean)
      (r13v5 boolean)
      (r13v5 boolean)
      (r13v5 boolean)
      (r13v5 boolean)
      (r13v8 boolean)
     binds: [B:143:0x0329, B:145:0x033a, B:141:0x0322, B:139:0x031e, B:125:0x02d4, B:113:0x027c, B:120:0x02a5, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x033e: PHI (r14v7 Cf.S3) = (r14v5 Cf.S3), (r14v5 Cf.S3), (r14v5 Cf.S3), (r14v5 Cf.S3), (r14v5 Cf.S3), (r14v5 Cf.S3), (r14v5 Cf.S3), (r14v8 Cf.S3) binds: [B:143:0x0329, B:145:0x033a, B:141:0x0322, B:139:0x031e, B:125:0x02d4, B:113:0x027c, B:120:0x02a5, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x033e: PHI (r20v7 Cf.P3) = (r20v5 Cf.P3), (r20v5 Cf.P3), (r20v5 Cf.P3), (r20v5 Cf.P3), (r20v5 Cf.P3), (r20v5 Cf.P3), (r20v5 Cf.P3), (r20v8 Cf.P3) binds: [B:143:0x0329, B:145:0x033a, B:141:0x0322, B:139:0x031e, B:125:0x02d4, B:113:0x027c, B:120:0x02a5, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035e A[PHI: r2 r7 r12 r13 r14 r20
      0x035e: PHI (r2v22 ci.h) = (r2v20 ci.h), (r2v20 ci.h), (r2v23 ci.h) binds: [B:148:0x0340, B:150:0x035a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r7v10 Cf.I4) = (r7v8 Cf.I4), (r7v8 Cf.I4), (r7v11 Cf.I4) binds: [B:148:0x0340, B:150:0x035a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r12v10 int) = (r12v8 int), (r12v8 int), (r12v11 int) binds: [B:148:0x0340, B:150:0x035a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r13v9 boolean) = (r13v7 boolean), (r13v7 boolean), (r13v10 boolean) binds: [B:148:0x0340, B:150:0x035a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r14v9 Cf.S3) = (r14v7 Cf.S3), (r14v7 Cf.S3), (r14v10 Cf.S3) binds: [B:148:0x0340, B:150:0x035a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x035e: PHI (r20v9 Cf.P3) = (r20v7 Cf.P3), (r20v7 Cf.P3), (r20v10 Cf.P3) binds: [B:148:0x0340, B:150:0x035a, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0382 A[PHI: r2 r7 r13 r14 r20
      0x0382: PHI (r2v24 ci.h) = (r2v22 ci.h), (r2v22 ci.h), (r2v33 ci.h) binds: [B:153:0x0360, B:159:0x037e, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r7v12 Cf.I4) = (r7v10 Cf.I4), (r7v10 Cf.I4), (r7v20 Cf.I4) binds: [B:153:0x0360, B:159:0x037e, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r13v11 boolean) = (r13v9 boolean), (r13v9 boolean), (r13v22 boolean) binds: [B:153:0x0360, B:159:0x037e, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r14v11 Cf.S3) = (r14v9 Cf.S3), (r14v9 Cf.S3), (r14v22 Cf.S3) binds: [B:153:0x0360, B:159:0x037e, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0382: PHI (r20v11 Cf.P3) = (r20v9 Cf.P3), (r20v9 Cf.P3), (r20v16 Cf.P3) binds: [B:153:0x0360, B:159:0x037e, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(ci.C2634h r38, Xk.c r39) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.V(ci.h, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (r23.k.K(r2, r3) == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(Dc.C0639v r24, boolean r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function0 r27, java.lang.String r28, Xk.c r29) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r29
            boolean r3 = r2 instanceof Cf.J4
            if (r3 == 0) goto L19
            r3 = r2
            Cf.J4 r3 = (Cf.J4) r3
            int r4 = r3.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.e = r4
            goto L1e
        L19:
            Cf.J4 r3 = new Cf.J4
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.c
            Wk.a r4 = Wk.a.a
            int r5 = r3.e
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L43
            if (r5 == r7) goto L39
            if (r5 != r6) goto L31
            P8.a.s(r2)
            goto Lbd
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            boolean r1 = r3.b
            Dc.v r5 = r3.a
            P8.a.s(r2)
            r10 = r1
            r1 = r5
            goto L7f
        L43:
            P8.a.s(r2)
            Ef.b r8 = new Ef.b
            if (r1 != 0) goto L58
            Dc.v r9 = new Dc.v
            r14 = 0
            r15 = 131071(0x1ffff, float:1.8367E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L59
        L58:
            r9 = r1
        L59:
            r21 = 0
            r22 = 55804(0xd9fc, float:7.8198E-41)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r10 = r25
            r17 = r26
            r18 = r27
            r20 = r28
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.a = r1
            r3.b = r10
            r3.e = r7
            java.lang.Object r2 = r0.X(r8, r3)
            if (r2 != r4) goto L7f
            goto Lbc
        L7f:
            if (r1 == 0) goto Lc0
            Dc.D2 r1 = r1.d()
            if (r1 == 0) goto Lc0
            boolean r1 = ub.AbstractC4646k5.q(r1, r7)
            if (r1 != r7) goto Lc0
            ng.d r1 = Ah.f.a
            Gc.y1 r1 = Gc.C0960y1.d
            Gc.d1 r1 = Ah.f.b(r1)
            Gf.I r2 = new Gf.I
            r5 = 0
            r7 = 126(0x7e, float:1.77E-43)
            r8 = 0
            r9 = 0
            r25 = r1
            r24 = r2
            r28 = r5
            r29 = r7
            r26 = r8
            r27 = r9
            r24.<init>(r25, r26, r27, r28, r29)
            r1 = r24
            r2 = 0
            r3.a = r2
            r3.b = r10
            r3.e = r6
            Cf.S3 r2 = r0.k
            java.lang.Object r1 = r2.K(r1, r3)
            if (r1 != r4) goto Lbd
        Lbc:
            return r4
        Lbd:
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        Lc0:
            kotlin.Unit r1 = kotlin.Unit.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.W(Dc.v, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, Xk.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0439, code lost:
    
        if (r2.m(r7, r10, r3) == r4) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0459, code lost:
    
        if (r2.l(r11, r3) == r4) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(Ef.b r26, Vk.a r27) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.X(Ef.b, Vk.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c1 A[LOOP:0: B:174:0x03bb->B:176:0x03c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a7 A[LOOP:2: B:199:0x04a1->B:201:0x04a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(java.lang.String r36, ub.AbstractC4730u0 r37, java.util.List r38, kotlin.jvm.functions.Function1 r39, Xk.c r40) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.C0439y6.Y(java.lang.String, ub.u0, java.util.List, kotlin.jvm.functions.Function1, Xk.c):java.lang.Object");
    }

    @Override // Df.b
    public final void a(boolean z) {
        if (z) {
            fk.c cVar = this.j.g0;
            if (cVar.k() instanceof C1011p1) {
                cVar.t(C1008o1.a);
            }
        }
    }

    public final C0639v a0(C0639v c0639v) {
        P3 p3 = this.j;
        if (p3.Z()) {
            C0639v c0639vA = p3.A();
            if (c0639vA == null) {
                c0639vA = Z(p3.p());
            }
            String strC = c0639vA.g().c();
            String str = null;
            if (strC.length() <= 0) {
                strC = null;
            }
            if (strC == null) {
                strC = c0639vA.f().a;
            }
            if (strC.length() != 0) {
                p3.x0(c0639vA);
                return C0639v.a(c0639v, null, null, null, c0639vA.f(), new C0551l0(C0497f0.d, strC, str, 12), null, null, null, 130015);
            }
        }
        return c0639v;
    }

    @Override // Df.b
    public final void b(boolean z) {
        if (z) {
            Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new C0314k6(this, null), 3);
            Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new C0332m6(this, null), 3);
            Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new C0368q6(this, null), 3);
            Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new C0385s6(this, null), 3);
            return;
        }
        P3 p3 = this.j;
        fk.c cVar = p3.g0;
        if (cVar.k() instanceof C1011p1) {
            cVar.t(C1008o1.a);
        }
        p3.g0.k();
    }

    @Override // Df.c
    public final void c() {
        C0313k5 c0313k5 = new C0313k5(this, null);
        kotlin.jvm.internal.K k = kotlin.jvm.internal.J.a;
        w(k.b(Z.class), c0313k5);
        w(k.b(C0414w.class), new C0411v5(this, null));
        w(k.b(C0274g2.class), new G5(this, null));
        w(k.b(C0444z2.class), new R5(this, null));
        w(k.b(C0345o1.class), new C0251d6(this, null));
        w(k.b(C0280h.class), new C0260e6(this, null));
        w(k.b(O0.class), new C0269f6(this, null));
        w(k.b(AbstractC0378s.class), new C0278g6(this, null));
        w(k.b(N0.class), new C0287h6(this, null));
        w(k.b(r.class), new C0223a5(this, null));
        w(k.b(C0445z3.class), new C0232b5(this, null));
        w(k.b(C0396u.class), new C0241c5(this, null));
        w(k.b(C0405v.class), new C0250d5(this, null));
        w(k.b(W.class), new C0259e5(this, null));
        w(k.b(M0.class), new C0268f5(this, null));
        w(k.b(C0335n0.class), new C0277g5(this, null));
        w(k.b(S0.class), new C0286h5(this, null));
        w(k.b(R0.class), new C0295i5(this, null));
        w(k.b(C0271g.class), new C0304j5(this, null));
        w(k.b(C0262f.class), new C0322l5(this, null));
        w(k.b(U.class), new C0331m5(this, null));
        w(k.b(C0432y.class), new C0340n5(this, null));
        w(k.b(C0441z.class), new C0349o5(this, null));
        w(k.b(C0309k1.class), new C0358p5(this, null));
        w(k.b(C0423x.class), new C0367q5(2, null));
        w(k.b(C0220a2.class), new C0375r5(this, null));
        w(k.b(C0326m0.class), new C0384s5(this, null));
        w(k.b(H.class), new C0393t5(this, null));
        w(k.b(C0362q0.class), new C0402u5(this, null));
        w(k.b(C0266f3.class), new C0420w5(this, null));
        w(k.b(AbstractC0336n1.class), new C0429x5(this, null));
        w(k.b(O.class), new C0438y5(this, null));
        w(k.b(T.class), new C0447z5(this, null));
        w(k.b(C0355p2.class), new A5(this, null));
        w(k.b(T0.class), new B5(this, null));
        w(k.b(C0247d2.class), new C5(this, null));
        w(k.b(C0256e2.class), new D5(2, null));
        w(k.b(C0238c2.class), new E5(this, null));
        w(k.b(AbstractC0338n3.class), new F5(this, null));
        w(k.b(C0300j1.class), new H5(this, null));
        w(k.b(P.class), new I5(this, null));
        w(k.b(Q.class), new J5(this, null));
        w(k.b(C0329m3.class), new K5(this, null));
        w(k.b(AbstractC0229b2.class), new L5(this, null));
        w(k.b(V.class), new M5(this, null));
        w(k.b(C0343o.class), new N5(this, null));
        w(k.b(Z0.class), new O5(this, null));
        w(k.b(C0219a1.class), new P5(this, null));
        w(k.b(Y0.class), new Q5(this, null));
        w(k.b(C0379s0.class), new S5(this, null));
        w(k.b(S.class), new U5(this, null));
        w(k.b(C0334n.class), new V5(this, null));
        w(k.b(B.class), new W5(this, null));
        w(k.b(E2.class), new X5(this, null));
        w(k.b(C0370r0.class), new Y5(this, null));
        w(k.b(L0.class), new Z5(this, null));
        w(k.b(A1.class), new C0224a6(this, null));
        w(k.b(B1.class), new C0242c6(this, null));
    }

    @Override // Df.b
    public final void d() {
        Object objA;
        if (this.r) {
            return;
        }
        this.r = true;
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new N4(this, null), 3);
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new R4(this, null), 3);
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new T4(2, null), 3);
        C2621i c2621i = C2621i.a;
        Gc.B0 b0 = C2621i.c().a().b;
        if (b0 == null) {
            Gc.B0.Companion.getClass();
            b0 = Gc.B0.c;
        }
        Gc.A0 a0 = b0.a;
        P3 p3 = this.j;
        if (a0 != null && a0.a && Ad.a0.b.b == a0.b) {
            if (bh.t.r.a.length() == 0) {
                String strP = AbstractC2393b.a.p("key_user_launch_info", BuildConfig.FLAVOR);
                if (strP.length() > 0) {
                    Zf.f fVar = Zf.f.a;
                    try {
                    } catch (Throwable th2) {
                        boolean z = C2978a.a;
                        s3.e.v(strP, th2, "KimiJson", (Throwable) null);
                    }
                    if (strP.length() == 0) {
                        objA = null;
                    } else {
                        kn.t tVar = Zf.f.c;
                        tVar.getClass();
                        objA = tVar.a(vb.N2.j(C2498c.Companion.serializer()), strP);
                    }
                    C2498c c2498c = (C2498c) objA;
                    if (c2498c == null) {
                        c2498c = new C2498c();
                    }
                    bh.t.r = c2498c;
                }
            }
            if (bh.t.r.c == a0.c && !Ad.a0.b.c) {
                Y6.k kVarF = g6.a.f("rate_active", FirebaseAnalytics.Param.METHOD, "msh_notification_show");
                boolean z2 = Jd.c.a;
                kVarF.y(Jd.c.a(false), "enter_from");
                kVarF.y(Jd.c.c.a, "msh_conversation_id");
                s3.e.r(kVarF, "notification_type", "app_rate", "enter_method", "rate_active");
                Intrinsics.checkNotNullParameter("rate_active", "<set-?>");
                Ad.a0.a = "rate_active";
                Ad.a0.b.c = true;
                Mm.E.z(Sf.d.a, (CoroutineContext) null, (Mm.C) null, new Ad.X(2, null), 3);
                p3.u0(C1030w0.a);
            }
        }
        p3.q0(Gf.D.a);
    }
}
