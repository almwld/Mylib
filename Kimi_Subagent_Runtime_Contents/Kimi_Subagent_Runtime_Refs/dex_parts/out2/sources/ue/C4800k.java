package ue;

import Dc.C0639v;
import Mm.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ue.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C4800k extends Xk.i implements Function2 {
    public final /* synthetic */ C4801l a;
    public final /* synthetic */ C0639v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4800k(C4801l c4801l, C0639v c0639v, Vk.a aVar) {
        super(2, aVar);
        this.a = c4801l;
        this.b = c0639v;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C4800k(this.a, this.b, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        C4801l c4801l = this.a;
        c4801l.d.invoke(c4801l, this.b);
        return Unit.a;
    }
}
