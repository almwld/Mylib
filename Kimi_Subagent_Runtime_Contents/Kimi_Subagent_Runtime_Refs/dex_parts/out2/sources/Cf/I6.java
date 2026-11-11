package Cf;

import Ec.C0720i;
import Ec.C0723l;
import com.google.firebase.encoders.json.BuildConfig;
import com.moonshot.kimichat.KimiApplication;
import dg.C2978a;
import je.C3691i0;
import je.C3695k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ub.AbstractC4709r6;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class I6 extends Xk.i implements Function2 {
    public final /* synthetic */ C4801l a;
    public final /* synthetic */ C3695k0 b;
    public final /* synthetic */ C0720i c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6(C4801l c4801l, C3695k0 c3695k0, C0720i c0720i, boolean z, Vk.a aVar) {
        super(2, aVar);
        this.a = c4801l;
        this.b = c3695k0;
        this.c = c0720i;
        this.d = z;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new I6(this.a, this.b, this.c, this.d, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ec.M m;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        KimiApplication kimiApplication = Pf.B.a;
        boolean z = C2978a.a;
        C2978a.a("LBS", null, new aj.H(24));
        C3691i0 c3691i0 = AbstractC4709r6.a;
        String str = this.b.a.a;
        String str2 = this.c.a;
        boolean z2 = this.d;
        if (z2) {
            m = new Ec.M(c3691i0 != null ? c3691i0.b : 0.0d, c3691i0 != null ? c3691i0.a : 0.0d);
        } else {
            m = null;
        }
        this.a.f(new C0723l(str2, null, m, null, null, null, z2 ? null : new Ec.n0(zc.E1.d, 2), 186), str, BuildConfig.FLAVOR);
        return Unit.a;
    }
}
