package io.ktor.utils.io;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes3.dex */
public final class Y implements Mm.B {
    public final I a;
    public final CoroutineContext b;

    public Y(I channel, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.a = channel;
        this.b = coroutineContext;
    }

    @Override // Mm.B
    public final CoroutineContext f() {
        return this.b;
    }
}
