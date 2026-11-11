package Pi;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1827c0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1827c0 c1827c0, Xk.c cVar) {
        super(cVar);
        this.b = c1827c0;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.K(this);
    }
}
