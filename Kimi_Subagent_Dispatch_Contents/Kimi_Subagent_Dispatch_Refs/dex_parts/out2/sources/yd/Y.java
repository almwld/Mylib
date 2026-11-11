package yd;

import ah.C2394a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public final /* synthetic */ c1.h1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(c1.h1 h1Var, Vk.a aVar) {
        super(2, aVar);
        this.a = h1Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(this.a, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        Jc.b bVar = bh.t.a;
        C2394a c2394a = (C2394a) this.a.getValue();
        Intrinsics.checkNotNullParameter(c2394a, "size");
        Intrinsics.checkNotNullParameter(c2394a, "<set-?>");
        bh.t.h.setValue(c2394a);
        return Unit.a;
    }
}
