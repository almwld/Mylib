package Hf;

import Cf.C0237c1;
import ih.C3605b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1178t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1178t0 c1178t0, Vk.a aVar) {
        super(2, aVar);
        this.b = c1178t0;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        Y y = new Y(this.b, aVar);
        y.a = obj;
        return y;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((C0237c1) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        C0237c1 c0237c1 = (C0237c1) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        C3605b c3605b = c0237c1.a;
        List list = c0237c1.b;
        Function2 function2 = c0237c1.c;
        int i = C1178t0.o;
        this.b.H(c3605b, false, false, list, function2);
        return Unit.a;
    }
}
