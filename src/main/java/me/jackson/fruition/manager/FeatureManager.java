package me.jackson.fruition.manager;

import me.jackson.fruition.discovery.FeatureDiscoverer;
import me.jackson.fruition.feature.Feature;

import java.util.Map;
import java.util.Optional;

/**
 * The outline for all managers of features..
 *
 * @author Jax
 * Created in Apr 2019
 */
public interface FeatureManager {

    /**
     * Adds a feature to the manager.
     *
     * @param feature The feature to be added.
     */
    void register(Feature feature);

    /**
     * Removes a feature from the manager.
     *
     * @param feature The feature to be removed.
     */
    void unregister(Feature feature);

    /**
     * Gives us an instance of the feature utilizing {@link FeatureDiscoverer}.
     *
     * @param feature The feature's name to be found.
     * @return The {@link Optional} instance of the feature discovered.
     */
    Optional<Feature> getFeature(String feature);

    /**
     * @return The collection of features.
     */
    Map<String, Feature> getFeatures();

    /**
     * @return The discovery system for features.
     */
    FeatureDiscoverer getDiscoverer();
}
