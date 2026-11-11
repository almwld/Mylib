package xi;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ h0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(List list, h0 h0Var, Vk.a aVar) {
        super(2, aVar);
        this.e = list;
        this.f = h0Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(this.e, this.f, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0099 -> B:19:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xi.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
