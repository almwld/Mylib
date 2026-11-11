package Pm;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final class Y extends Xk.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ H c;
    public Object d;
    public InterfaceC0351i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(H h, Vk.a aVar) {
        super(aVar);
        this.c = h;
    }

    @Override // Xk.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
