package Cf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class G6 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0439y6 b;
    public final /* synthetic */ C4801l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G6(C0439y6 c0439y6, Vk.a aVar, C4801l c4801l) {
        super(2, aVar);
        this.b = c0439y6;
        this.c = c4801l;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        G6 g6 = new G6(this.b, aVar, this.c);
        g6.a = obj;
        return g6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Mm.B b = (Mm.B) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        this.b.k.e(b, this.c);
        return Unit.a;
    }
}
