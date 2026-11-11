package ef;

import Cf.P3;
import Mm.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class q extends Xk.i implements Function2 {
    public final /* synthetic */ P3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(P3 p3, Vk.a aVar) {
        super(2, aVar);
        this.a = p3;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new q(this.a, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        Ae.f fVar = Ae.f.a;
        Ae.f.e(this.a.p(), true, false);
        return Unit.a;
    }
}
