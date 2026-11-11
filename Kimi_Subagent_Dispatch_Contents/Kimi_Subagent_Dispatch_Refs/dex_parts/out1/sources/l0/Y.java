package l0;

import com.bumptech.glide.request.target.Target;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends Xk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1504b0 f21253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1504b0 c1504b0, Xk.c cVar) {
        super(cVar);
        this.f21253b = c1504b0;
    }

    public final Object invokeSuspend(Object obj) {
        this.f21252a = obj;
        this.f21254c |= Target.SIZE_ORIGINAL;
        return C1504b0.e1(this.f21253b, this);
    }
}
