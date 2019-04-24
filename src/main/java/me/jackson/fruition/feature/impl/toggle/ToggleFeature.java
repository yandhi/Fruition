package me.jackson.fruition.feature.impl.toggle;

import me.jackson.fruition.feature.AbstractFeature;

/**
 * An implementation of {@link AbstractFeature} that includes {@link Toggle}
 *
 * @author Jax
 * Created in Apr 2019
 */
public class ToggleFeature extends AbstractFeature implements Toggle {

    /**
     * The running state of the feature.
     *
     * <p>
     * When this is true, the feature would be "on" and vice versa.
     * </p>
     */
    private boolean running;

    public ToggleFeature(String name) {
        super(name);
    }

    @Override
    public void toggle() {
        this.running = !running;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
