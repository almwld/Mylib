package Cf;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;
import ve.EnumC5129h0;

/* JADX INFO: renamed from: Cf.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C0358p5 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0439y6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358p5(C0439y6 c0439y6, Vk.a aVar) {
        super(2, aVar);
        this.b = c0439y6;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C0358p5 c0358p5 = new C0358p5(this.b, aVar);
        c0358p5.a = obj;
        return c0358p5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((C0309k1) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        C0309k1 c0309k1 = (C0309k1) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        boolean z = c0309k1.a;
        C0439y6 c0439y6 = this.b;
        if (z) {
            Rf.m mVar = C0439y6.s;
            Hd.r.B(c0439y6, BuildConfig.FLAVOR, false, false, 14);
        }
        C4801l c4801l = c0439y6.n;
        EnumC5129h0 enumC5129h0 = EnumC5129h0.b;
        Aj.x2 x2Var = new Aj.x2(z, c0439y6, 2);
        c4801l.getClass();
        Intrinsics.checkNotNullParameter(enumC5129h0, "mode");
        Intrinsics.checkNotNullParameter(x2Var, "resultBlock");
        c4801l.c.u(enumC5129h0, x2Var);
        return Unit.a;
    }
}
