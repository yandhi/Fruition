package me.jackson.fruition.manager.impl;

import me.jackson.fruition.discovery.FeatureDiscoverer;
import me.jackson.fruition.feature.Feature;
import me.jackson.fruition.manager.FeatureManager;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

/**
 * An extremely basic implementation of {@link FeatureManager}.
 *
 * @author Jax
 * Created in Apr 2019
 */
public class BasicFeatureManager implements FeatureManager {

    /**
     * For the basic implementation, we are gonna have features sorted in alphabetical order using {@link TreeMap}.
     */
    private final Map<String, Feature> features = new TreeMap<>();

    /**
     * The main instance of the discovery system for the manager.
     */
    private final FeatureDiscoverer discoverer = new FeatureDiscoverer();

    @Override
    public void register(Feature feature) {
        features.put(feature.getName().toLowerCase(), feature);
    }

    @Override
    public void unregister(Feature feature) {
        features.remove(feature.getName().toLowerCase());
    }

    @Override
    public Optional<Feature> getFeature(String feature) {
        return discoverer.discoverFeature(features, feature);
    }

    @Override
    public Map<String, Feature> getFeatures() {
        return features;
    }

    @Override
    public FeatureDiscoverer getDiscoverer() {
        return discoverer;
    }
}
