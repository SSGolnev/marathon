package com.malinskiy.marathon.execution.strategy.impl.sharding

import com.malinskiy.marathon.execution.TestShard
import com.malinskiy.marathon.execution.strategy.ShardingStrategy
import com.malinskiy.marathon.test.Test

class CountShardingStrategy(private val count: Int) : ShardingStrategy {
    override fun createShard(tests: Collection<Test>): TestShard {
        return TestShard(tests.flatMap { test ->
            (0 until count).map { test }
        })
    }
}