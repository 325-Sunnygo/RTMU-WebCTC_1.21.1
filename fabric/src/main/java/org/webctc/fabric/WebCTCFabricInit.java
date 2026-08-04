package org.webctc.fabric;

import net.fabricmc.api.ModInitializer;
import org.webctc.WebCTCCore;

/**
 * WebCTC の Fabric 入口。
 *
 * <p>NeoForge では {@code @Mod} の付いたクラスをローダーが生成するが、Fabric には無いので
 * ここで同じものを作る。{@link WebCTCCore} のコンストラクタが
 * {@code NeoForge.EVENT_BUS} (RTMU 本体が持つシムのバス) へ listener を並べるので、
 * <b>これだけで NeoForge 版と同じ配線になる</b>。
 *
 * <p>イベントの発火 (サーバー開始/停止/tick/ブロック破壊/コマンド登録) は
 * RTMU 本体の Fabric 入口が Fabric のコールバックから post している。
 */
public final class WebCTCFabricInit implements ModInitializer {

    @Override
    public void onInitialize() {
        new WebCTCCore();
    }
}
