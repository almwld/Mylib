package ue;

import Ab.C0021e0;
import Ce.J;
import Cf.A6;
import Dc.C0639v;
import Dm.o;
import Ec.C0723l;
import Mm.C;
import Mm.E;
import Mm.y0;
import P1.f0;
import Pm.h0;
import Pm.n;
import Pm.r0;
import Uc.G2;
import Uc.N0;
import Zd.A;
import Zd.G;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.firebase.encoders.json.BuildConfig;
import dg.C2978a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.collections.P;
import kotlin.collections.z;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qi.C4277e;
import th.r;
import ui.C4858i;
import ve.C5123e0;
import ve.C5147q0;
import ve.C5148r0;
import ve.C5152t0;
import ve.C5154u0;
import ve.C5156v0;
import ve.C5158w0;
import ve.InterfaceC5141n0;
import ve.P0;
import ze.C5885x;
import ze.Q;
import ze.a0;
import ze.b0;

/* JADX INFO: renamed from: ue.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C4801l implements InterfaceC5141n0 {
    public final String a;
    public final C4796g b;
    public final f0 c;
    public final Function2 d;
    public final jk.d e;
    public final G f;
    public final C4795f g;
    public final ArrayList h;
    public final r0 i;
    public final r0 j;
    public final r0 k;
    public final r0 l;
    public final r0 m;
    public final r0 n;
    public J o;
    public boolean p;
    public final o q;
    public final o r;
    public final o s;
    public y0 t;
    public final h0 u;

    public C4801l(C0639v c0639v, String str, C4796g c4796g, List list, Function2 function2, int i) {
        String str2 = (i & 2) != 0 ? BuildConfig.FLAVOR : str;
        byte b = 0;
        C4796g c4796g2 = (i & 4) != 0 ? new C4796g(BuildConfig.FLAVOR, G2.d, false) : c4796g;
        f0 f0Var = new f0(2);
        Function2 rVar = (i & 32) != 0 ? new r(7, b) : function2;
        Intrinsics.checkNotNullParameter(c0639v, "originChat");
        Intrinsics.checkNotNullParameter(str2, "shareId");
        Intrinsics.checkNotNullParameter(c4796g2, "roomConfig");
        Intrinsics.checkNotNullParameter(f0Var, "streamApiImpl");
        Intrinsics.checkNotNullParameter(list, "plugins");
        Intrinsics.checkNotNullParameter(rVar, "onChatReady");
        this.a = str2;
        this.b = c4796g2;
        this.c = f0Var;
        this.d = rVar;
        jk.d dVarA = Sf.d.a("mainScope");
        this.e = dVarA;
        this.f = c4796g2.a() ? G.a : G.b;
        C4795f c4795f = new C4795f(c0639v, this);
        this.g = c4795f;
        this.h = CollectionsKt.j0(z.o(new C4795f[]{c4795f}), list);
        Intrinsics.checkNotNullParameter(this, "impl");
        f0Var.g = new C4277e(1, this, C4801l.class, "onEvent", "onEvent(Lcom/moonshot/kimichat/chat/stream/service/StreamEvent;)V", 0, 7);
        f0Var.h = c4795f;
        f0Var.i = this;
        if (c4796g2.a()) {
            f0Var.k = new C0021e0((N0) f0Var.c, new C5147q0(f0Var, b));
        } else {
            f0Var.k = (C5123e0) f0Var.j;
            if (f0Var.o().length() > 0) {
                E.z(dVarA, (CoroutineContext) null, (C) null, new C5148r0(f0Var, null), 3);
            }
        }
        if (c4796g2.a()) {
            E.z(f0Var.q(), (CoroutineContext) null, (C) null, new C5152t0(f0Var, null), 3);
        } else {
            E.z(f0Var.q(), (CoroutineContext) null, (C) null, new C5154u0(f0Var, null), 3);
        }
        E.z(f0Var.q(), (CoroutineContext) null, (C) null, new C5156v0(f0Var, this, null), 3);
        String str3 = c0639v.d().a;
        if (str3.length() > 0) {
            Rf.k kVar = Rf.k.a;
            Rf.k.b(dVarA, Rf.l.z, true, new Aj.h0(str3, this, (Vk.a) null, 11));
        }
        this.i = n.c(c0639v);
        this.j = n.c(I.a);
        this.k = n.c(P.d());
        this.l = n.c(P.d());
        this.m = n.c(EnumC4802m.a);
        this.n = n.c((Object) null);
        this.p = true;
        this.q = new o(300);
        this.r = new o(ModuleDescriptor.MODULE_VERSION);
        this.s = new o(60000);
        this.u = n.b(0, 0, (Om.c) null, 7);
    }

    @Override // ve.InterfaceC5141n0
    public final void b(A a, Function1 function1) {
        Intrinsics.checkNotNullParameter(a, "sendRequest");
        Intrinsics.checkNotNullParameter(function1, "resultBlock");
        this.c.b(a, function1);
    }

    public final void c(C4858i c4858i) {
        Intrinsics.checkNotNullParameter(c4858i, "resultBlock");
        f0 f0Var = this.c;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(c4858i, "resultBlock");
        E.z(f0Var.q(), (CoroutineContext) null, (C) null, new C5158w0(f0Var, c4858i, null), 3);
    }

    public final void d(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "e");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a(this, a0Var);
        }
        E.z(this.e, (CoroutineContext) null, (C) null, new C4798i(this, a0Var, null), 3);
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "fallbackObjective");
        this.c.x(str);
    }

    public final void f(C0723l c0723l, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "messageId");
        Intrinsics.checkNotNullParameter(c0723l, "interactionReply");
        Intrinsics.checkNotNullParameter(str2, "chatId");
        f0 f0Var = this.c;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(str, "messageId");
        Intrinsics.checkNotNullParameter(c0723l, "interactionReply");
        Intrinsics.checkNotNullParameter(str2, "chatId");
        E.z(f0Var.q(), (CoroutineContext) null, (C) null, new P0(f0Var, str, c0723l, str2, null), 3);
    }

    public final void g(boolean z) {
        if (z != this.p) {
            this.p = z;
            d(new C5885x(z));
            this.c.getClass();
        }
    }

    public final void h(EnumC4802m enumC4802m) {
        Intrinsics.checkNotNullParameter(enumC4802m, "status");
        r0 r0Var = this.m;
        if (enumC4802m != r0Var.getValue()) {
            d(new Q(enumC4802m, (EnumC4802m) r0Var.getValue()));
            r0Var.getClass();
            r0Var.k((Object) null, enumC4802m);
            boolean z = C2978a.a;
            C2978a.a("StreamServiceImpl", null, new A6(enumC4802m, 1));
            if (enumC4802m != EnumC4802m.b) {
                Jd.z.n(Jd.z.a, null, 15);
            }
        }
    }
}
