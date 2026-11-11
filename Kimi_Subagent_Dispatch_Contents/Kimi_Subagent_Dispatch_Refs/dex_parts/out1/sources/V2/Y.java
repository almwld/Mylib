package V2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f8317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Throwable th) {
        super(Integer.MAX_VALUE);
        Intrinsics.checkNotNullParameter(th, "finalException");
        this.f8317b = th;
    }
}
